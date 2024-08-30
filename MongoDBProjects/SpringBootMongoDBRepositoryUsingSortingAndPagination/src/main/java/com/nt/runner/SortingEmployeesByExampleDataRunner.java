package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

//@Component
public class SortingEmployeesByExampleDataRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		
        Employee emp=new Employee();
        emp.setSalary(56000.0);
        emp.setAddrs("707 Willow St");
        List<Employee> list=service.sortEmployeeByExampleData(emp, false,"name");
        list.forEach(em->System.out.println(em));
	}

}
