package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmployeeService;

@Component
public class UpdateARecordById implements CommandLineRunner {

	@Autowired
	private EmployeeService service;
	@Override
	public void run(String... args) throws Exception {
		Employee e3=new Employee(101,"Priya",2000.0);
		service.updateById(e3);

	}

}
