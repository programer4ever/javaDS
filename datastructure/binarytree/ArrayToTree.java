package datastructure.binarytree;

public class ArrayToTree {
	
	//{ 1, 5, 5, 2, 2, -1, 3 }  // parent of the Node
	//  0  1  2  3  4  5   6    // value of the Node
	/*
	 *       5
	 *      / \
	 *     1   2
	 *    /   / \
	 *   0   3   4
	 *      /
	 *     6 
	 */  
	static BinaryTree bt = new BinaryTree();
	
	public static BinaryTree createTreeFromArray(Integer[] parentArray, int i, Node[] created) {
		//{ 1, 5, 5, 2, 2, -1, 3 }  // parent of the Node
		//  0  1  2  3  4  5   6    // value of the Node
		if (created[i] != null) {
			if (parentArray[i] != -1) {
				if (created[parentArray[i]] != null) {
					return null;
				} else {
					created[parentArray[i]] = new Node(parentArray[i]);
					created[parentArray[i]].left = created[i];
				}
				return null;
			} else {
				bt.root = created[i];
				return null;
			}
		}
		Node node = new Node(i);
		created[i] = node;
		if (parentArray[i] == -1) {
			bt.root = node;
			return null;
		} else {
			if (created[parentArray[i]] == null ) {
				created[parentArray[i]] = new Node(parentArray[i]);
				created[parentArray[i]].left = node;
			} else { 
				if (created[parentArray[i]].left == null) {
					created[parentArray[i]].left = node;
				} else {
					created[parentArray[i]].right = node;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Integer[] parentArray = { 1, 5, 5, 2, 2, -1, 3 };
		Node[] created = new Node[parentArray.length];
		for (int i = 0 ; i < parentArray.length ; i++) {
			createTreeFromArray(parentArray, i, created);
		}
		System.out.println("Inorder Traversal : ");
		Traversal.inOrderTraversal(bt.root);
		System.out.println("\nPreOrder Traversal : ");
		Traversal.preOrderTraversal(bt.root);
		System.out.println("\nPostOrder Traversal : ");
		Traversal.postOrderTraversal(bt.root);
        System.out.println("\nLevel traversal : ");
        TraversalBFS.treeLevelTraversal(bt);
	}

}
