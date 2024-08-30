package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Customer;

public interface IOToMOperationService {

	public void saveDataUsingCustomer();
	
	public void saveDataUsingMultipleCustomers();
	
	public void saveDataUsingCustomerRemovingCascadeTpe();
	
	public void saveDataUsingPhoneNumber();
	
	public void saveDataUsingMultiplePhoneNumbers();
	
	public void getDataUsingCustomer();
	
	public void getDataUsingCustomerButEagerLoading();
	
	public void getDataUsingCustomerButLazyLoading();
	
	public void getDataUsingPhoneNumber();
	
	public void getDataUsingPhoneNumberButEagerLoading();
	
	public void getDataUsingPhoneNumberButLazyLoading();
	
	public void deleteDataUsingCustomer(int id);
}
