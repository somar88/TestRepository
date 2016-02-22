package org.abrams.test;

import org.abrams.test.utilities.InputManager;

public class Address {

	private String country;
	private String city;
	private String Zip;
	private String Street;
	private String Street_Number;

	// Constructor
	public Address() {
		this.country = "";
		this.city = "";
		this.Zip = "";
		this.Street = "";
		this.Street_Number = "";
	}

	// to String
	@Override
	public String toString() {
		return this.Zip + " " + this.city + "\n" + this.Street + " " + this.Street_Number + "\n" + this.country;
	}

	public void setAddress() {
		this.setCountry();
		this.setZip();
		this.setCity();
		this.setStreet();
		this.setStreet_Number();

	}

	// getters and setters

	public String getCountry() {
		return this.country;
	}

	public void setCountry() {
		this.country = InputManager.getInput("please enter country: ");
	}

	public String getCity() {
		return this.city;
	}

	public void setCity() {
		this.city = InputManager.getInput("please enter city: ");
	}

	public String getZip() {
		return this.Zip;
	}

	public void setZip() {
		this.Zip = InputManager.getInput("please enter country Zip Code: ");
	}

	public String getStreet() {
		return this.Street;
	}

	public void setStreet() {
		this.Street = InputManager.getInput("please enter street name: ");
	}

	public String getStreet_Number() {
		return this.Street_Number;
	}

	public void setStreet_Number() {
		this.Street_Number = InputManager.getInput("please enter street number: ");
	}

}
