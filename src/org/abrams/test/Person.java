package org.abrams.test;

import java.util.Date;

public abstract class Person {

	protected String first_Name;
	protected String last_Name;
	protected String middle_Name;
	protected Date birth_Date;
	protected Address address;

	// Constructors

	public Person() {
		this.first_Name = "";
		this.last_Name = "";
		this.middle_Name = "";
		this.birth_Date = new Date();
		this.address = new Address();
	}

	public Person(String firstName, String lastName, String middleName) {
		this.first_Name = firstName;
		this.last_Name = lastName;
		this.middle_Name = middleName;
		this.birth_Date = new Date();
		this.address = new Address();
	}

	// Printing the person informations

	@Override
	public String toString() {
		return "First name: " + this.first_Name + "\n" + "Last name: " + this.last_Name + "\n" + "Middle name: "
				+ this.middle_Name + "\n" + "Date of Birth: " + this.birth_Date.toString() + "\n" + this.address;
	}

	// Setters and getters

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getMiddle_Name() {
		return middle_Name;
	}

	public void setMiddle_Name(String middle_Name) {
		this.middle_Name = middle_Name;
	}

	public Date getBirth_Date() {
		return birth_Date;
	}

	public void setBirth_Date(Date birth_Date) {
		this.birth_Date = birth_Date;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
