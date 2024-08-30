package in.ashokit.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Customer;
import in.ashokit.entity.PhoneNumber;
import in.ashokit.repository.ICustomerRepository;
import in.ashokit.repository.IPhoneNumberRepository;

@Service
public class OToMOperationServiceImpl implements IOToMOperationService {

	@Autowired
	private ICustomerRepository custRepo;
	
	@Autowired
	private IPhoneNumberRepository phoneRepo;
	
	@Override
	public void saveDataUsingCustomer() {
		
        Customer cust=new Customer("Raja","Hyd");
        PhoneNumber ph1=new PhoneNumber(9999999999L,"Office" ,"Airtel");
        PhoneNumber ph2=new PhoneNumber(9898987766L,"Home", "Jio");
        
        Set<PhoneNumber> phonesSet=new HashSet<PhoneNumber>();
        phonesSet.add(ph1);
        phonesSet.add(ph2);
        ph1.setCustomer(cust);
        ph2.setCustomer(cust);
        
        cust.setPhones(phonesSet);
        
        //Save Data Using Parent Objects
        int idVal=custRepo.save(cust).getCid();
        
        System.out.println("Customer object and their objects are saved with the id value:"+idVal);
	}

	@Override
	public void saveDataUsingMultipleCustomers() {
		
		// Customer 2
	    Customer cust2 = new Customer("Rani", "Bangalore");
	    PhoneNumber ph2_1 = new PhoneNumber(8888888888L, "Office", "Vodafone");
	    PhoneNumber ph2_2 = new PhoneNumber(7777777777L, "Home", "BSNL");
	    Set<PhoneNumber> phonesSet2 = new HashSet<>();
	    ph2_1.setCustomer(cust2);
	    ph2_2.setCustomer(cust2);
	    phonesSet2.add(ph2_1);
	    phonesSet2.add(ph2_2);
	    cust2.setPhones(phonesSet2);

	    // Customer 3
	    Customer cust3 = new Customer("John", "Mumbai");
	    PhoneNumber ph3_1 = new PhoneNumber(6666666666L, "Office", "Reliance");
	    PhoneNumber ph3_2 = new PhoneNumber(5555555555L, "Home", "Tata Docomo");
	    Set<PhoneNumber> phonesSet3 = new HashSet<>();
	    ph3_1.setCustomer(cust3);
	    ph3_2.setCustomer(cust3);
	    phonesSet3.add(ph3_1);
	    phonesSet3.add(ph3_2);
	    cust3.setPhones(phonesSet3);

	    // Customer 4
	    Customer cust4 = new Customer("Alice", "Chennai");
	    PhoneNumber ph4_1 = new PhoneNumber(4444444444L, "Office", "Aircel");
	    PhoneNumber ph4_2 = new PhoneNumber(3333333333L, "Home", "MTS");
	    Set<PhoneNumber> phonesSet4 = new HashSet<>();
	    ph4_1.setCustomer(cust4);
	    ph4_2.setCustomer(cust4);
	    phonesSet4.add(ph4_1);
	    phonesSet4.add(ph4_2);
	    cust4.setPhones(phonesSet4);

	    // Customer 5
	    Customer cust5 = new Customer("Bob", "Delhi");
	    PhoneNumber ph5_1 = new PhoneNumber(2222222222L, "Office", "Idea");
	    PhoneNumber ph5_2 = new PhoneNumber(1111111111L, "Home", "MTNL");
	    Set<PhoneNumber> phonesSet5 = new HashSet<>();
	    ph5_1.setCustomer(cust5);
	    ph5_2.setCustomer(cust5);
	    phonesSet5.add(ph5_1);
	    phonesSet5.add(ph5_2);
	    cust5.setPhones(phonesSet5);

	    // Adding customers to a list
	    List<Customer> customers = List.of( cust2, cust3, cust4, cust5);
	    
	    List<Integer> itr=custRepo.saveAll(customers).stream().map(cus->cus.getCid()).collect(Collectors.toList());
	    String idsVal=itr.stream().map(obj->String.valueOf(obj)).collect(Collectors.joining(", "));
	    System.out.println("Records are saved with :"+idsVal);
		
	}

	@Override
	public void saveDataUsingCustomerRemovingCascadeTpe() {
	     Customer cust=new Customer("Priyabarata","Odisha");
	     PhoneNumber ph1=new PhoneNumber(7904391700L,"Residence", "Jio");
	     PhoneNumber ph2=new PhoneNumber(9861233752L, "Residence", "Airtel");
	     Set<PhoneNumber> phones=new HashSet<PhoneNumber>();
	     phones.add(ph1);
	     phones.add(ph2);
	     ph1.setCustomer(cust);
	     ph2.setCustomer(cust);
	     int idVal=custRepo.save(cust).getCid();
	     System.out.println("Customer registered with id value but phone number details not saved:"+idVal);
	     
		
	}

	@Override
	public void saveDataUsingPhoneNumber() {
		
		
		Customer cust6 = new Customer("David", "Pune");
	    PhoneNumber ph6_1 = new PhoneNumber(1234567890L, "Office", "Telenor");
	    PhoneNumber ph6_2 = new PhoneNumber(9876543210L, "Home", "Vodafone");
	    Set<PhoneNumber> phonesSet6 = new HashSet<>();
	    ph6_1.setCustomer(cust6);
	    ph6_2.setCustomer(cust6);
	    phonesSet6.add(ph6_1);
	    phonesSet6.add(ph6_2);
	    cust6.setPhones(phonesSet6);
	    
	    int regVal1=phoneRepo.save(ph6_1).getRegno();
	    int regVal2=phoneRepo.save(ph6_2).getRegno();
	    
	    System.out.println("Phone Number registered with registration values:"+regVal1+","+regVal2);
	    
	}

