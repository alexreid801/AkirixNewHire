package com.akirix.newHire.bst;

public class AkirixBalancedSearchTree<Key extends Comparable<Key>, Value> {
	
	class Node {
		
		private Key key;
		private Value value;
		private Node left, right;
		private int size;
		
		Node(Key key, Value value, int size) {
			this.setKey(key);
			this.setValue(value);
			this.setSize(size);
		}

		public Key getKey() {
			return key;
		}

		public void setKey(Key key) {
			this.key = key;
		}

		public Value getValue() {
			return value;
		}

		public void setValue(Value value) {
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
	}
}
