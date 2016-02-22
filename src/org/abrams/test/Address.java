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

	// getters and setters

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = InputManager.getInput("please enter country: ");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = InputManager.getInput("please enter city: ");
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = InputManager.getInput("please enter country Zip Code: ");
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = InputManager.getInput("please enter street name: ");
	}

	public String getStreet_Number() {
		return Street_Number;
	}

	public void setStreet_Number(String street_Number) {
		Street_Number = InputManager.getInput("please enter street number: ");
	}

}
