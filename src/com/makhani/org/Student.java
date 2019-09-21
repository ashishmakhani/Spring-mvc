package com.makhani.org;

public class Student {
	
	private String firstname;
	private String lastname;
	private String country;
	private String favouritelanguage;
	private String[] operatingsystem;

	//No - arg Constructor
	public Student() {
		
	}
	
	// Getter/setter method
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavouritelanguage() {
		return favouritelanguage;
	}

	public void setFavouritelanguage(String favouritelanguage) {
		this.favouritelanguage = favouritelanguage;
	}
	
	public String[] getOperatingsystem() {
		return operatingsystem;
	}

	public void setOperatingsystem(String[] operatingsystem) {
		this.operatingsystem = operatingsystem;
	}

}
