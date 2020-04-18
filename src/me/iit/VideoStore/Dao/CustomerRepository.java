package me.iit.VideoStore.Dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import me.iit.VideoStore.Models.Customer;

@Stateless
public class CustomerRepository implements ICustomerRepository {

	@PersistenceContext(unitName="video_rental")
	EntityManager manager;
	
    public CustomerRepository() {}

	@Override
	public void SaveCustomer(Customer customer) {
		manager.persist(customer);
	}

	@Override
	public List<Customer> GetAllCustomers() {
		String sql = "select c from Customer c";
    	Query query = manager.createQuery(sql);
    	List<Customer> customers = query.getResultList();
    	return customers;
	}

	@Override
	public Customer GetCustomerById(int id) {
		Customer customer = manager.find(Customer.class, id);
		if(customer == null) {
			//TODO validation
		}
		return customer;
	}

	@Override
	public List<Object> GetCustomerLoansByCustomerId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void UpdateCustomer(Customer customer) {
		manager.merge(customer);
	}
	
	public void DeleteCustomer(Customer customer) {
		manager.remove(customer);
	}
}
