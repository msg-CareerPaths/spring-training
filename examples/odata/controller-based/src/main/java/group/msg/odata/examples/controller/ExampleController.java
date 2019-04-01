package group.msg.odata.examples.controller;

import org.apache.olingo.odata2.api.ODataService;
import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.api.commons.HttpHeaders;
import org.apache.olingo.odata2.api.commons.ODataHttpMethod;
import org.apache.olingo.odata2.api.exception.*;
import org.apache.olingo.odata2.api.processor.ODataContext;
import org.apache.olingo.odata2.api.processor.ODataRequest;
import org.apache.olingo.odata2.api.processor.ODataResponse;
import org.apache.olingo.odata2.api.uri.PathInfo;
import org.apache.olingo.odata2.core.ODataContextImpl;
import org.apache.olingo.odata2.core.ODataPathSegmentImpl;
import org.apache.olingo.odata2.core.ODataRequestHandler;
import org.apache.olingo.odata2.core.PathInfoImpl;
import org.apache.olingo.odata2.core.servlet.ODataExceptionWrapper;
import org.apache.olingo.odata2.core.servlet.RestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

@RestController
public class ExampleController {
	private static final String BASE_PATH = "/odata";
	private final ODataServiceFactory factory;

	@Autowired
	public ExampleController(ODataServiceFactory factory) {
		this.factory = factory;
	}

	@RequestMapping(BASE_PATH + "/**")
	public void execute(HttpServletRequest req, HttpServletResponse res) throws IOException {
		try {
			ODataRequest odataRequest = ODataRequest.method(ODataHttpMethod.valueOf(req.getMethod()))
						.httpMethod(req.getMethod())
						.contentType(RestUtil.extractRequestContentType(req.getContentType()).toContentTypeString())
						.acceptHeaders(RestUtil.extractAcceptHeaders(req.getHeader(HttpHeaders.ACCEPT)))
						.acceptableLanguages(RestUtil
								.extractAcceptableLanguage(req.getHeader(HttpHeaders.ACCEPT_LANGUAGE)))
						.pathInfo(buildODataPathInfo(req))
						.allQueryParameters(RestUtil.extractAllQueryParameters(req.getQueryString()))
						.requestHeaders(RestUtil.extractHeaders(req))
						.body(req.getInputStream())
						.build();

			ODataContextImpl context = new ODataContextImpl(odataRequest, factory);
			context.setParameter(ODataContext.HTTP_SERVLET_REQUEST_OBJECT, req);

			ODataService service = factory.createService(context);
			context.setService(service);
			service.getProcessor().setContext(context);

			ODataRequestHandler requestHandler = new ODataRequestHandler(factory, service, context);
			ODataResponse odataResponse = requestHandler.handle(odataRequest);
			createResponse(res, odataResponse, "HEAD".equals(req.getMethod()));
		} catch(IllegalArgumentException e) {
			Exception odataException = new ODataBadRequestException(ODataBadRequestException.INVALID_REQUEST, e);
			ODataExceptionWrapper wrapper = new ODataExceptionWrapper(req, factory);
			createResponse(res, wrapper.wrapInExceptionResponse(odataException), false);
		}
		catch (Exception e) {
			ODataExceptionWrapper wrapper = new ODataExceptionWrapper(req, factory);
			createResponse(res, wrapper.wrapInExceptionResponse(e), false);
		}
	}

	private void createResponse(HttpServletResponse resp, ODataResponse response, boolean omitBody) throws IOException {
		resp.setStatus(response.getStatus().getStatusCode());
		resp.setContentType(response.getContentHeader());
		for (String headerName : response.getHeaderNames()) {
			resp.setHeader(headerName, response.getHeader(headerName));
		}

		Object entity = response.getEntity();
		if (!omitBody && entity != null) {
			if (entity instanceof InputStream) {
				resp.setContentLength(StreamUtils.copy((InputStream)entity, resp.getOutputStream()));
			} else if (entity instanceof String) {
				byte[] bytes = ((String)entity).getBytes(Charset.forName("utf-8"));
				StreamUtils.copy(bytes, resp.getOutputStream());
				resp.setContentLength(bytes.length);
			} else {
				throw new IOException("Illegal entity object in ODataResponse of type '" + entity.getClass() + "'.");
			}
		}
	}

	private PathInfo buildODataPathInfo(final HttpServletRequest req) throws ODataException {
		PathInfoImpl pathInfo = new PathInfoImpl();
		String path = req.getRequestURI().substring(BASE_PATH.length() + req.getContextPath().length());
		if (path.contains(";")) {
			throw new ODataNotFoundException(ODataNotFoundException.MATRIX);
		}
		pathInfo.setODataPathSegment(Arrays.stream(path.split("/", -1))
				.filter(s -> !StringUtils.isEmpty(s))
				.map(s -> new ODataPathSegmentImpl(s, null))
				.collect(Collectors.toList()));
		pathInfo.setPrecedingPathSegment(Collections.emptyList());
		pathInfo.setServiceRoot(buildBaseUri(req));
		pathInfo.setRequestUri(buildRequestUri(req));
		return pathInfo;
	}

	private URI buildBaseUri(HttpServletRequest req) throws ODataException {
		try {
			String uri = req.getContextPath() + (BASE_PATH.endsWith("/") ? BASE_PATH : (BASE_PATH + "/"));
			return new URI(req.getScheme(), null, req.getServerName(), req.getServerPort(), uri, null, null);
		} catch (final URISyntaxException e) {
			throw new ODataException(e);
		}
	}

	private URI buildRequestUri(HttpServletRequest req) throws ODataException {
		try {
			return new URI(req.getRequestURL() +
					(StringUtils.isEmpty(req.getQueryString()) ? "" : ("?" + req.getQueryString())));
		} catch (final URISyntaxException e) {
			throw new ODataException(e);
		}
	}

}
