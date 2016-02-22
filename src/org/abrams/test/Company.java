package org.abrams.test;

import java.util.ArrayList;
import java.util.List;
import org.abrams.test.utilities.InputManager;

public class Company {

	private String company_Name;
	private Address company_Address;
	private static Long emplyee_Count = 0L;
	public List<Employee> employee_List;

	// Contractors

	public Company() {
		this.company_Name = "";
		this.company_Address = new Address();
		this.employee_List = new ArrayList<>();
	}

	public Company(String companyName) {
		this.company_Name = companyName;
		this.company_Address = new Address();
		this.employee_List = new ArrayList<>();
	}

	// Managing the Employees

	public void addEmployee() {
		Employee employee = new Employee();
		this.employee_List.add(employee);
		employee.manageEmployeeInfo();
		emplyee_Count++;
	}

	public void removeEmployee() {

		String employeeFirstName = InputManager
				.getInput("plaese enter the first name of the employee you want to delete: ");
		String employeeLastName = InputManager
				.getInput("plaese enter the last name of the employee you want to delete: ");

		for (Employee employee : employee_List) {
			if (employee.getFirst_Name() == employeeFirstName && employee.getLast_Name() == employeeLastName) {
				employee_List.remove(employee);
				if (emplyee_Count >= 1) {
					emplyee_Count--;
				}
			} else
				System.out.println("Sorry there is no Employee with this name in the Company!");
		}
	}

	public void searchEmployeeFirstName(String employeeName) {
		for (Employee employee : employee_List) {
			if (employee.getFirst_Name() == employeeName)
				System.out.println(employee);
			else
				System.out.println("Sorry there is no Employee with this name in the Company!");
		}
	}

	public void searchEmployeeFirstAndLastName() {
		String employeeFirstName = InputManager.getInput("First name: ");
		String employeeLastName = InputManager.getInput("Last name: ");
		for (Employee employee : employee_List) {
			if (employee.getFirst_Name() == employeeFirstName && employee.getLast_Name() == employeeLastName)
				System.out.println(employee);
			else
				System.out.println("Sorry there is no Employee with this name in the Company!");
		}
	}

	public void searchEmployeeID() {
		try {
			Long employeeID = Long.parseLong(InputManager.getInput("please enter the employee ID to search for: "));
			for (Employee employee : employee_List) {
				if (employee.getEmployee_ID() == employeeID) {
					System.out.println(employee);
					return;
				}
			}
			System.out.println("Sorry there is no Employee with this name in the Company!");

		} catch (Exception e) {
			System.out.println("Please enter a valid in ID");
			System.out.println(e.getMessage());
		}
	}

	public void emplyeeListPrint() {
		for (Employee e : employee_List) {
			System.out.println(e);
			System.out.println("-------------------------------------------------");
		}
	}

	public void manageCompanyAddress() {
		this.company_Address.setAddress();
	}

	// Getters and Setters

	public String getCompany_Name() {
		return company_Name;
	}

	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
}
