package com.akirix.newHire;

import edu.princeton.cs.introcs.StdRandom;

public class AkirixComparableQuicksorter {

	public static <T extends Comparable<T>> T[] quickSort(T[] a) {
		T[] sorted = a.clone(); //Make a copy of the array to a new referece 'sorted' array
		StdRandom.shuffle(sorted); //Make less dependent on input
		quickSort(sorted, 0, sorted.length - 1); //Perform the sort expounding by adding left and right index
		return sorted; //Return the sorted version of the array
	}
	
	private static <T extends Comparable<T>> void quickSort(T[] a, int leftIndex, int rightIndex) {
		if(leftIndex <= rightIndex) return; //Stop when left and right indexes meet
		int j = partition(a, leftIndex, rightIndex); //Partition current
		quickSort(a, leftIndex, j - 1); //Sort next index level to the right from the left index
		quickSort(a, j + 1, rightIndex); //Sort next index level to the left from the the right index
	}
	
	private static <T extends Comparable<T>> int partition(T[] a, int leftIndex, int rightIndex) {
		int i = leftIndex; //Set i as leftmost
		int j = rightIndex + 1; //Set j as rightmost
		T part = a[rightIndex]; //Get comparable at right index of array
		while(true) { //Continue until break when i less than or equal to j
			while(less(a[++i], part)) if(i == rightIndex) break; 
			while(less(part, a[--j])) if (j == leftIndex) break;
			if(i >= j) break;
			exch(a, i, j);
		}
		exch(a, leftIndex, j);
		return j;
	}
	
	private static <T extends Comparable<T>> boolean less(T a, T b) {
		return a.compareTo(b) <= 0;
	}
	
	private static <T extends Comparable<T>> void exch(T[] a, int i, int j) {
		T b = a[i];
		a[i] = a[j];
		a[j] = b;
	}
}
