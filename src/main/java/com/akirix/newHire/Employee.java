package com.akirix.newHire;

public class Employee implements Comparable<Employee> {
	
	private String firstName;
	private String lastName;

	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
