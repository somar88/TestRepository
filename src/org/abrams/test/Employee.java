package org.abrams.test;

import java.util.Date;

public class Employee {

	private Person person;
	private Position position;
	private Date date_Of_Employment;

	public Employee() {
		this.person = new Person();
		this.position = Position.SALES_MAN;
		this.date_Of_Employment = new Date();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
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
