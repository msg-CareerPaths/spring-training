package group.msg.odata.examples.config;

import com.sap.cloud.sdk.service.prov.api.internal.InstanceProvider;
import org.springframework.context.ApplicationContext;

public class ODataInstanceProvider implements InstanceProvider {

	private static ApplicationContext context;

	@Override
	public Object getInstance(Class clazz) {
		return context.getBean(clazz);
	}

	static void setContext(ApplicationContext context) {
		ODataInstanceProvider.context = context;
	}
}
