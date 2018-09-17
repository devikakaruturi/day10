package com.capgemini.bankapp.dao;

import com.capgemini.bankapp.model.BankAccount;

public interface BankAccountDao {
	//public BankAccount getBalance(long accountId);
	public double getBalance(long accountId);
	public boolean updateBalance(long accountId, double newBalance);
}
