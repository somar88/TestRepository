package org.abrams.test;

import java.util.Date;

public class Person {

	private String First_Name;
	private String Last_Name;
	private String Middle_Name;
	private Date Birth_Date;
	private Address address;

	public Person() {
		this.First_Name = "";
		this.Last_Name = "";
		this.Middle_Name = "";
		this.Birth_Date = new Date();
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getMiddle_Name() {
		return Middle_Name;
	}

	public void setMiddle_Name(String middle_Name) {
		Middle_Name = middle_Name;
	}

	public Date getBirth_Date() {
		return Birth_Date;
	}

	public void setBirth_Date(Date birth_Date) {
		Birth_Date = birth_Date;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
