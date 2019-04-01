package group.msg.odata.examples.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Car {
	@Id
	private int id;

	private String model;
}
