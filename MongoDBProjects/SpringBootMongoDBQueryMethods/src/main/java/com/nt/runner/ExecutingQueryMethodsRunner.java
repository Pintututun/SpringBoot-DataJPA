package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IEmployeeRepository;

@Component
public class ExecutingQueryMethodsRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

       // repo.getEmpsDataByAddrs("New York").forEach(arr->System.out.println(Arrays.toString(arr)));
       // repo.getEmpsFullDataByAddrs("New York").forEach(emp->System.out.println(emp));
       // repo.getEmpsFullDataByNameAndAddrs("John Doe","New York").forEach(emp->System.out.println(emp));
	   // repo.getEmpsFullDataByNameOrAddrs("Robert Brown","New York").forEach(emp->System.out.println(emp));
	   // repo.getEmpsDataBySalary(65000.0,75000.0 ).forEach(emp->System.out.println(Arrays.toString(emp)));
	   //  repo.getEmpsFullDataByEnameThatContainChars("D").forEach(emp->System.out.println(emp));
	   //  repo.getEmpsFullDataByEnameThatContainCharsIgnoringCase("d").forEach(emp->System.out.println(emp));
	   //  repo.getEmpsFullDataByAddrs("Dallas","San Jose","San Diego").forEach(emp->System.out.println(emp));
	   // System.out.println(repo.getEmpsCountBySalaryRange(65000.0, 75000.0));
		//  repo.getEmpsByNameSortingInAscendingOrder().forEach(emp->System.out.println(emp));
		//repo.getEmpsByNameSortingInDescendingOrder().forEach(emp->System.out.println(emp));
		//System.out.println(repo.deleteEmployeesWithAddrs("New York"));
		System.out.println(repo.isEmpsFoundBySalaryRange(60000.0, 65000.0));
	}

}
