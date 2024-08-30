package in.ashokit.service;

import java.util.List;
import in.ashokit.entity.Employee;

public interface IEmployeeMgmt {

	void createRecords(Iterable<Employee> list);
	void showPageByNumbeer(int pageNo,int pageSize);
}
