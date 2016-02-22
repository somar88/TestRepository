package org.abrams.test.utilities;

import java.util.Scanner;

public class InputManager {

	public static Scanner scanner = new Scanner(System.in);

	public static String getInput(String msg) {
		System.out.println(msg);
		return scanner.nextLine().trim();
	}
}