	@Override
	public void saveDataUsingMultiplePhoneNumbers() {
		
		// Customer 7
	    Customer cust7 = new Customer("Eva", "Kolkata");
	    PhoneNumber ph7_1 = new PhoneNumber(1212121212L, "Office", "BSNL");
	    PhoneNumber ph7_2 = new PhoneNumber(2323232323L, "Home", "Airtel");
	    Set<PhoneNumber> phonesSet7 = new HashSet<>();
	    ph7_1.setCustomer(cust7);
	    ph7_2.setCustomer(cust7);
	    phonesSet7.add(ph7_1);
	    phonesSet7.add(ph7_2);
	    cust7.setPhones(phonesSet7);
	    

	    // Customer 8
	    Customer cust8 = new Customer("Frank", "Jaipur");
	    PhoneNumber ph8_1 = new PhoneNumber(3434343434L, "Office", "Idea");
	    PhoneNumber ph8_2 = new PhoneNumber(4545454545L, "Home", "Jio");
	    Set<PhoneNumber> phonesSet8 = new HashSet<>();
	    ph8_1.setCustomer(cust8);
	    ph8_2.setCustomer(cust8);
	    phonesSet8.add(ph8_1);
	    phonesSet8.add(ph8_2);
	    cust8.setPhones(phonesSet8);

	    // Customer 9
	    Customer cust9 = new Customer("Grace", "Ahmedabad");
	    PhoneNumber ph9_1 = new PhoneNumber(5656565656L, "Office", "Vodafone");
	    PhoneNumber ph9_2 = new PhoneNumber(6767676767L, "Home", "Reliance");
	    Set<PhoneNumber> phonesSet9 = new HashSet<>();
	    ph9_1.setCustomer(cust9);
	    ph9_2.setCustomer(cust9);
	    phonesSet9.add(ph9_1);
	    phonesSet9.add(ph9_2);
	    cust9.setPhones(phonesSet9);

	    // Customer 10
	    Customer cust10 = new Customer("Hank", "Lucknow");
	    PhoneNumber ph10_1 = new PhoneNumber(7878787878L, "Office", "Tata");
	    PhoneNumber ph10_2 = new PhoneNumber(8989898989L, "Home", "MTNL");
	    Set<PhoneNumber> phonesSet10 = new HashSet<>();
	    ph10_1.setCustomer(cust10);
	    ph10_2.setCustomer(cust10);
	    phonesSet10.add(ph10_1);
	    phonesSet10.add(ph10_2);
	    cust10.setPhones(phonesSet10);
	    
	    List<PhoneNumber> list=Arrays.asList(ph7_1,ph7_2,ph8_1,ph8_2,ph9_1,ph9_2,ph10_1,ph10_2);
	    List<Integer> itr=phoneRepo.saveAll(list).stream().map(obj->obj.getRegno()).collect(Collectors.toList());
	    String regNos=itr.stream().map(number->String.valueOf(number)).collect(Collectors.joining(", "));
	    System.out.println("Phone numbers are registered with registration number :"+regNos);
    		
	}

	@Override
	public void getDataUsingCustomer() {
		List<Customer> list=custRepo.findAll();
		list.forEach(cust->{
			System.out.println("Parent :"+cust);
			Set<PhoneNumber> childs=cust.getPhones();
			childs.forEach(ph->{
				System.out.println("Child:"+ph);
			});
		});
		
	}

	@Override
	public void getDataUsingCustomerButEagerLoading() {
		List<Customer> list=custRepo.findAll();
		list.forEach(cust->{
			System.out.println("Parent :"+cust);
			Set<PhoneNumber> childs=cust.getPhones();
			/*childs.forEach(ph->{
				System.out.println("Child:"+ph);
			});
			*/		
			});
		
	}

	@Override
	public void getDataUsingCustomerButLazyLoading() {
		List<Customer> list=custRepo.findAll();
		list.forEach(cust->{
			System.out.println("Parent :"+cust);
			Set<PhoneNumber> childs=cust.getPhones();
			/*childs.forEach(ph->{
				System.out.println("Child:"+ph);
			});
			*/		
			});
		
	}

	@Override
	public void getDataUsingPhoneNumber() {
		List<PhoneNumber> list=phoneRepo.findAll();
		list.forEach(ph->{
		System.out.println("Child :"+ph);
		Customer cust=ph.getCustomer();
		System.out.println("Parent :"+cust);
		System.out.println("----------------------------------");
		}
		
				);
		
	}

	@Override
	public void getDataUsingPhoneNumberButEagerLoading() {
		List<PhoneNumber> list=phoneRepo.findAll();
		list.forEach(ph->{
		System.out.println("Child :"+ph);
			/*Customer cust=ph.getCustomer();
			System.out.println("Parent :"+cust);
			System.out.println("----------------------------------");*/
		}
		
				);
		
		
	}

	@Override
	public void getDataUsingPhoneNumberButLazyLoading() {
		
		List<PhoneNumber> list=phoneRepo.findAll();
		list.forEach(ph->{
		System.out.println("Child :"+ph);
			/*Customer cust=ph.getCustomer();
			System.out.println("Parent :"+cust);
			System.out.println("----------------------------------");*/
		}
		
				);
		
	}

	@Override
	public void deleteDataUsingCustomer(int id) {
		Optional<Customer> opt=custRepo.findById(id);
		if(opt.isPresent())
		{
			Customer cust=opt.get();
			
			custRepo.delete(cust);
			
			System.out.println("Parent and Child records are deleted");
		}
		else
		{
			System.out.println("Parent not found");
		}
		
	}

}
