package com.nt.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.nt.document.Employee;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private MongoTemplate template;
	
	@Override
	public String registerEmployeeUsingSave(Employee emp) {
		 String idVal=template.save(emp).getId();
		return "Employee is registered with the id:"+idVal;
         
	}
	
	@Override
	public String registerEmployeeUsingInsert(Employee emp) {
		String idVal=template.insert(emp,"Employee_Template").getId();
		return "Employee is registered with the id:"+idVal;
	}

	@Override
	public String registerBatchEmployeesUsingSaveAll(List<Employee> list) {
        return "Employees are not registered because in MpngoTemplate saveAll method not available :\n";
	}
	
	@Override
	public String registerBatchEmployeesUsingInsertAll(List<Employee> list) {
        List<String> ids=template.insertAll(list).stream().map(emp->emp.getId()).collect(Collectors.toList());
        String idVal=String.join(", ", ids);  
		return "Employees are registered with id values :\n"+idVal;
	}

	@Override
	public List<Employee> findEmployeesBySalaryRange(double start, double end) {
		Query query=new Query();
		query.addCriteria(Criteria.where("salary").gte(start).lte(end));
		List<Employee> list=template.find(query, Employee.class);
		return list;
	}

	@Override
	public List<Employee> findEmployeesByAddrs(String addrs) {
		Query query=new Query();
		query.addCriteria(Criteria.where("eadd").is(addrs));
		List<Employee> list=template.find(query, Employee.class);
		return list;
	}

	@Override
	public Employee findEmployeeById(String id) {
		
		return template.findById(id, Employee.class);
	}

	@Override
	public List<Employee> findEmployeesByAddrsAndSalaryRange(double start, double end, String... addrs) {
		Query query=new Query();
		query.addCriteria(Criteria.where("eadd").in(addrs).and("salary").gte(start).lte(end));
		return template.find(query, Employee.class);
	}

	@Override
	public String findAndUpdateEmpDataByEno(int eno, String newAddrs, double newSalary) {
		Query query=new Query();
		query.addCriteria(Criteria.where("eno").is(eno));
		
		Update update=new Update();
		update.set("eadd", newAddrs);
		update.set("salary", newSalary);
		
		Employee emp=template.findAndModify(query, update, Employee.class);
		return emp==null?"Employee not found":"Employee found and updated"+emp;
	}

	@Override
	public String findAndUpdateEmpDataBySalaryRange(double start, double end, String newAddrs) {
		Query query=new Query();
		query.addCriteria(Criteria.where("salary").gte(start).lte(end));
		Update update=new Update();
		update.set("eadd", newAddrs);
		UpdateResult result=template.updateMulti(query, update, Employee.class);
		return result.getModifiedCount()+" documents are updated";
	}

	@Override
	public String saveOrUpdateEmpDataByEno(int eno, String newAddrs, double newSalary) {
		Query query=new Query();
		query.addCriteria(Criteria.where("eno").is(eno));
		
		Update update=new Update();
		update.set("eadd",newAddrs );
		update.set("salary", newSalary);
		update.setOnInsert("isVaccinated", true);
		update.setOnInsert("ename", "Bond");
		update.setOnInsert("eno", eno);
		//save or update the doc
		 UpdateResult result=template.upsert(query, update, Employee.class);
		  if(result.getModifiedCount()==0)
			     return "Doc is inserted";
		  else
			  return "Doc is Updated";
	}

	@Override
	public String deleteEmployeeDataByEno(int eno) {

         Query query=new Query();
         query.addCriteria(Criteria.where("eno").is(eno));
         DeleteResult result = template.remove(query, Employee.class);
		if(result.getDeletedCount()==0)
		{
			return "Employee number not found";
		}
		else
		{
			return "Employee number found and deleted";
		}
	}

	

}
