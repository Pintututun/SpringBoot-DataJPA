package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepository repo;
	
	@Override
	public void registerEmployee(List<Employee> list) {
        List<Employee> emps=repo.insert(list);
        String[] ids=new String[emps.size()];
        for(int i=0;i<ids.length;i++)
        	ids[i]=String.valueOf(emps.get(i).getId());
        System.out.println("Employees are registerd with the id values");
        for(String id:ids)
        	System.out.print(id+",");
	}

}
