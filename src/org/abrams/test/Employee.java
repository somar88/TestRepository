package org.abrams.test;

import java.util.Date;

public class Employee extends Person {

	private Position position;
	private Date date_Of_Employment;

	public Employee() {
		super();
		this.position = Position.SALES_MAN;
		this.date_Of_Employment = new Date();
	}

	public Employee(String firstName, String lastName, String middleName) {
		super(firstName, lastName, middleName);
		this.position = Position.SALES_MAN;
		this.date_Of_Employment = new Date();
	}

	@Override
	public String toString() {
		return "First name: " + this.First_Name + "\n" + "Last name: " + this.Last_Name + "\n" + "Middle name: "
				+ this.Middle_Name + "\n" + "Date of Birth: " + this.Birth_Date.toString() + "\n" + "Position: "
				+ this.position + "\n" + "Date of Employment: " + this.date_Of_Employment + "\n";
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Date getDate_Of_Employment() {
		return date_Of_Employment;
	}

	public void setDate_Of_Employment(Date date_Of_Employment) {
		this.date_Of_Employment = date_Of_Employment;
	}

}
