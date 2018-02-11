package com.akirix.newHire;

import edu.princeton.cs.introcs.StdRandom;

public class AkirixComparableQuicksorter {

	public static <T extends Comparable<T>> T[] quickSort(T[] a, SortOrder order) {
		T[] sorted = a.clone(); 
		StdRandom.shuffle(sorted); 
		quickSort(sorted, 0, sorted.length - 1, order); 
		return sorted; 
	}
	
	private static <T extends Comparable<T>> void quickSort(T[] a, int leftIndex, int rightIndex, SortOrder order) {
		if(rightIndex <= leftIndex) return; 
		int j = partition(a, leftIndex, rightIndex, order); 
		quickSort(a, leftIndex, j - 1, order); 
		quickSort(a, j + 1, rightIndex, order); 
	}
	
	private static <T extends Comparable<T>> int partition(T[] a, int leftIndex, int rightIndex, SortOrder order) {
		int i = leftIndex; 
		int j = rightIndex + 1; 
		T p = a[leftIndex];
		while(true) { 
			while(compare(a[++i], p, order)) if(i == rightIndex) break; 
			while(compare(p, a[--j], order)) if(j == leftIndex)  break; 
			if(i >= j) break; 
			exch(a, i, j); 
		}
		exch(a, leftIndex, j); 
		return j; 
	}
	
	private static <T extends Comparable<T>> void exch(T[] a, int i, int j) {
		T b = a[i]; 
		a[i] = a[j]; 
		a[j] = b; 
	}
	
	private static <T extends Comparable<T>> boolean more(T a, T b) {
		return a.compareTo(b) > 0; 
	}
	
	private static <T extends Comparable<T>> boolean less(T a, T b) {
		return a.compareTo(b) < 0; 
	}
	
	private static <T extends Comparable<T>> boolean compare(T a, T b, SortOrder order) {
		switch(order) {
		case ASC: //ASC is more
			return more(a, b);
		case DESC:
		default: //DESC or default is less
			return less(a, b);
		}
	}
	
	public static enum SortOrder {
		ASC, DESC;
	}
}
