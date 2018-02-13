package com.akirix.newHire.bst;

public class AkirixBalancedSearchTree {
	
	private Node root;
	
	private static final boolean RED   = true;
	private static final boolean BLACK = false;
	
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
		
		//Make new node if the node is inexistant
		if(node == null) {
			return new Node(value, 1, RED);
		}
		
		//Create a comparison so we don't have to run compare twice
		int compare = value.compareToIgnoreCase(root.getValue());
		
		//The root value is greater, Insert on the right side
		if(compare > 0) node.setRight(insert(node.getRight(), value));
		
		//The value we're adding is greater, insert on the left side
		if(compare < 0) node.setLeft(insert(node.getLeft(), value));
		
		//Need to rotate left if right is red while left is black
		if(isRed(node.getRight()) && isBlack(node.getLeft())) {
			node = rotateLeft(node);
		}
		
		//Need to rotate right if left and left's left are both red
		if(isRed(node.getLeft()) && isRed(node.getLeft().getLeft())) {
			node = rotateRight(node);
		}
		
		//Need to flip colors if both left and right children are red
		if(isRed(node.getLeft()) && isRed(node.getRight())) {
			flipColors(node);
		}
		
		//Set the side
		node.setSize(size(node.getLeft()) + size(node.getRight()) + 1);
		
		return node;
	}
	
	public void remove(String value) {
		root = remove(root, value);
	}
	
	private Node remove(Node node, String value) {
		
		int compare = value.compareToIgnoreCase(root.getValue());
		
		//The current nodes value is greater
		if(compare > 0) {
		}
		
		//The value we're removing is greater
		if(compare < 0) {
		}
		
		return node;
	}
	
	public boolean find(String value) {
		return find(root, value) != null;
	}
	
	public Node find(Node node, String value) {
		
		if(node == null) return null;
		
		int compare = value.compareToIgnoreCase(node.getValue());
		
		//The current node value is greater
		if(compare > 0) {
			node = find(node.getLeft(), value);
		}
		
		//The value we're looking for is greater
		if(compare < 0) {
			node = find(node.getRight(), value);
		}
		
		return node;
	}
	
	public void print() {
		print(root, "", true);
	}
	
	public void print(Node node, String indent, boolean isLast) {
		
		System.out.print(indent);
		if(isLast) {
			System.out.print("\\-");
			indent += "  ";
		}
		else {
			System.out.print("|-");
			indent += "| ";
		}
		System.out.print(print(node) + "\n");
		if(node != null) {
			print(node.getLeft(), indent, false);
			print(node.getRight(), indent, true);
		}
	}
	
	private String print(Node node) {
		if(node == null) return "NULL";
		return node.getValue() + ":" + (isRed(node) ? "RED" : "BLACK");
	}
	
	private void print(int nestings, Node node) {
		System.out.print(makeSpacer(nestings) + (node == null ? "NULL" : node.getValue()));
		System.out.print("\n");
		if(node != null) {
			if(isRed(node.getLeft())) print(nestings, node.getLeft());
			if(isBlack(node.getLeft())) print(nestings + 1, node.getLeft());
			if(isRed(node.getRight())) print(nestings, node.getRight());
			if(isBlack(node.getRight())) print(nestings + 1, node.getRight());
		}
	}
	
	private static String makeSpacer(int nestings) {
		String spacer = "";
		for(int i = nestings; i > 0; i--) {
			if(i > 1) {
				spacer += "  ";
			}
			else if(i == 1) {
				spacer += "+-";
			}
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
		node.setSize(1 + size(node.getLeft()) + size(node.getRight()));
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
		node.setSize(1 + size(node.getLeft()) + size(node.getRight()));
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
	
	private int size(Node node) {
		if(node == null) return 0;
		return node.getSize();
	}
}
