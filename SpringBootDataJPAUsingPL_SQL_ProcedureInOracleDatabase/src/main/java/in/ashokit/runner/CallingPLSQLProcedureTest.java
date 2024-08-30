package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.service.EmployeeMgmtImpl;

@Component
public class CallingPLSQLProcedureTest implements CommandLineRunner {

	@Autowired
	private EmployeeMgmtImpl service;
	@Override
	public void run(String... args) throws Exception {
		service.showEmployeeBySalaryRange(50000.0, 70000.0).forEach(System.out::println);

	}

}
