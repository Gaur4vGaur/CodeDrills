package ch4;

class Node {
    int key;
    Node left, right;
 
    public Node(int item) {
        key = item;
        left = right = null;
    }
}
 
public class BinaryTree {

    Node root;
    public BinaryTree(int key) {
        root = new Node(key);
    }
 
    public BinaryTree() {
        root = null;
    }

    public void sampleTree() {
        Node l1 = new Node(2);
        l1.left = new Node(4);
        l1.right = new Node(5);

        Node r1 = new Node(3);
        r1.left = new Node(6);
        r1.right = new Node(7);

        Node rt = new Node(1);
        rt.left = l1;
        rt.right = r1;
        
        this.root = rt;
    }
}