package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.service.BankMgmtImpl;

//@Component
public class UpdatingAccountNumberRunner implements CommandLineRunner {

	@Autowired
	private BankMgmtImpl service;
	@Override
	public void run(String... args) throws Exception {
		String msg=service.updateAccountNumberWithMobileNumber(10000000l,9861233753l);
		System.out.println(msg);

	}

}
