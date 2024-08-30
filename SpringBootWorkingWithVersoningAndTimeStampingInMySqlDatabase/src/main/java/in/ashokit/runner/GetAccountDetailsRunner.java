package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.BankAccount;
import in.ashokit.service.BankMgmtImpl;

@Component
public class GetAccountDetailsRunner implements CommandLineRunner {

	@Autowired
	private BankMgmtImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		BankAccount account=service.getAccountDetailsByAcno(10000000L);
		System.out.println("Account number: "+account.getAcno()+"\nAccount Person Name: "+account.getName()+"\nAccount Person Address: "+account.getAddrs()+"\nAccount Person number: "+account.getMobileNo()+"\nAccount Person Balance: "+account.getBalance()+"\nCreation Date: "+account.getCreationTime()+"\nUpdation Date: "+account.getLastUpdationTime()+"\nAccount updated count number: "+account.getUpdateCount());

	}

}
