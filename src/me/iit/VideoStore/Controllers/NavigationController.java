package me.iit.VideoStore.Controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;



@ManagedBean
@RequestScoped
public class NavigationController {
	
	public String getPage(String page) {
		System.out.println(page);
		return page + "page";
	}
	
}
