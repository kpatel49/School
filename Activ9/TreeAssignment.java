
public class TreeAssignment {

	// DO NOT CHANGE LINES IN MAIN- YOU MAY ADD AT BOTTOM BUT NOT REMOVE ANY LINES
	public static void main(String[] args) {

		// create int tree with 10 random elements
		// you may make this smaller for testing
		IntTree theTree = new IntTree(3);

		// print the tree
		theTree.printStructure();

		// call already developed routine to count even branches - this
		// counts branches with even nodes, not even leaf nodes
		int evenCount = theTree.countEvenBranches();
		System.out.println("There are " + evenCount + " even branches");

		// call user developed routine to count left Nodes
		int leftNodes = theTree.countLeftNodes();

		System.out.println("The number of left nodes is " + leftNodes);

		// call second user developed routine to sum the values of all the integers in
		// the tree
		int totalSum = theTree.sumNodes();
		System.out.println("The total sum is " + totalSum);

	}

}
