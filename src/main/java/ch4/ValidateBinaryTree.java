package ch4;

public class ValidateBinaryTree {

    private static int[] array = null;
    private static int index;

    private static void fillArray(Node node) {
        if(node != null) {
            fillArray(node.left);
            array[++index] = node.key;
            fillArray(node.right);
        }
    }
    
    public static boolean isValidBinaryTree(Node root, int size) {
        boolean isValid = true;
        if(root != null) {
            array = new int[size];
            index = -1;
            fillArray(root);

            for(int i = 1; i < array.length; i++) {
                if(array[i-1] > array[i]) {
                    isValid = false;
                    break;
                }
            }
        }

        return isValid;
    }

    public static void main(String[] args) {
        BinaryTree bt = sampleTree();
        BinaryTree bt1 = new BinaryTree();
        bt1.sampleTree();

        System.out.println(isValidBinaryTree(bt.root, 7));
        System.out.println(isValidBinaryTree(bt1.root, 7));
    }

    public static BinaryTree sampleTree() {
        BinaryTree bt = new BinaryTree();
        Node l1 = new Node(5);
        l1.left = new Node(3);
        l1.right = new Node(7);

        Node r1 = new Node(20);
        r1.left = new Node(15);
        r1.right = new Node(22);

        Node rt = new Node(10);
        rt.left = l1;
        rt.right = r1;
        
        bt.root = rt;
        return bt;
    }
    
}