package me.iit.VideoStore.Services;

import java.util.List;

import me.iit.VideoStore.Models.Customer;

public interface ICustomerService {
	void SaveCustomer(Customer customer);
	List<Customer> GetAllCustomers();
	Customer GetCustomerById(int id);
	List<Object> GetCustomerLoansByCustomerId(int id);
}
