package org.abrams.test;

public class Address {

	private String country;
	private String city;
	private String Zip;
	private String Street;
	private String Street_Number;

	public Address() {
		this.country = "";
		this.city = "";
		this.Zip = "";
		this.Street = "";
		this.Street_Number = "";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getStreet_Number() {
		return Street_Number;
	}

	public void setStreet_Number(String street_Number) {
		Street_Number = street_Number;
	}

}
