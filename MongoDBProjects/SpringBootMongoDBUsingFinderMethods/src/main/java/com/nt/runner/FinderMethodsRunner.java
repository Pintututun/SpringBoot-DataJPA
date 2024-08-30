package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.service.IEmployeeMgmtService;

@Component
public class FinderMethodsRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		//service.findEmpsBySalaryInRange(40000.0, 55000.0).forEach(System.out::println);
        //service.showEmpsDetailsHavingNames("John Doe","Jill White","Emily Davis").forEach(System.out::println);
        //service.displayEmpsWhoseSalaryInRangeAndHavingAddrs(40000.0, 55000.0, "123 Elm St","101 Maple St");
		//service.showAllEmps();
		//service.displayAllEmpsWhoseNamesStartsWith("j");
		//service.displayAllEmpsWhoseSalaryGreaterThanEqual(50000.0);
		//service.displayAllEmpsWhoseNamesHavingLetters("an");
		service.displayNameWhoseMobileNoIs(2345678901L);
	}

}
