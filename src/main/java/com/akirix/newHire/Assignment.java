package com.akirix.newHire;

import java.util.Arrays;

import com.akirix.newHire.AkirixComparableQuicksorter.SortOrder;

public class Assignment {

	public static void main(String[] args) {
		
		//Print a welcome message that the application is running
		System.out.println("Welcome to the Akirix New Hire Assignment, created by Alexander Reid!");
		
		//Run the first assignent demo followed by the second assignment demo
		runFirstAssignment();
		runSecondAssignment();
	}
	
	private static void runFirstAssignment() {
		
		//Print a notice that first assignment demo is running
		System.out.println("Running assignment demo 1..");

		//Print a message that we are about to do the employee sort example
		System.out.println("Running employee sort example..");
		
		//Make an unsorted list of employees to sort
		Employee[] unsortedEmployees = {
				new Employee("Alexander", "Reid"), 
				new Employee("Kelly", "Ferrone"), 
				new Employee("Roland", "Li"), 
				new Employee("Albert", "Einstein"), 
				new Employee("Leonardo", "da Vinci"),
				new Employee("Isaac", "Newton"),
				new Employee("Nicolaus", "Copernicus")};
		
		//Print the unsorted array
		System.out.println("Unsorted employees array:");
		System.out.println(Arrays.toString(unsortedEmployees));
		
		//Sort the unsorted employees to a sorted employees array (While not altering the original array) ascending then descending
		Employee[] ascendinglySortedEmployees = AkirixComparableQuicksorter.quickSort(unsortedEmployees, SortOrder.ASC);
		Employee[] descendinglySortedEmployees = AkirixComparableQuicksorter.quickSort(unsortedEmployees, SortOrder.DESC);
		
		//Print the ascendingly sorted array
		System.out.println("Ascendingly sorted employees array:");
		System.out.println(Arrays.toString(ascendinglySortedEmployees));
		
		//Print the descendingly sorted array
		System.out.println("Descendingly sorted employees array:");
		System.out.println(Arrays.toString(descendinglySortedEmployees));
		
		//Print the unsorted array again (this shows that it is unchanged!)
		System.out.println("Original unsorted employees array:");
		System.out.println(Arrays.toString(unsortedEmployees));
	}
	
	private static void runSecondAssignment() {
		
	}

}
