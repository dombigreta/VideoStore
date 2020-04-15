package me.iit.VideoStore.Controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import me.iit.VideoStore.Models.Customer;
import me.iit.VideoStore.Services.ICustomerService;

@ViewScoped
@ManagedBean
public class CustomerController {
	
	@Inject
	private ICustomerService service;
	
	public CustomerController() {}
	
	public String GetMessage(){
		System.out.println(service);
		List<Customer> result = service.GetAllCustomers();
		for(Customer c : result) {
			System.out.println(c.getEmail());
		}
		return "homepage";
	}
}
