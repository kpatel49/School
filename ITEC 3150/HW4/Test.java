
/*
 * Class: Test
 * @author Kush Patel
 * Course: ITEC 3150 Spring 2021
 * 
 * This class: test the BST
 * 
 * Purpose: to test if Nodes are being added or not and to print the output.
 * 
 * */

import java.io.FileNotFoundException;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		addNode();

	}

	public static void addNode() throws FileNotFoundException {

		Read read = new Read();

		BinarySearchTree tree = new BinarySearchTree();

		HashMap<String, Integer> list = read.setList("CarlAndTheCottonGin.txt");

		for (String name : list.keySet()) {

			String key = name.toString();
			String value = list.get(name).toString();
			tree.add(key, value);
		}
		tree.inOrderTraverseTree(tree.root);
	}

}
