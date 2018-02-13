package com.akirix.newHire;

import java.util.Arrays;

import com.akirix.newHire.quickSort.AkirixComparableQuicksorter;
import com.akirix.newHire.quickSort.AkirixComparableQuicksorter.SortOrder;
import com.akirix.newHire.quickSort.comparables.Employee;
import com.akirix.newHire.quickSort.comparables.HoursAndMinutes;
import com.akirix.newHire.quickSort.comparables.Planet;
import com.akirix.newHire.quickSort.comparables.Planet.SolarSystem;

public class FirstAssignment {

	public static void run() {
		
		//Print a notice that first assignment demo is running
		System.out.println("Running assignment demo 1..");
		
		//Run part one, then two, then three of this assignment
		runPartOne();
		runPartTwo();
		runPartThree();
		
		//Print a notice that first assignment demo is done
		System.out.println("Assignment demo 1 is done.");
	}
	
	private static void runPartOne() {

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
	
	private static void runPartTwo() {

		//Print a message that we are about to do the hours and minutes sort example
		System.out.println("Running hours and minutes sort example..");
		
		//Make an unsorted list of hours and minutes objects to sort
		HoursAndMinutes[] unsortedHoursAndMinutes = {
				new HoursAndMinutes("02:30"), 
				new HoursAndMinutes("10:45"), 
				new HoursAndMinutes("06:16"), 
				new HoursAndMinutes("05:30"), 
				new HoursAndMinutes("12:30"), 
				new HoursAndMinutes("10:30"),
				new HoursAndMinutes("05:18"),
				new HoursAndMinutes("05:30"),
				new HoursAndMinutes("05:58")};
		
		//Print the unsorted array
		System.out.println("Unsorted hours and minutes array:");
		System.out.println(Arrays.toString(unsortedHoursAndMinutes));
		
		//Sort the unsorted employees to a sorted hours and minutes array (While not altering the original array) ascending then descending
		HoursAndMinutes[] ascendinglySortedHoursAndMinutes = AkirixComparableQuicksorter.quickSort(unsortedHoursAndMinutes, SortOrder.ASC);
		HoursAndMinutes[] descendinglySortedHoursAndMinutes = AkirixComparableQuicksorter.quickSort(unsortedHoursAndMinutes, SortOrder.DESC);
		
		//Print the ascendingly sorted array
		System.out.println("Ascendingly sorted hours and minutes array:");
		System.out.println(Arrays.toString(ascendinglySortedHoursAndMinutes));
		
		//Print the descendingly sorted array
		System.out.println("Descendingly sorted hours and minutes array:");
		System.out.println(Arrays.toString(descendinglySortedHoursAndMinutes));
		
		//Print the unsorted array again (this shows that it is unchanged!)
		System.out.println("Original unsorted hours and minutes array:");
		System.out.println(Arrays.toString(unsortedHoursAndMinutes));
	}
	
	private static void runPartThree() {

		//Print a message that we are about to do the plane sort example
		System.out.println("Running planets sort example..");
		
		//Make an unsorted list of planets to sort
		Planet[] unsortedPlanets = {
				new Planet(SolarSystem.EARTH), 
				new Planet(SolarSystem.JUPITER), 
				new Planet(SolarSystem.VENUS), 
				new Planet(SolarSystem.MARS), 
				new Planet(SolarSystem.MERCURY), 
				new Planet(SolarSystem.NEPTUNE), 
				new Planet(SolarSystem.URANUS), 
				new Planet(SolarSystem.EARTH), 
				new Planet(SolarSystem.SATURN)};
		
		//Print the unsorted array
		System.out.println("Unsorted planets array:");
		System.out.println(Arrays.toString(unsortedPlanets));
		
		//Sort the unsorted planets to a sorted planets array (While not altering the original array) ascending then descending
		Planet[] ascendinglySortedPlanets = AkirixComparableQuicksorter.quickSort(unsortedPlanets, SortOrder.ASC);
		Planet[] descendinglySortedPlanets = AkirixComparableQuicksorter.quickSort(unsortedPlanets, SortOrder.DESC);
		
		//Print the ascendingly sorted array
		System.out.println("Ascendingly planets array:");
		System.out.println(Arrays.toString(ascendinglySortedPlanets));
		
		//Print the descendingly sorted array
		System.out.println("Descendingly sorted planets array:");
		System.out.println(Arrays.toString(descendinglySortedPlanets));
		
		//Print the unsorted array again (this shows that it is unchanged!)
		System.out.println("Original unsorted planets array:");
		System.out.println(Arrays.toString(unsortedPlanets));
	}
}
