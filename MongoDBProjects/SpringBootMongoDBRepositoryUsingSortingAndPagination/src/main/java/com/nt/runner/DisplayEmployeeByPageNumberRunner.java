package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

//@Component
public class DisplayEmployeeByPageNumberRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
        
       Page<Employee> page=service.showEmployeeByPageNumber(0, 2);
       System.out.println("Current Page Number: " + page.getNumber());
       page.getContent().forEach(emp->System.out.println(emp));
       System.out.println("Total Elements: " + page.getTotalElements());
       System.out.println("Total Pages: " + page.getTotalPages());
       System.out.println("Current Page Size: " + page.getSize());
	}

}
