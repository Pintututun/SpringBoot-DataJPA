package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService{

	@Autowired
	private IEmployeeRepository repo;
	
	@Override
	public String[] registerMultipleEmployee(List<Employee> list) {
         List<Employee> emps=repo.saveAll(list);
         String idVal[]=new String[emps.size()];
         for(int i=0;i<idVal.length;i++)
        	 idVal[i]=emps.get(i).getId();
		return idVal;
	}
	
	@Override
	public List<Employee> sortEmployeeByEname(boolean order, String... properties) {
		 
		Sort sort=Sort.by(order?Direction.ASC:Direction.DESC,properties);
		List<Employee> list=repo.findAll(sort);
		return list;
	}

	@Override
	public List<Employee> sortEmployeeByExampleData(Employee emp, boolean order, String... properties) {
		Example<Employee> ex=Example.of(emp);
		Sort sort=Sort.by(order?Direction.ASC:Direction.DESC,properties);
		List<Employee> list=repo.findAll(ex, sort);
		return list;
	}

	@Override
	public Page<Employee> showEmployeeByPageNumber(int pageNo, int pageSize) {
		// create Pageable object
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		// get given Page records
		Page<Employee> page=repo.findAll(pageable);
			return page;
	}

	@Override
	public void showEmployeePageInSorting(int pageNo, int pageSize, boolean order, String... properties) {
		Sort sort=Sort.by(order?Direction.ASC:Direction.DESC, properties);
		Pageable pageable=PageRequest.of(pageNo, pageSize, sort);
		Page<Employee> page=repo.findAll(pageable);
		List<Employee> list=page.getContent();
		list.forEach(System.out::println);
		
	}

}
