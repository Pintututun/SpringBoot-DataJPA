package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;



@Entity
@Table(name="EmpLast")
public class Employee {

	@Id
	private Integer eid; // findById
	private String ename; // findByEname
	private Double esalary; // findByEsalary
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

		public Employee(Integer eid, String ename, Double esalary) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.esalary = esalary;
		}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getEsalary() {
		return esalary;
	}

	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
    


}
