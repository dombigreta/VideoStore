package me.iit.VideoStore.Controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import me.iit.VideoStore.Services.ICustomerService;
import me.iit.VideoStore.Services.ManagedBeans.CustomerBean;

@ViewScoped
@ManagedBean
public class CustomerController {
	
	@Inject
	private ICustomerService service;
	

	private static List<CustomerBean> customers;
	
	public CustomerController() {}

	
	public List<CustomerBean> getCustomers(){
		customers = service.GetAllCustomers();
		return customers;
	}
	
}
