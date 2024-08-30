package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.service.EmployeeService;

@Component
public class CountRecords implements CommandLineRunner {

	@Autowired
	private EmployeeService service;
	@Override
	public void run(String... args) throws Exception {
		service.countRecords();
	}

}
