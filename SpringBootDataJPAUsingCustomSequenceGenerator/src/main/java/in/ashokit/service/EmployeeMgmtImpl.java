package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@Service
public class EmployeeMgmtImpl implements IEmployeeMgmt {

	@Autowired
	private EmployeeRepository rep;
	@Override
	public void createRecords(Iterable<Employee> list) {
      rep.saveAll(list);
	}
	@Override
	public void showPageByNumbeer(int pageNo, int pageSize) {
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		Page<Employee> page=rep.findAll(pageable);
		List<Employee> list=page.getContent();
		list.forEach(System.out::println);
		
	}

}
