package me.iit.VideoStore.Dao;

import java.util.List;

import me.iit.VideoStore.Models.Customer;

public interface ICustomerRepository {
	void SaveCustomer(Customer customer);
	List<Customer> GetAllCustomers();
	Customer GetCustomerById(int id);
	List<Object> GetCustomerLoansByCustomerId(int id);
	void UpdateCustomer(Customer customer);
	void DeleteCustomer(Customer customer);
}
