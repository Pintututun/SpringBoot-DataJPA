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

	@Override
	public List<Employee> findEmpsBySalaryInRange(Double start, Double end) {

         List<Employee> emps=repo.findBySalaryBetween(start, end);
		return emps;
	}

	@Override
	public List<Employee> showEmpsDetailsHavingNames(String... names) {

         List<Employee> emps=repo.findByNameIn(names);
		return emps;
	}

	@Override
	public void displayEmpsWhoseSalaryInRangeAndHavingAddrs(Double start, Double end, String... strings) {
            
	   repo.findBySalaryBetweenAndAddrsInAllIgnoreCase(start,end,strings).forEach(System.out::println);;
	   
        
	}

	@Override
	public void showAllEmps() {
		repo.findAll().forEach(System.out::println);
		
	}

	@Override
	public void displayAllEmpsWhoseNamesStartsWith(String initChar) {

        repo.findByNameStartingWithIgnoreCase(initChar).forEach(System.out::println);
		
	}

	@Override
	public void displayAllEmpsWhoseSalaryGreaterThanEqual(Double salary) {

         repo.findBySalaryGreaterThanEqual(salary).forEach(System.out::println);
		
	}

	@Override
	public void displayAllEmpsWhoseNamesHavingLetters(String chars) {
		List<Object[]> list=repo.findByNameContaining(chars);
		list.forEach(emp->{
			for(Object property:emp)
			{
				System.out.println(property);
			}
		});
		
	}

	@Override
	public void displayNameWhoseMobileNoIs(Long mobile) {
       String name=repo.findByMobileIs(mobile);
       System.out.println(name);
	}

}
