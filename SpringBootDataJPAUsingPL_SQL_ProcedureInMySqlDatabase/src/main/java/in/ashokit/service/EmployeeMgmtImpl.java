package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class EmployeeMgmtImpl implements IEmployeeMgmt {

	@Autowired
	private EntityManager manager;
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public List<Employee> showEmployeeBySalaryRange(double start, double end) {
		StoredProcedureQuery query=manager.createStoredProcedureQuery("JPA_EMPLOYEE_DETAILS",Employee.class);
		query.registerStoredProcedureParameter(1,Double.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		
		query.setParameter(1, start);
		query.setParameter(2, end);
		List<Employee> list=query.getResultList();
		return list;
	}

	@Override
	public void createRecords(List<Employee> list) {
		repo.saveAll(list);
		
	}
	
	

}
