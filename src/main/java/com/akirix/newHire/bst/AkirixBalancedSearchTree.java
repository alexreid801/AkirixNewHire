package com.akirix.newHire.bst;

public class AkirixBalancedSearchTree {
	
	private Node root;
	
	private static final boolean RED   = true;
	private static final boolean BLACK = true;
	
	class Node {
		
		private String value;
		private Node left, right;
		private int size;
		private boolean color;
		
		public Node(String value, int size, boolean color) {
			this.value = value;
			this.size = size;
			this.color = color;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public boolean getColor() {
			return color;
		}

		public void setColor(boolean color) {
			this.color = color;
		}
	}
	
	public void insert(String value) {
		
		root = insert(root, value);
		root.setColor(BLACK);
	}
	
	public Node insert(Node node, String value) {
		
		if(node == null) {
			node = new Node(value, 1, RED);
		}
		
		int compare = value.compareToIgnoreCase(root.getValue());
		
		//The root value is greater
		if(compare > 0) {
			//insert on the left side
			node.setLeft(insert(node.getLeft(), value));
		}
		
		//The value we're adding is greater
		if(compare < 0) {
			//Insert on the right side
			node.setRight(insert(node.getLeft(), value));
		}
		
		return node;
	}
	
	public void remove(String value) {
		
		root = remove(root, value);
	}
	
	public Node remove(Node node, String value) {
		
		int compare = value.compareToIgnoreCase(root.getValue());
		
		//The root value is greater
		if(compare > 0) {
		}
		
		//The value we're removing is greater
		if(compare < 0) {
		}
		
		return node;
	}
	
	public boolean find(String value) {
		return false;
	}
	
	public void print() {
		
	}
	
	public boolean isRed(Node x) {
		if(x == null) return false;
		return x.getColor() == RED;
	}
	
	public boolean isBlack(Node x) {
		if(x == null) return false;
		return x.getColor() == BLACK;
	}
}
