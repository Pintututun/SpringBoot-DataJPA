package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepository repo;
	
	@Override
	public String registerEmployee(Employee emp) {

        String id=repo.save(emp).getId();
		return id;
	}

	@Override
	public String[] registerMultipleEmployees(List<Employee> list) {
		List<Employee> emps=repo.saveAll(list);
		String[] ids=new String[emps.size()];
		for(int i=0;i<ids.length;i++)
		ids[i]=emps.get(i).getId();
		
		return ids;
	}

	@Override
	public List<Employee> showAllEmployees() {
		return repo.findAll();
	}

}
