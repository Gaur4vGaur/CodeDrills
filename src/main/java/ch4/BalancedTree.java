package ch4;

/**
 * The prgoram finds out if the tree is balanced
 * Balanced tree must not have difference of 1 in height for
 * left node and right node
 *
 **/
public class BalancedTree {

    private static int findHeightDifference(Node node, int height) {
        if(node != null) {
            int leftHt = findHeightDifference(node.left, height + 1);
            int rightHt = findHeightDifference(node.right, height + 1);
            int htDiff = Math.abs(leftHt) - Math.abs(rightHt);

            if(leftHt == -1 || rightHt == -1 || Math.abs(htDiff) > 1) {
                return -1;
            } else if(leftHt > rightHt) {
                return leftHt;
            } else {
                return rightHt;
            }
        }

        return height;
    }

    public static boolean isBalanced(Node root) {
        int htDiff = findHeightDifference(root, 0);
        boolean isBalanced = true;

        if(htDiff < 0) {
            isBalanced = false;
        }

        return isBalanced;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.sampleTree();

        Node newLeftHeavyNode = new Node(8);
        newLeftHeavyNode.left = new Node(9);

        Node newRightHeavyNode = new Node(8);
        newRightHeavyNode.right = new Node(9);

        BinaryTree btl = new BinaryTree();
        btl.sampleTree();
        btl.leftMostNode(btl.root).left = newLeftHeavyNode;

        BinaryTree btr = new BinaryTree();
        btr.sampleTree();
        btr.rightMostNode(btr.root).right = newRightHeavyNode;

        BinaryTree bt1 = new BinaryTree();
        bt1.sampleTree();
        bt1.rightMostNode(bt1.root).left = newLeftHeavyNode;

        System.out.println(isBalanced(bt.root));
        System.out.println(isBalanced(btl.root));
        System.out.println(isBalanced(btr.root));
        System.out.println(isBalanced(bt1.root));
    }
}