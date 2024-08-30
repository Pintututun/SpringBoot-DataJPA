package in.ashokit.service;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Customer;
import in.ashokit.repo.CustomerRepository;

@Service
public class CustomerMgmtImpl implements ICustomerMgmt {

	@Autowired
	private CustomerRepository repo;
	
	@Override
	public String registerCustomer(List<Customer> list) {
	List<Integer> record=repo.saveAll(list).stream().map(obj->obj.getCid()).collect(Collectors.toList());
	String ids=record.stream().map(item->String.valueOf(item)).collect(Collectors.joining(", "));
		return "Customers are saved with id values\n"+ids;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

}
