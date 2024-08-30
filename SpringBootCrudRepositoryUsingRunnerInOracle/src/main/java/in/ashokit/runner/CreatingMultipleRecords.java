package in.ashokit.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmployeeService;

@Component
public class CreatingMultipleRecords implements CommandLineRunner {

	@Autowired
	private EmployeeService service;
	@Override
	public void run(String... args) throws Exception {
		Employee e1=new Employee(101,"Pintu",2000.0);
		Employee e2=new Employee(102,"Satya",1200.0);
		List<Employee> list=Arrays.asList(e1,e2);
		service.createMultipleRecords(list);

	}

}
