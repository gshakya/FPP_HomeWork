package week3.lesson10;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Question1 {
	public static void main(String[] args) {

		MyBST mybst = new MyBST();

		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);

		}
		mybst.insert(12);
		mybst.insert(12);
		mybst.insert(12);
		mybst.printTree();
		System.out.println("\n" + mybst.size());
		System.out.println("-----PREORDER------\n");
		mybst.preOrder();
		System.out.println("\n-----POSTORDER------");
		mybst.postOrder();

		System.out.println("\nCheck contents:" + mybst.contains(16));
		System.out.println("\nCheck contents:" + mybst.contains(65));

		System.out.println("No of leaf Node:" + mybst.leafNodes());

	}
}

// Demo code for the user implemenation of Binary search tree
class MyBST {
	/** The tree root. */
	private BinaryNode root;
	private int size = 0;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder
	 * Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	public BinaryNode getRoot() {
		return root;
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	public void preOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else
			preOrder(root);
	}

	private void preOrder(BinaryNode t) {
		if (t != null) {
			System.out.print(t.element + ",");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	public void postOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else
			postOrder(root);
	}

	private void postOrder(BinaryNode t) {
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.element + ",");
		}
	}

	public boolean contains(int key) {
		BinaryNode travelingNode = root;
		while (travelingNode != null) {
			if (travelingNode.element == key)
				return true;
			if (travelingNode.element < key)
				travelingNode = travelingNode.right;
			else
				travelingNode = travelingNode.left;
		}
		return false;
	}
	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			size++;
			root = new BinaryNode(x);
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						size++;
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						size++;
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}
			}
		}
	}

	public boolean isLeaf() {
		return isLeaf(root);
	}

	private boolean isLeaf(BinaryNode t) {
		if (t == null)
			return false;
		if (t.left == null && t.right == null)
			return true;
		return false;
	}

	public int size() {
		return size;
	}

	public int leafNodes() {
		return leafNodes(root);
	}

	private int leafNodes(BinaryNode t) {
		if (t == null)
			return 0;
		if (isLeaf(t)) {
			return 1;
		} else
			return (leafNodes(t.left) + leafNodes(t.right));

	}

	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

	}

}