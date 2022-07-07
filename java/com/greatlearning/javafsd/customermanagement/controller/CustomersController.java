package com.greatlearning.javafsd.customermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.javafsd.customermanagement.entity.Customer;
import com.greatlearning.javafsd.customermanagement.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomersController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/list")
	public String handleListCustomers(Model theModel ) {
		
		List<Customer> customers = customerService.listAll();
		
		theModel.addAttribute("customers",customers);
		
		return "customer-list";
		
	}

}
