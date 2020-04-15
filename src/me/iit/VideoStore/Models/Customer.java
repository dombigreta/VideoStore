package me.iit.VideoStore.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	@Column(name="first_name")
	private String FirstName;
	@Column(name="last_name")
	private String LastName;
	@Column(name="email")
	private String Email;
	@Column(name="birth_date")
	private Date BirthDate;
	@Column(name="gender_type_id")
	private int GenderTypeId;
	
	public Customer() {}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

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
