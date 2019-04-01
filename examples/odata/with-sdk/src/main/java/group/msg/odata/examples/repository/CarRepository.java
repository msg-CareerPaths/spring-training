package group.msg.odata.examples.repository;

import group.msg.odata.examples.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
