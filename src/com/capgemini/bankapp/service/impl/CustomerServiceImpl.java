package com.capgemini.bankapp.service.impl;

import com.capgemini.bankapp.dao.CustomerDao;
import com.capgemini.bankapp.dao.impl.CustomerDaoImpl;
import com.capgemini.bankapp.model.Customer;
import com.capgemini.bankapp.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
		customerDao = new CustomerDaoImpl();
	}

	@Override
	public Customer authenticate(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.authenticate(customer);
		
	}

	@Override
	public Customer updateProfile(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateProfile(customer);
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return customerDao.updatePassword(customer, oldPassword, newPassword);
	}

}
