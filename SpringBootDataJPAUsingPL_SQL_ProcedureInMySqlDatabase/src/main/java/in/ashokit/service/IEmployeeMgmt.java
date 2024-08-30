package in.ashokit.service;

import java.util.List;
import in.ashokit.entity.Employee;

public interface IEmployeeMgmt {

	public List<Employee> showEmployeeBySalaryRange(double start,double end);
	
	public void createRecords(List<Employee> list);
}
