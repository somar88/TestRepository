package org.abrams.test;

import java.util.Date;
import java.util.Random;

import org.abrams.test.utilities.InputManager;

public class Employee extends Person {

	private long employee_ID;
	private Position position;
	private Date date_Of_Employment;

	public Employee() {
		super();
		this.employee_ID = new Random().nextLong();
		this.position = Position.SALES_MAN;
		this.date_Of_Employment = new Date();
	}

	public Employee(String firstName, String lastName, String middleName) {
		super(firstName, lastName, middleName);
		this.employee_ID = new Random().nextLong();
		this.position = Position.SALES_MAN;
		this.date_Of_Employment = new Date();
		this.manageEmployeeInfo();
	}

	@Override
	public String toString() {
		return "ID: " + this.employee_ID + "\n" + super.toString() + "\n" + "Position: " + this.position + "\n"
				+ "Date of Employment: " + this.date_Of_Employment + "\n";
	}

	public void manageEmployeeInfo() {
		System.out.println("Please enter the employee Infos:");
		this.first_Name = InputManager.getInput("Employee first name: ");
		this.last_Name = InputManager.getInput("Employee last name: ");
		this.middle_Name = InputManager.getInput("Employee middle name: ");
		this.address.setAddress();
		System.out.println("done...! \n-------------------------------------------------\n");

	}

	// Setters and getters

	public Position getPosition() {
		return position;
	}

	public Long getEmployee_ID() {
		return this.employee_ID;
	}

	public void setEmployee_ID(Long employee_ID) {
		this.employee_ID = employee_ID;
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
