package com.greatlearning.javafsd.customermanagement.service;

import java.util.List;

import com.greatlearning.javafsd.customermanagement.entity.Customer;

public interface CustomerService {

	List<Customer> listAll();
	
	Customer findById(int theId);
	
	void save(Customer theCustomer);
	
	void deleteById(int theId);
}
