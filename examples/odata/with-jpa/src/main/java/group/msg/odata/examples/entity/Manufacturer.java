package group.msg.odata.examples.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@Entity
public class Manufacturer {
	@Id
	private int id;

	private String name;

	private Timestamp updated;
}
