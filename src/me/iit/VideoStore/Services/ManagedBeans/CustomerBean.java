package me.iit.VideoStore.Services.ManagedBeans;

import java.sql.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="customer")
@RequestScoped
public class CustomerBean {
	
	String FirstName;
	String LastName;
	String Email;
	Date BirthDate;
	int GenderTypeId;
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public Date getBirthDate() {
		return BirthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	
	public int getGenderTypeId() {
		return GenderTypeId;
	}
	
	public void setGenderTypeId(int genderTypeId) {
		GenderTypeId = genderTypeId;
	}
		
}
