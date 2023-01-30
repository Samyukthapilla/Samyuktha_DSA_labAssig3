package com.sumofpair;

	public class Node_driver {
		public static void main(String[] args)
	    {
	        BinarySearchTree tree = new BinarySearchTree();

	        tree.insert(40);
	        tree.insert(20);
	        tree.insert(60);
	        tree.insert(10);
	        tree.insert(30);
	        tree.insert(50);
	        tree.insert(70);

	        boolean test
	                = tree.isPairPresent(tree.root, tree.root, 60);
	        if (!test)
	            System.out.println("No such values are found!");
	    }

	}


