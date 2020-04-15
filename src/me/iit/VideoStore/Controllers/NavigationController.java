package me.iit.VideoStore.Controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;



@ManagedBean
@RequestScoped
public class NavigationController implements Serializable {
	
	private String PageId = "homepage";
	public void AttributeListener(ActionEvent event) {
		PageId = (String)event.getComponent().getAttributes().get("id");
		System.out.println(PageId);
	}
	
	public String GetPage() {
		return PageId;
	}
	
	public void SetPage() {
		PageId = "customerpage";
	}
	
}
