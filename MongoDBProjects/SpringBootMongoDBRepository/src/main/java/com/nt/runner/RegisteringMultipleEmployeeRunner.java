package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

//@Component
public class RegisteringMultipleEmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {

		try {
			 Employee emp1=new Employee();
			 emp1.setEno(1002); emp1.setVaccinated(true); emp1.setEname("ramesh");
			 Employee emp2=new Employee(1003, "suresh", "vizag", 888998.0, true);
			 String idVal[]=service.registerEmployees(List.of(emp1, emp2));
			 System.out.println("saved docs id Values are ::"+Arrays.toString(idVal));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
