package com.capgemini.bankapp.service.impl;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.dao.impl.BankAccountDaoImpl;
import com.capgemini.bankapp.service.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService{
	private BankAccountDao bankAccountDao;
	public BankAccountServiceImpl() {
		bankAccountDao=new BankAccountDaoImpl();
	}

	@Override
	public double getBalance(long accountId) {
		return bankAccountDao.getBalance(accountId);
	}

	@Override
	public double withdraw(long accountId, double amount) {
		if(bankAccountDao.updateBalance(accountId, -1*amount))
			return bankAccountDao.getBalance(accountId);
		return bankAccountDao.getBalance(accountId);
		
		
	}

	@Override
	public double deposit(long accountId, double amount) {
		if(bankAccountDao.updateBalance(accountId, amount))
			return bankAccountDao.getBalance(accountId);
		return bankAccountDao.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAcc, long toAcc, double amount) {
		if(bankAccountDao.getBalance(toAcc)<0)
		{
			return false;
		}
		
		else if(bankAccountDao.updateBalance(fromAcc, -1*amount))
		{
			if(bankAccountDao.updateBalance(toAcc, amount))
			{
				return true;
			}
		}
		return false;
		
		
	}

}
