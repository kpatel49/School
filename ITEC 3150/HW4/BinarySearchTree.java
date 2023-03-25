
/*
 * Class: BinarySearchTree
 * @author Kush Patel
 * Course: ITEC 3150 Spring 2021
 * 
 * This class: contents a Node object class and a method that adds nodes to a BST,
 * and an inOrderTraverseTree method that prints the tree inOrder.
 * 
 * Purpose: to create and print a BST.
 * 
 * */

public class BinarySearchTree {

	Node root;

	public void add(String word, String value) {
		Node newNode = new Node(word, value);

		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;

			Node parent;
			while (true) {
				parent = focusNode;
				if (word.length() < focusNode.word.length()) {
					focusNode = focusNode.left;
					if (focusNode == null) {
						parent.left = newNode;
						return;
					}
				} else {
					focusNode = focusNode.right;
					if (focusNode == null) {
						return;
					}
				}

			}
		}

	}

	public void inOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			inOrderTraverseTree(focusNode.left);

			System.out.println(focusNode);

			inOrderTraverseTree(focusNode.right);
		}
	}
}

class Node {

	String word;
	String value;

	Node left;
	Node right;

	public Node(String word, String value) {
		super();
		this.word = word;
		this.value = value;
	}

	@Override
	public String toString() {
		return "word=" + word + ", count=" + value;
	}

}