package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Employee;

public interface IEmployeeRepository extends MongoRepository<Employee, Integer> {
     
	public List<Employee> findBySalaryBetween(Double start,Double end);
	public List<Employee> findByNameIn(String... names);
	public List<Employee> findBySalaryBetweenAndAddrsInAllIgnoreCase(double start,double end,String... addrs);
	public List<Employee> findByNameStartingWithIgnoreCase(String initChar);
	public List<Employee> findBySalaryGreaterThanEqual(Double salary);
	public List<Object[]> findByNameContaining(String chars);
	public String findByMobileIs(Long mobile);

}
