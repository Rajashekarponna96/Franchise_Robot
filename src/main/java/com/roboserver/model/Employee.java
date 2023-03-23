package com.roboserver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @NotBlank
  private String name;
  
  @NotBlank
  private String phoneNo;
  
  @NotBlank
  @Email
  private String email;
  
  @NotBlank
  private String city;
  
  @NotBlank
  private String business_cat;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getBusiness_cat() {
	return business_cat;
}

public void setBusiness_cat(String business_cat) {
	this.business_cat = business_cat;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", city=" + city
			+ ", business_cat=" + business_cat + "]";
}


}
