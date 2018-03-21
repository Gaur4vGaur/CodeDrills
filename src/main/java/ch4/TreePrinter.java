package ch4;

import ch4.BinaryTree;
import java.util.LinkedList;
import java.util.ArrayList;

public class TreePrinter {

	private static ArrayList<LinkedList<Integer>> nodeTracker = new ArrayList<LinkedList<Integer>>();
	
	public static void printTree(BinaryTree bt) {
		if(bt == null) {
			System.out.println("null");
			return;
		}
		
		printNodes(bt.root, 0);
		
		for(LinkedList<Integer> ll: nodeTracker)
			for(Integer key: ll)
				System.out.println(key);
	}
	
	private static void printNodes(Node node, int level) {
		if(node == null) return;
	
		if(nodeTracker.get(level) == null) {
			LinkedList<Integer> ll = new LinkedList<>();
			ll.add(node.key);
			nodeTracker.add(level, ll);
		} else {
			nodeTracker.get(level).add(node.key);
		}
		
		printNodes(node.left, level + 1);
		printNodes(node.right, level + 1);
		
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.sampleTree();
		printTree(bt);
	}
}