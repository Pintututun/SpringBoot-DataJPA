package com.nt.runner;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepository;

//@Component
public class RegisteringEmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		 Employee emp1 = new Employee("1", 1001, "John Doe", "New York", 75000.0, true);
	        Employee emp2 = new Employee("2", 1002, "Jane Smith", "Los Angeles", 80000.0, false);
	        Employee emp3 = new Employee("3", 1003, "Robert Brown", "Chicago", 70000.0, true);
	        Employee emp4 = new Employee("4", 1004, "Emily Johnson", "Houston", 68000.0, false);
	        Employee emp5 = new Employee("5", 1005, "Michael Davis", "Phoenix", 72000.0, true);
	        Employee emp6 = new Employee("6", 1006, "Jessica Wilson", "Philadelphia", 76000.0, false);
	        Employee emp7 = new Employee("7", 1007, "David Martinez", "San Antonio", 69000.0, true);
	        Employee emp8 = new Employee("8", 1008, "Sarah Lee", "San Diego", 81000.0, false);
	        Employee emp9 = new Employee("9", 1009, "Daniel Harris", "Dallas", 74000.0, true);
	        Employee emp10 = new Employee("10", 1010, "Laura Clark", "San Jose", 79000.0, false);

	        List<Employee> employees = List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10);
	        List<String> list=repo.saveAll(employees).stream().map(obj->obj.getId()).collect(Collectors.toList());
	        System.out.println("Employees are registerd with the Id values:");
	        list.forEach(id->System.out.println(id+" "));

	}

}
