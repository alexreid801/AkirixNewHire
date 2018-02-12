package com.akirix.newHire.bst;

public class AkirixBalancedSearchTree<Key extends Comparable<Key>> {
	
	private Node root;
	
	private static final boolean RED   = true;
	private static final boolean BLACK = true;
	
	class Node {
		
		private Key key;
		private String value;
		private Node left, right;
		private int size;
		private boolean color;
		
		public Node(Key key, String value, int size, boolean color) {
			this.key = key;
			this.value = value;
			this.size = size;
			this.color = color;
		}

		public Key getKey() {
			return key;
		}

		public void setKey(Key key) {
			this.key = key;
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
		
	}
	
	public void remove(String value) {
		
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
