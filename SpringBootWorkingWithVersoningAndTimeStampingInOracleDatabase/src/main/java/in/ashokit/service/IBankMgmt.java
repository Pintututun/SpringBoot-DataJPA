package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.BankAccount;

public interface IBankMgmt {

	public String createBankAccount(BankAccount account);
	public String createMultipleBankAccounts(List<BankAccount> list);
	public String updateAccountNumberWithMobileNumber(Long acno,Long mobile);
	public BankAccount getAccountDetailsByAcno(Long acno);
}
