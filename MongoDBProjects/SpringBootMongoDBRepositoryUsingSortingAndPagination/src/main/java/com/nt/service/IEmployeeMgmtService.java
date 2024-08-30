package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nt.document.Employee;

public interface IEmployeeMgmtService  {

	public String[] registerMultipleEmployee(List<Employee> list);
	public List<Employee> sortEmployeeByEname(boolean order,String... properties);
	public List<Employee> sortEmployeeByExampleData(Employee emp,boolean order,String... properties);
	public Page<Employee> showEmployeeByPageNumber(int pageNo,int pageSize);
	public void showEmployeePageInSorting(int pageNo, int pageSize, boolean order, String... properties );
}
