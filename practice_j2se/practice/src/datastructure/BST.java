package datastructure;

public class BST {

	Node root = null;

	static class Node {
		int d;
		Node left;
		Node right;

		public Node(int x) {
			d = x;
			left = right = null;
		}

	}

	void insert(int x) {
		root = insertData(x, root);
	}

	Node insertData(int x, Node root) {
		if (root == null) {
			root = new Node(x);
		}
		if (x < root.d) {
			root.left = insertData(x, root.left);
		}
		if (x > root.d) {
			root.right = insertData(x, root.right);
		}
		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.d + " ");
			inorderRec(root.right);
		}
	}

	void preorder() {
		preorderRec(root);
	}

	void preorderRec(Node root) {
		if (root != null) {
			System.out.print(root.d + " ");
			preorderRec(root.left);
			preorderRec(root.right);
		}
	}

	void postorder() {
		postorderRec(root);
	}

	void postorderRec(Node root) {
		if (root != null) {
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.print(root.d + " ");
		}
	}

	void delete(int k) {
		root = deleteKey(root, k);
	}

	Node deleteKey(Node root, int k) {
		if (root == null)
			return root;
		if (k < root.d) {
			root.left = deleteKey(root.left, k);
		} else if (k > root.d) {
			root.right = deleteKey(root.right, k);
		} else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			root.d = minValue(root.right);
			root.right = deleteKey(root.right, root.d);

		}
		return root;
	}

	int minValue(Node root) {
		int minv = root.d;
		while (root.left != null) {
			minv = root.left.d;
			root = root.left;
		}
		return minv;
	}

	public static void main(String[] args) {
		BST tree = new BST();
		/*
		 * bst.insert(7); bst.insert(5); bst.insert(4); bst.insert(6);
		 * bst.insert(2); System.out.println("inoder "); bst.inorder();
		 * System.out.println(); System.out.println("preoder "); bst.preorder();
		 * System.out.println(); System.out.println("postoder ");
		 * bst.postorder();
		 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.println("Inorder traversal of the given tree");
		tree.inorder();

		System.out.println("\nDelete 20");
		tree.delete(20);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder();

		System.out.println("\nDelete 30");
		tree.delete(30);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder();

		System.out.println("\nDelete 50");
		tree.delete(50);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder();
	}
}
