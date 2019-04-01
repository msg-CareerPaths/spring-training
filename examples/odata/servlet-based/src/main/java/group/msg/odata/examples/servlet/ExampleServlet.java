package group.msg.odata.examples.servlet;

import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.core.servlet.ODataServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
class ExampleServlet extends ODataServlet {
	private transient final ODataServiceFactory factory;

	@Autowired
	public ExampleServlet(ODataServiceFactory factory) {
		this.factory = factory;
	}

	@Override
	protected ODataServiceFactory getServiceFactory(HttpServletRequest request) {
		return factory;
	}
}
