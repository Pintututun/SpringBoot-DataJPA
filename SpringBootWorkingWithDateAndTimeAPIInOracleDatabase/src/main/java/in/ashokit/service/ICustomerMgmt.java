package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Customer;

public interface ICustomerMgmt {

	public String registerCustomer(List<Customer> list);
	public List<Customer> getAllCustomers();
}
