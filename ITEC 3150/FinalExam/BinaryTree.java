
//A binary tree node 
class Node {
	int data;
	Node left, right;

	Node(int d) {
		data = d;
		left = right = null;
	}
}

class Index {
	int index = 0;
}

class BinaryTree {

	Index index = new Index();

	// A recursive function to construct binary tree from array pre[].
	// preIndex is used to keep track of index in pre[].
	Node constructTreeUtil(int pre[], Index preIndex, int low, int high, int size) {

		// Base case
		if (preIndex.index >= size || low > high) {
			return null;
		}

		// The first node in preorder traversal is root. So take the node at
		// preIndex from pre[] and make it root, and increment preIndex
		Node root = new Node(pre[preIndex.index]);
		preIndex.index = preIndex.index + 1;

		// If the current subarry has only one element, no need to recur
		if (low == high) {
			return root;
		}

		// Search for the first element greater than root
		int i;
		for (i = low; i <= high; ++i) {
			if (pre[i] > root.data) {
				break;
			}
		}

		// Use the index of element found in preorder to divide
		// preorder array in two parts. Left subtree and right subtree
		root.left = constructTreeUtil(pre, preIndex, preIndex.index, i - 1, size);
		root.right = constructTreeUtil(pre, preIndex, i, high, size);

		return root;
	}

	// The main function to construct BST from given preorder traversal.
	// This function mainly uses constructTreeUtil()
	Node constructTree(int pre[], int size) {
		return constructTreeUtil(pre, index, 0, size - 1, size);
	}

/////////////YOUR CODE HERE 
	// A utility function to print inorder traversal of a Binary Tree
	public void inorderTraversal(Node focuseNode) {
		focuseNode.left = focuseNode;
		inorderTraversal(focuseNode);
		focuseNode.right = focuseNode;

	}

	// A utility function to print preorder traversal of a Binary Tree
	public void preorderTraversal(Node focuseNode) {
		preorderTraversal(focuseNode);
		focuseNode.left = focuseNode;
		focuseNode.right = focuseNode;
	}

	// A utility function to print postorder traversal of a Binary Tree
	public void postorderTraversal(Node focuseNode) {
		focuseNode.left = focuseNode;
		focuseNode.right = focuseNode;
		postorderTraversal(focuseNode);
	}

/////////////END OF YOUR CODE HERE 

	// Driver program to test above functions
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		int pre[] = new int[] { 10, 5, 1, 7, 40, 50 };
		int size = pre.length;
		Node root = tree.constructTree(pre, size);
		System.out.println("Inorder traversal of the constructed tree is ");

		///////// YOUR CODE HERE

		// functions calls to print the tree
		System.out.println("Inorder traversal of the constructed tree is ");
		tree.inorderTraversal(root);
		System.out.println("Preorder traversal of the constructed tree is ");
		tree.preorderTraversal(root);
		System.out.println("Postorder traversal of the constructed tree is ");
		tree.postorderTraversal(root);
		///////// END of YOUR CODE HERE
	}
}

//This code has been contributed by Mayank Jaiswal 
