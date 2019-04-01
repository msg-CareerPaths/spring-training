package group.msg.odata.examples.odata;

import com.sap.cloud.sdk.service.prov.api.operations.*;
import com.sap.cloud.sdk.service.prov.api.request.*;
import com.sap.cloud.sdk.service.prov.api.response.*;
import group.msg.odata.examples.entity.Car;
import group.msg.odata.examples.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@RequiredArgsConstructor
public class CarODataController {
	private final CarRepository repository;

	@Read(serviceName = "DemoService", entity = "Cars")
	public ReadResponse read(ReadRequest request) {
		Car car = repository.findById((Integer) request.getKeys().get("id")).orElse(null);
		if (car != null) {
			return ReadResponse.setSuccess().setData(car).response();
		} else {
			return ReadResponse.setError(ErrorResponse.getBuilder().setStatusCode(404).response());
		}
	}

	@Query(serviceName = "DemoService", entity = "Cars")
	public QueryResponse query(QueryRequest request) {
		return QueryResponse.setSuccess().setData(repository.findAll()).response();
	}

	@Create(serviceName = "DemoService", entity = "Cars")
	public CreateResponse create(CreateRequest request) {
		Car car = repository.save(request.getDataAs(Car.class));
		return CreateResponse.setSuccess().setData(car).response();
	}

	@Update(serviceName = "DemoService", entity = "Cars")
	public UpdateResponse update(UpdateRequest request) {
		Car car = repository.findById((Integer) request.getKeys().get("id")).orElse(null);
		if (car != null) {
			car.setModel((String) request.getMapData().get("name"));
			return UpdateResponse.setSuccess().response();
		} else {
			return UpdateResponse.setError(ErrorResponse.getBuilder().setStatusCode(404).response());
		}
	}

	@Delete(serviceName = "DemoService", entity = "Cars")
	public DeleteResponse delete(DeleteRequest request) {
		repository.deleteById((Integer) request.getKeys().get("id"));
		return DeleteResponse.setSuccess().response();
	}
}
