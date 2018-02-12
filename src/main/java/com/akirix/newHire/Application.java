package com.akirix.newHire;

public class Application {

	public static void main(String[] args) {
		
		//Print a welcome message that the application is running
		System.out.println("Welcome to the Akirix New Hire Assignment!  Created by Alexander Reid.");
		
		//Run the first assignent demo followed by the second assignment demo
		FirstAssignment.run();
		SecondAssignment.run();
		
		//Print a thank you message for running the application
		System.out.println("Thank you for running the Akirix New Hire Assignment!");
	}

}
