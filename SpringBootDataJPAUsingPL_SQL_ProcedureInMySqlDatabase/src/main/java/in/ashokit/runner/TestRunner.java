package in.ashokit.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.*;
import in.ashokit.service.IEmployeeMgmt;

//@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmt service;
	@Override
	public void run(String... args) throws Exception {
		Employee emp1 = new Employee("Alice", "Developer", 75000.0);
        Employee emp2 = new Employee("Bob", "Manager", 85000.0);
        Employee emp3 = new Employee("Charlie", "Analyst", 65000.0);
        Employee emp4 = new Employee("David", "Developer", 72000.0);
        Employee emp5 = new Employee("Eva", "Manager", 88000.0);
        Employee emp6 = new Employee("Frank", "Analyst", 63000.0);
        Employee emp7 = new Employee("Grace", "Developer", 71000.0);
        Employee emp8 = new Employee("Hank", "Manager", 87000.0);
        Employee emp9 = new Employee("Ivy", "Analyst", 64000.0);
        Employee emp10 = new Employee("Jack", "Developer", 70000.0);
        Employee emp11 = new Employee("Kara", "Manager", 89000.0);
        Employee emp12 = new Employee("Leo", "Analyst", 62000.0);
        Employee emp13 = new Employee("Mia", "Developer", 74000.0);
        Employee emp14 = new Employee("Nina", "Manager", 86000.0);
        Employee emp15 = new Employee("Oscar", "Analyst", 67000.0);
        Employee emp16 = new Employee("Paul", "Developer", 73000.0);
        Employee emp17 = new Employee("Quinn", "Manager", 84000.0);
        Employee emp18 = new Employee("Rick", "Analyst", 68000.0);
        Employee emp19 = new Employee("Sara", "Developer", 76000.0);
        Employee emp20 = new Employee("Tom", "Manager", 83000.0);
        
        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, 
                emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20);
        
		service.createRecords(employees);
	}

}
