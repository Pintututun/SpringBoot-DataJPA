package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@Service
public class EmployeeMgmtImpl implements IEmployeeMgmt {

	@Autowired
	private EmployeeRepository rep;
	
	@Override
	public String insertDoctor(String name, String job, Double income) {
		int count=rep.registerEmployee(name, job, income);
		return count==0?"Employee not registered":"Employee is registered successfully";
	}

	@Override
	public String displaySystemDate() {
		return rep.showSystemDate();
	}

	@Override
	public String createTempDBTable() {
		int count=rep.createTempTable();
		return count==0?"Table is created":"Table is not created" ;
	}

}
