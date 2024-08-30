package in.ashokit.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.BankAccount;
import in.ashokit.repo.BankRepository;

@Service
public class BankMgmtImpl implements IBankMgmt {

	@Autowired
	private BankRepository repo;
	@Override
	public String createBankAccount(BankAccount account) {
		long acno=repo.save(account).getAcno();
		return "Bank Account is opened having the account number:"+acno;
	}
	@Override
	public String createMultipleBankAccounts(List<BankAccount> list) {
		List<Long> itr=repo.saveAll(list).stream().map(obj->obj.getAcno()).collect(Collectors.toList());
		String ids=itr.stream().map(item->String.valueOf(item)).collect(Collectors.joining(", "));
		return "Bank Accounts are opened having account numbers :"+ids;
	}
	@Override
	public String updateAccountNumberWithMobileNumber(Long acno, Long mobile) {
		Optional<BankAccount> opt=repo.findById(acno);
		if(opt.isPresent())
		{
			BankAccount account=opt.get();
			account.setMobileNo(mobile);
			repo.save(account);
			return "Account number :"+acno+" is updated";
		}
		else
			return "Account number not existed";
	
	}
	@Override
	public BankAccount getAccountDetailsByAcno(Long acno) {
		return repo.getReferenceById(acno);
	}

}
