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
			this.left = null;
			this.right = null;
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
	
	public AkirixBalancedSearchTree() {
		this.root = null;
	}
	
	public void insert(String value) {
		
		root = insert(root, value);
		root.setColor(BLACK);
	}
	
	private Node insert(Node node, String value) {
		
		if(node == null) {
			return new Node(value, 1, RED);
		}
		
		int compare = value.compareToIgnoreCase(root.getValue());
		
		//The root value is greater
		if(compare > 0) {
			//Insert on the right side
			node.setRight(insert(node.getRight(), value));
		}
		
		//The value we're adding is greater
		if(compare < 0) {
			//insert on the left side
			node.setLeft(insert(node.getLeft(), value));
		}
		
		//Need to rotate left if right is red while left is black
		if(isRed(node.getRight()) && !isRed(node.getLeft())) {
			node = rotateLeft(node);
		}
		//Need to rotate right if left and left's left are both red
		
		//Need to flip colors if both left and right children are red
		
		//Set the side
		//node.setSize(node.getLeft().getSize() + node.getRight().getSize());
		
		return node;
	}
	
	public void remove(String value) {
		
		root = remove(root, value);
	}
	
	private Node remove(Node node, String value) {
		
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
		print(0, root);
	}
	
	private void print(int nestings, Node node) {
		System.out.print(makeSpacer(nestings) + (node == null ? "NULL" : node.getValue()));
		System.out.print("\n");
		if(node != null) {
			if(node.getLeft() != null) {
				if(isRed(node)) print(nestings, node.getLeft());
				else print(nestings + 1, node.getLeft());
			}
			if(node.getRight() != null) {
				if(isRed(node)) print(nestings, node.getRight());
				else print(nestings + 1, node.getRight());
			}
		}
	}
	
	private String makeSpacer(int nestings) {
		String spacer = "";
		for(int i = nestings; i > 0; i--) {
			if(i > 1) {
				spacer += " ";
			}
			else if(i == 1) {
				spacer += "+-";
			}
			else spacer += "\\|";
		}
		return spacer;
	}
	
	private Node rotateLeft(Node node) {
		
		//Make temp node and switch root left and temp right nodes
		Node x = node.getRight();
		node.setRight(x.getLeft());
		x.setLeft(node);
		
		//Switch root color and temp color
		x.setColor(node.getColor());
		node.setColor(RED);
		
		//Switch size and adjust root nodes size to reflect new structure
		x.setSize(node.getSize());
		//node.setSize(1 + node.getLeft().getSize() + node.getRight().getSize());
		return x;
	}
	
	private Node rotateRight(Node node) {
		
		//Make temp node and switch root right and temp left nodes
		Node x = node.getLeft();
		node.setLeft(x.getRight());
		x.setRight(node);
		
		//Switch root color and temp color
		x.setColor(node.getColor());
		node.setColor(RED);
		
		//Switch size and adjust root nodes size to reflect new structure
		x.setSize(node.getSize());
		//node.setSize(1 + node.getLeft().getSize() + node.getRight().getSize());
		return x;
	}
	
	private void flipColors(Node node) {
		
		//Set root node red and child left and right nodes black
		node.setColor(RED);
		node.getLeft().setColor(BLACK);
		node.getRight().setColor(BLACK);
	}
	
	private boolean isRed(Node x) {
		if(x == null) return false;
		return x.getColor() == RED;
	}
	
	private boolean isBlack(Node x) {
		if(x == null) return true;
		return x.getColor() == BLACK;
	}
}
