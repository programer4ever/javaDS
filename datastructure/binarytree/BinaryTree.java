package datastructure.binarytree;

/*  Simple implementation of binary tree
 * 
 */

public class BinaryTree {
	Node root;
	
	// This is default constructor
	BinaryTree () {
		root = null;
	}
	
	BinaryTree(Node node) {
		root = node;
	}
	
	public static BinaryTree doCreate() {
		System.out.println("Binary Tree Creation");
		BinaryTree bt = new BinaryTree(new Node(2));
		bt.root.left = new Node(1);
		bt.root.right = new Node(8);
		return bt;
	}

	public static void traverse(BinaryTree bt) {
		System.out.println("Traversal of Binary Tree");
	}
	
	public static void main(String[] s) {
		BinaryTree bt = doCreate();
		traverse(bt);
	}

}
