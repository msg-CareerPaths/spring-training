package group.msg.odata.examples.service;

import org.apache.olingo.odata2.api.ODataService;
import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.api.edm.provider.EdmProvider;
import org.apache.olingo.odata2.api.exception.ODataException;
import org.apache.olingo.odata2.api.processor.ODataContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExampleServiceFactory extends ODataServiceFactory {
	private final EdmProvider edmProvider;

	@Autowired
	public ExampleServiceFactory(EdmProvider edmProvider) {
		this.edmProvider = edmProvider;
	}

	@Override
	public ODataService createService(ODataContext ctx) throws ODataException {
		return createODataSingleProcessorService(edmProvider, new ExampleProcessor());
	}
}
