package group.msg.odata.examples.config;

import com.sap.cloud.sdk.service.prov.v2.rt.core.web.EndPointsList;
import com.sap.cloud.sdk.service.prov.v2.rt.core.web.ServletListener;
import com.sap.cloud.sdk.service.prov.v2.web.ServiceInitializer;
import com.sap.gateway.core.odata4sap.ServiceFactory;
import org.apache.olingo.odata2.core.servlet.ODataServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextListener;
import java.util.Collections;

@Configuration
public class ServletConfiguration {

	@Bean
	public ServletContextListener servletListener() {
		return new ServletListener<>();
	}

	@Bean
	public ServletContextListener serviceInitializer() {
		return new ServiceInitializer();
	}

	@Bean
	public ServletRegistrationBean endpointsServlet() {
		ServletRegistrationBean bean = new ServletRegistrationBean(new EndPointsList());
		bean.addUrlMappings("/api/odata/v2/");
		return bean;
	}

	@Bean
	public ServletRegistrationBean odataServlet(ApplicationContext context) {
		ODataInstanceProvider.setContext(context);
		ServletRegistrationBean bean = new ServletRegistrationBean(new ODataServlet());
		bean.setUrlMappings(Collections.singletonList("/api/odata/v2/*"));
		bean.addInitParameter("org.apache.olingo.odata2.service.factory", ServiceFactory.class.getName());
		bean.addInitParameter("org.apache.olingo.odata2.path.split", "1");
		bean.setLoadOnStartup(1);
		return bean;
	}
}
