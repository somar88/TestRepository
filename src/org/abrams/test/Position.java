package org.abrams.test;

public enum Position {
	CEO("CEO"), MANAGER("Manager"), SALES_MAN("Sales Man"), TRAINING("Training");

	private String position;

	Position(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return position;
	}
}
