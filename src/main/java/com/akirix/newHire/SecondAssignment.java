package com.akirix.newHire;

import java.util.Random;

import com.akirix.newHire.bst.AkirixBalancedSearchTree;

public class SecondAssignment {	
	
	public static void run() {
		
		//Print a notice that second assignment demo is running
		System.out.println("Running assignment demo 2..");
		
		AkirixBalancedSearchTree tree = new AkirixBalancedSearchTree();
		
		tree = performInsert(tree);
		
		tree.print();
		
		//tree.insert("s");
		
		//tree.print();
		
		//TODO: Do the implementation here..
		
		//Print a notice that second assignment demo is done
		System.out.println("Assignment demo 2 is done.");
	}
	
	public static AkirixBalancedSearchTree performInsert(AkirixBalancedSearchTree tree) {
		final Random rnd = new Random();
		
		String chars = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < 5; i++) {
			int index = rnd.nextInt(chars.length());
			String selection = Character.toString(chars.charAt(index));
			chars = chars.substring(0, index) + chars.substring(index+1);
			
			tree.insert(selection);
		}
		
		return tree;
	}
}
