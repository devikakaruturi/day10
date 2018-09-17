package com.capgemini.bankapp.database;

import java.time.LocalDate;
import java.util.HashSet;

import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.model.Customer;

public class Database {

	public Database() {
		super();
	}
	static HashSet<BankAccount> bankData = new HashSet<>();
	static HashSet<Customer> customerData = new HashSet<>();

	static
	{
		BankAccount b1 = new BankAccount(2023, 100, "SAVINGS");
		BankAccount b2 = new BankAccount(2024, 100, "CURRENT");
		BankAccount b3 = new BankAccount(2025, 100, "SAVINGS");
		BankAccount b4 = new BankAccount(2026, 100, "CURRENT");
		BankAccount b5 = new BankAccount(2027, 100, "SAVINGS");
		BankAccount b6 = new BankAccount(2028, 100, "CURRENT");
		BankAccount b7 = new BankAccount(2029, 100, "SAVINGS");
	
		bankData.add(b1);
		bankData.add(b2);
		bankData.add(b3);
		bankData.add(b4);
		bankData.add(b5);
		bankData.add(b6);
		bankData.add(b7);
		customerData.add(new Customer("Devika", 1234, "devi123", "devikakaruturi@gmail.com", "ranchi", LocalDate.parse("1996-06-25"),b1));
		customerData.add(new Customer("Anu", 4567, "anu123", "anusha@gmail.com", "hyderabad", LocalDate.parse("1996-08-18"),b2));
		customerData.add(new Customer("Sandeep Das", 9874, "sandeep123", "sandeep@gmail.com", "bengaluru", LocalDate.parse("1996-06-15"),b3));
		customerData.add(new Customer("K Malyka", 9512, "malyka123", "malyka@gmail.com", "goa", LocalDate.parse("1996-07-25"),b4));
		customerData.add(new Customer("Sushma", 9999, "sushma123", "sushma@gmail.com", "delhi", LocalDate.parse("1996-08-25"),b5));
		customerData.add(new Customer("Meghana", 8888, "meghana123", "meghana@gmail.com", "puna", LocalDate.parse("1996-09-25"),b6));
		customerData.add(new Customer("Diksha", 4444, "diksha123", "diksha@gmail.com", "coorg", LocalDate.parse("1996-10-25"),b7));
	}
	public static HashSet<BankAccount> getAllBankData()
	{
		
		
		return bankData;
		
	}
	public static HashSet<Customer> getAllCustomerData()
	{
		
		return customerData;
	}
	public static void setAllBankData(HashSet<BankAccount> bankDataUpadated) {
		// TODO Auto-generated method stub
		bankData=bankDataUpadated;
	}
	
	public static void setAllCustomerData(HashSet<Customer> customerDataUpadated) {
		// TODO Auto-generated method stub
		customerData=customerDataUpadated;
	}

}
