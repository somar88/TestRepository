package org.abrams.test;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private String company_Name;
	private Address company_Address;
	private List<Employee> employee_List;

	
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
	
	
	// MAnaging the Employees
	
	public void addEmployee(String employeeName) {
		for (Employee employee : employee_List) {
			if (employee.getFirst_Name() == employeeName)
				System.out.println(employee.toString());
			else System.out.println("Sorry there is no Employee with this name in the Company!");
		}
	}

	public void removeEmployee(String employeeFirstName, String employeeLastName) {
		for (Employee employee : employee_List) {
			if (employee.getFirst_Name() == employeeFirstName && employee.getLast_Name() == employeeFirstName)
				employee_List.remove(employee);
			else System.out.println("Sorry there is no Employee with this name in the Company!");
		}
	}

	public void searchEmployee(String employeeName) {
		for (Employee employee : employee_List) {
			if (employee.getFirst_Name() == employeeName)
				employee_List.remove(employee);
			else System.out.println("Sorry there is no Employee with this name in the Company!");
		}
	}

	
	// Getters and Setters 
	
	public String getCompany_Name() {
		return company_Name;
	}

	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}	
}
