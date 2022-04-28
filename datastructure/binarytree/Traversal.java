package datastructure.binarytree;
/*
 * Sample Binary Tree 
 * 
 *            1
 *         /     \  
 *       2         3
 *      / \       / \
 *    4    5     6   7
 *   /    / \         \ 
 *  8    10  11        9
 *            \
 *            12
 *             \
 *              13
 *  
 */

public class Traversal {
	
	
	public static void inOrderTraversal(Node n) {
		
		if (n.left != null) {
			inOrderTraversal(n.left);
		}
		System.out.print(" " + n.value);
		
		if (n.right != null) {
			inOrderTraversal(n.right);
		}
	}

	public static BinaryTree doCreate() {
		System.out.println("Binary Tree Creation");
		BinaryTree bt = new BinaryTree(new Node(1));
		// setting left side tree
		bt.root.left = new Node(2);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.left.right.left = new Node(10);
		bt.root.left.right.right = new Node(11);
		Node rightNode = bt.root.left.right.right;
		rightNode.right = new Node(12);
		rightNode.right.right = new Node (13);
		bt.root.left.left.left = new Node(8);
		//setting right side tree
		bt.root.right = new Node(3);
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);
		bt.root.right.right.right = new Node(9);
		return bt;
	}

	public static void preOrderTraversal(Node n) {
		System.out.print(" " + n.value);
		if (n.left != null) {
			preOrderTraversal(n.left);
		}
		if (n.right != null) {
			preOrderTraversal(n.right);
		}
	}

	public static void postOrderTraversal(Node n) {
		if (n.left != null) {
			postOrderTraversal(n.left);
		}
		if (n.right != null) {
			postOrderTraversal(n.right);
		}
		System.out.print(" " + n.value);
	}

	public static void main(String[] args) {
		BinaryTree bt = doCreate();
		System.out.println("Binary Tree Traversal : "+ "\n");
		System.out.println("Binary Tree Traversal InOder : ");
		inOrderTraversal(bt.root);
		System.out.println("\n\n Binary Tree Traversal PreOrder : ");
		preOrderTraversal(bt.root);
		System.out.println("\n\n Binary Tree Traversal PostOrder : ");
		postOrderTraversal(bt.root);
	}

}
