package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.BankAccount;
import in.ashokit.service.BankMgmtImpl;

//@Component
public class VersoningAndTimestampingRunner implements CommandLineRunner {

	@Autowired
	private BankMgmtImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		BankAccount account=new BankAccount("Raja","Hyd",90000.0,9898984321l);
		String msg=service.createBankAccount(account);
        System.out.println(msg);
	}

}
