package me.iit.VideoStore.Services;

import java.util.List;
import java.util.stream.Collectors;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import me.iit.VideoStore.Services.ManagedBeans.CustomerBean;
import me.iit.VideoStore.Dao.ICustomerRepository;
import me.iit.VideoStore.Models.Customer;

@ManagedBean
@ApplicationScoped
public class CustomerService implements ICustomerService {
	
	@Inject
	private ICustomerRepository repository;
	
	public CustomerService() {}

	@Override
	public void SaveCustomer(Customer customer) {
		if(customer.getId() == 0) {
			repository.SaveCustomer(customer);
		}
		else{
			Customer originalCustomer = repository.GetCustomerById(customer.getId());
			originalCustomer.setFirstName(customer.getFirstName());
			originalCustomer.setLastName(customer.getLastName());
			originalCustomer.setBirthDate(customer.getBirthDate());
			originalCustomer.setEmail(customer.getEmail());
			originalCustomer.setGenderTypeId(customer.getGenderTypeId());
			repository.UpdateCustomer(originalCustomer);
		}
		
	}

	@Override
	public List<CustomerBean> GetAllCustomers() {
		List<Customer> customerRecords =  repository.GetAllCustomers();
		return customerRecords.stream().map(c -> {
			CustomerBean customer = new CustomerBean();
			customer.setFirstName(c.getFirstName());
			customer.setLastName(c.getLastName());
			customer.setEmail(c.getEmail());
			customer.setGenderTypeId(c.getGenderTypeId());
			customer.setBirthDate(c.getBirthDate());
			return customer;
		}).collect(Collectors.toList());
	}

	@Override
	public Customer GetCustomerById(int id) {
		return repository.GetCustomerById(id);
	}

	@Override
	public List<Object> GetCustomerLoansByCustomerId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteCustomer(int id) {
		Customer customerRecord = repository.GetCustomerById(id);
		repository.DeleteCustomer(customerRecord);
		
	}

}
