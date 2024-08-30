package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

//@Component
public class RegisteringMultipleEmployeesRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {

		try {
		   

		    Properties props2 = new Properties();
		    props2.put("voterId", "64564564");
		    props2.put("aadharId", "645645646");
		    Employee emp2 = new Employee(1002, "Sita", "Delhi", 85000.0, new String[]{"blue", "yellow", "white"},
		            List.of("Laxmi", "Mohan", "Geeta"),
		            Set.of(6666666L, 5555555L, 4444444L),
		            props2,
		            Map.of(5678, "Saral Jeevan", 7890, "Jeevan Anand"));

		    Properties props3 = new Properties();
		    props3.put("voterId", "76547654");
		    props3.put("aadharId", "876587658");
		    Employee emp3 = new Employee(1003, "Gopal", "Mumbai", 78000.0, new String[]{"purple", "orange", "pink"},
		            List.of("Vikas", "Neha", "Raj"),
		            Set.of(3333333L, 2222222L, 1111111L),
		            props3,
		            Map.of(3456, "Life Secure", 5678, "Secure Future"));

		    Properties props4 = new Properties();
		    props4.put("voterId", "98769876");
		    props4.put("aadharId", "19871987");
		    Employee emp4 = new Employee(1004, "Lakshmi", "Chennai", 92000.0, new String[]{"brown", "gray", "maroon"},
		            List.of("Mani", "Radha", "Sudha"),
		            Set.of(4444444L, 3333333L, 2222222L),
		            props4,
		            Map.of(1234, "Wealth Builder", 3456, "Health Guard"));

		    Properties props5 = new Properties();
		    props5.put("voterId", "34563456");
		    props5.put("aadharId", "23452345");
		    Employee emp5 = new Employee(1005, "Krishna", "Bangalore", 88000.0, new String[]{"cyan", "magenta", "teal"},
		            List.of("Anil", "Sunil", "Pooja"),
		            Set.of(7777777L, 6666666L, 5555555L),
		            props5,
		            Map.of(5678, "Future Plus", 7890, "Life Shield"));

		    List<Employee> employees = List.of( emp2, emp3, emp4, emp5);
            String[] ids=service.registerMultipleEmployees(employees);
            System.out.println("Employees are registered with id values:");
            for(String id:ids)
            	System.out.print(id+" ");
		    

		} catch (Exception e) {
		    e.printStackTrace();
		}

	}

}
