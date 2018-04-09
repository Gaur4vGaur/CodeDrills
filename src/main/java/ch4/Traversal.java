package ch4;

import java.util.LinkedList;
import java.util.List;

public class Traversal {

    public static void main(String[] args) {
    	BinaryTree bt = new BinaryTree();
    	bt.sampleTree();
    	System.out.println("breadthFirstTraversal");
		breadthFirstTraversal(bt);

		System.out.println("\npreOrderTraversal");
		preOrderTraversal(bt.root);

		System.out.println("\npostOrderTraversal");
		postOrderTraversal(bt.root);

		System.out.println("\ninOrderTraversal");
		inOrderTraversal(bt.root);

		System.out.println();
    }

    static void breadthFirstTraversal(BinaryTree bt) {
    	LinkedList<Node> tracker = new LinkedList<>();
		tracker.add(bt.root);
		System.out.println(bt.root.key);

		while(!tracker.isEmpty()) {
		    Node n = tracker.removeFirst();	    
		    if(n.left != null) {
		    	System.out.print(n.left.key);
		    	tracker.add(n.left);
		    }

		    if(n.right != null) {
		    	System.out.print("    " + n.right.key + "\n");
		    	tracker.add(n.right);
		    }
		}
    }

    static void preOrderTraversal(Node nd) {
    	if(nd != null) {
    		System.out.print(nd.key + "\t");

    		preOrderTraversal(nd.left);
    		preOrderTraversal(nd.right);
    	}
    }

    static void postOrderTraversal(Node nd) {
    	if(nd != null) {
    		postOrderTraversal(nd.left);
    		postOrderTraversal(nd.right);
    		System.out.print(nd.key + "\t");
    	}
    }

    static void inOrderTraversal(Node nd) {
    	if(nd != null) {
    		inOrderTraversal(nd.left);
    		System.out.print(nd.key + "\t");
    		inOrderTraversal(nd.right);
    	}
    }
}
	