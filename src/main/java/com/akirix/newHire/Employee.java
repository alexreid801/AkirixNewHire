package com.akirix.newHire;

public class Employee implements Comparable<Employee> {
	
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int compareTo(Employee that) {
		if(this.getLastName().compareToIgnoreCase(that.getLastName()) < 0) return -1;
		if(this.getLastName().compareToIgnoreCase(that.getLastName()) > 0) return 1;
		if(this.getFirstName().compareToIgnoreCase(that.getFirstName()) < 0) return -1;
		if(this.getFirstName().compareToIgnoreCase(that.getFirstName()) > 0) return 1;
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
	
	public String toString() { 
	    return "{" + this.getLastName() + ", " + this.getFirstName() + "}";
	} 

}
