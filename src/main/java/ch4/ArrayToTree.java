package ch4;

import java.util.LinkedList;
import java.util.List;

public class ArrayToTree {
    public static void main(String[] args) {
	BinaryTree bt = new BinaryTree();
	bt.sampleTree();
	LinkedList<Node> tracker = new LinkedList<>();
	tracker.add(bt.root);
	System.out.println("root" + bt.root.key);

	while(!tracker.isEmpty()) {
	    Node n = tracker.removeFirst();
	    System.out.println(n.left.key + "    " + n.right.key);
	    if(n.left != null) tracker.add(n.left);
	    if(n.right != null) tracker.add(n.right);
	}
	
    }
}
