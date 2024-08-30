package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmployeeService;

@Component
public class DeletingARecordByInstanceVariable implements CommandLineRunner {

	@Autowired
	private EmployeeService service;
	@Override
	public void run(String... args) throws Exception {
		Employee e1=new Employee(101,"Pintu",2000.0);
		service.deleteSingleRecord(e1);
		service.createSingleRecord(e1);
		System.out.println("Again creating the record");

	}

}
