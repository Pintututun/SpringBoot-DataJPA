package com.nt.service;

import java.util.List;

import com.nt.document.Employee;

public interface IEmployeeMgmtService {

	public String registerEmployee(Employee emp);
	public String[] registerMultipleEmployees(List<Employee> list);
	public List<Employee> showAllEmployees();
}
