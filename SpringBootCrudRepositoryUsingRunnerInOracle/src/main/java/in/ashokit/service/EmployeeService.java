package in.ashokit.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public void createSingleRecord(Employee e)
	{
		Employee emp=repo.save(e);
		System.out.println(emp);
	}
	
	public void createMultipleRecords(List<Employee> list)
	{
		 Iterable<Employee> saveAll = repo.saveAll(list);
		 Iterator<Employee> itr=saveAll.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	}
	public void updateById(Employee e)
	{
		Employee emp=repo.save(e);
		System.out.println(emp);
	}
	public void countRecords()
	{
		Long num=repo.count();
		System.out.println("Number of records "+num);
	}
	
	public void deleteSingleRecord(Employee e)
	{
		
		repo.delete(e);
		System.out.println("Deleted successfully");
		
	}
	public void deleteMultipleRecords(List<Employee> list)
	{
		repo.deleteAll(list);
		System.out.println("Deleted Successfully");
	}
	public void deleteAllRecords()
	{
		repo.deleteAll();
		System.out.println("Deleted Successfully");
	}
	public void deleteById(Integer id)
	{
		repo.deleteById(id);
		System.out.println("Deleted Successfully");
		
	}
	public void deleteByIds(List<Integer> list)
	{
		repo.deleteAllById(list);
		System.out.println("Deleted Successfully");
	}
	public void showAllRecords()
	{
		Iterable<Employee> allRecords = repo.findAll();
		Iterator<Employee> itr=allRecords.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	public void showRecordById(Integer id)
	{
		Optional<Employee> emp = repo.findById(id);
		if (emp.isPresent()) {
			Employee employee = emp.get();
			System.out.println(employee);
		} else {
			System.out.println("Record Not Found");
		}
	}
	public void showRecordsByIds(List<Integer> list)
	{
		Iterable<Employee> emps = repo.findAllById(list);
		emps.forEach(e->System.out.println(e));
	}
}
