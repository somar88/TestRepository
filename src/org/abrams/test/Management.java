package org.abrams.test;

import java.util.Random;

public class Management {

	public static void main(String[] args) {

		Random random = new Random();

		Company company = new Company();
		for (int i = 0; i < random.nextInt(4) + 1; i++) {
			company.addEmployee();
		}
		company.emplyeeListPrint();
	}
}
