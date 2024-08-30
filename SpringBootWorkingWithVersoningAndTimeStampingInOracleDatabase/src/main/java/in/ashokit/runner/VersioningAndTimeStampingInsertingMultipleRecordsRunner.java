package in.ashokit.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.BankAccount;
import in.ashokit.service.BankMgmtImpl;

//@Component
public class VersioningAndTimeStampingInsertingMultipleRecordsRunner implements CommandLineRunner {

	@Autowired
	private BankMgmtImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		 BankAccount account1 = new BankAccount("John", "Delhi", 120000.0, 9898984322L);
	        BankAccount account2 = new BankAccount("Alice", "Mumbai", 150000.0, 9898984323L);
	        BankAccount account3 = new BankAccount("Bob", "Chennai", 180000.0, 9898984324L);
	        BankAccount account4 = new BankAccount("Charlie", "Pune", 210000.0, 9898984325L);

	        // Save all accounts to the repository
	        List<BankAccount> savedAccounts = Arrays.asList(account1, account2, account3, account4);
	        String msg=service.createMultipleBankAccounts(savedAccounts);
	        System.out.println(msg);

	}

}
