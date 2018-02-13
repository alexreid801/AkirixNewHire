package com.akirix.newHire;

import java.util.Random;

import com.akirix.newHire.bst.AkirixBalancedSearchTree;

public class SecondAssignment {	
	
	private AkirixBalancedSearchTree tree;
	
	private String availChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String usedChars = "";
	
	private final Random rnd = new Random();
	
	public static void run() {
		
		//Print a notice that second assignment demo is running
		System.out.println("Running assignment demo 2..");
		
		//Make a new second assignent with a new search tree in it
		SecondAssignment assn = new SecondAssignment(new AkirixBalancedSearchTree());
		
		//Print a notice that we are performing the insert demo
		System.out.println("Running the insert demo..");
		
		//Perform the insert demo
		assn.performInsert();
		
		//Print the representation of the tree
		assn.tree.print();
		
		//Print a notice that we are performing the find demo
		System.out.println("Running the find demo..");
		
		//Perform the find demo
		assn.performFind();
		
		//Print a notice that we are performing the remove demo
		System.out.println("Running the remove demo..");
		
		//Perform the remove demo
		assn.performRemove();
		
		//Print the final representation of the tree (to show removed nodes)
		assn.tree.print();
		
		//Print a notice that second assignment demo is done
		System.out.println("Assignment demo 2 is done.");
	}

	private SecondAssignment(AkirixBalancedSearchTree tree) {
		this.tree = tree;
	}
	
	private void performInsert() {
		
		//Print a notice that we are about to add 18 letters to the tree
		System.out.println("Adding 18 random letters to the tree..");
		
		//Insert 18 random 'available characters' to the tree.  Also add them to 'used characters'
		for(int i = 0; i < 18; i++) {
			int index = rnd.nextInt(availChars.length());
			String selection = Character.toString(availChars.charAt(index));
			availChars = availChars.substring(0, index) + availChars.substring(index + 1);
			usedChars += selection;
			tree.insert(selection);
		}
		
		//Print a notice that we are about to try to add 4 letters that are already in the tree
		System.out.println("Trying to add 4 random letters that are already in the tree..");
		
		//Try to insert 4 random 'used characters' to the tree.
		for(int i = 0; i < 4; i++) {
			int index = rnd.nextInt(usedChars.length());
			String selection = Character.toString(usedChars.charAt(index));
			usedChars = usedChars.substring(0, index) + usedChars.substring(index + 1);
			tree.insert(selection);
		}
	}
	
	private void performFind() {
		
		//Print a notice that we are about to try to find 4 letters that exist in the tree
		System.out.println("Trying to find 4 letters that are in the tree..");
		
		//Try to find 4 random 'used characters' in the tree.
		for(int i = 0; i < 4; i++) {
			int index = rnd.nextInt(usedChars.length());
			String selection = Character.toString(usedChars.charAt(index));
			usedChars = usedChars.substring(0, index) + usedChars.substring(index + 1);
			boolean found = tree.find(selection);
			printFoundResult(selection, found);
		}
		
		//Print a notice that we are about to try to find 4 letters that do not exist in the tree
		System.out.println("Trying to find 4 letters that are not in the tree..");
		
		//Try to find 4 random 'available characters' in the tree.
		for(int i = 0; i < 4; i++) {
			int index = rnd.nextInt(availChars.length());
			String selection = Character.toString(availChars.charAt(index));
			availChars = availChars.substring(0, index) + availChars.substring(index + 1);
			boolean found = tree.find(selection);
			printFoundResult(selection, found);
		}
	}
	
	private void performRemove() {
		
		//Print a notice that we are about to remove 4 letters that exist in the tree
		System.out.println("Removing 4 letters that are in the tree..");
		
		//Try to remove 4 random 'used characters' in the tree.
		for(int i = 0; i < 4; i++) {
			int index = rnd.nextInt(usedChars.length());
			String selection = Character.toString(usedChars.charAt(index));
			usedChars = usedChars.substring(0, index) + usedChars.substring(index + 1);
			tree.remove(selection);
			printRemoveResult(selection);
		}
		
		//Print a notice that we are about to try to remove 4 letters that do not exist in the tree
		System.out.println("Trying to remove 4 letters that are not in the tree..");
		
		//Try to remove 4 random 'available characters' in the tree.
		for(int i = 0; i < 4; i++) {
			int index = rnd.nextInt(availChars.length());
			String selection = Character.toString(availChars.charAt(index));
			availChars = availChars.substring(0, index) + availChars.substring(index + 1);
			tree.remove(selection);
			printRemoveResult(selection);
		}
	}
	
	private static void printFoundResult(String value, boolean found) {
		System.out.println("The letter " + value + (found ? " was found" : " was not found") + " in the tree.");
	}
	
	private static void printRemoveResult(String value) {
		System.out.println("The letter " + value + " is being removed from the tree.");
	}
}
