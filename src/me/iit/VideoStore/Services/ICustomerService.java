package me.iit.VideoStore.Services;

import java.util.List;

import me.iit.VideoStore.Models.Customer;
import me.iit.VideoStore.Services.ManagedBeans.CustomerBean;

public interface ICustomerService {
	void SaveCustomer(Customer customer);
	List<CustomerBean> GetAllCustomers();
	Customer GetCustomerById(int id);
	List<Object> GetCustomerLoansByCustomerId(int id);
	void DeleteCustomer(int id);
}
