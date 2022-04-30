package datastructure.binarytree;

public class TraversalBFS {
	
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
	//Height of empty tree is -1, 
	//height of tree with one node is 0 

	public static int height (Node node) {
		if (node == null) {
			return -1;
		}
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		if (leftHeight > rightHeight)
			return leftHeight +1;
		else 
			return rightHeight + 1;
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

   public static void main (String[] s) {
	   BinaryTree bt = doCreate();
	   System.out.println("Height of Binary Tree is : " + height(bt.root));
   }
}
