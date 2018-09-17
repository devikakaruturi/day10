package com.capgemini.bankapp.dao.impl;

import java.util.HashSet;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.database.Database;
import com.capgemini.bankapp.model.BankAccount;

public class BankAccountDaoImpl implements BankAccountDao{
	private HashSet<BankAccount> bankData;

	public BankAccountDaoImpl() {
		// TODO Auto-generated constructor stub
		bankData=Database.getAllBankData();
	}

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		for (BankAccount bankAccount : bankData) {
			if(bankAccount.getAccountId()==accountId)
			{
				return bankAccount.getBalance();
			}
		}
		return -1;
	}
	

	@Override
	public boolean updateBalance(long accountId, double amount) {
		// TODO Auto-generated method stub
		for (BankAccount bankAccount : bankData) {
			if(bankAccount.getAccountId()==accountId)
			{
				if(bankAccount.getBalance()+amount>=0) {
				bankAccount.setBalance(bankAccount.getBalance()+amount);
				System.out.println(bankAccount.getBalance());
				return true;
				}
			}
		}
		return false;
		
	}


}
