package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="EmpLast")
public class Employee {

	@Id
	private Integer eid; // findById
	private String ename; // findByEname
	private Double esalary; // findByEsalary
	
	
}
