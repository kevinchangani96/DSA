package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

//              10
//            20      30
//        40    50    60  70
public class BinaryTreeSample {
    public static void main(String[] args) {
        tree Binarytree = new tree();
        Node r = new Node(10);
        Binarytree.root = r;
        r.left = new Node(20);
        r.right = new Node(30);
        r.left.left = new Node(40);
        r.left.right = new Node(50);
        r.right.left = new Node(60);
        r.right.right = new Node(70);

        tree.printlevelorder();
        System.out.println();
        tree.preorderprint();
        System.out.println();
        tree.inorderprint();
        System.out.println();
        tree.postorderprint();
        System.out.println();

    }


}

class tree {
    static Node root;

    public static void printlevelorder() {
        System.out.println("Level order Binary Tree");
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data+ " ");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public static void preorderprint() {
        System.out.println("pre order Binary Tree ");
        preorderprintrecursion(root);
    }

    private static void preorderprintrecursion(Node root) {
        if (root==null){
            return;
        }
        System.out.print(root.data+ " ");
        preorderprintrecursion(root.left);
        preorderprintrecursion(root.right);
    }

    public static void inorderprint() {
        System.out.println("in order Binary Tree ");
        inorderprintrecursion(root);
    }

    private static void inorderprintrecursion(Node root) {
        if (root==null){
            return;
        }
        preorderprintrecursion(root.left);
        System.out.print(root.data+ " ");
        preorderprintrecursion(root.right);
    }

    public static void postorderprint() {
        System.out.println("post order Binary Tree ");
        postorderprintrecursion(root);
    }

    private static void postorderprintrecursion(Node root) {
        if (root==null){
            return;
        }
        preorderprintrecursion(root.left);
        preorderprintrecursion(root.right);
        System.out.print(root.data+ " ");
    }
    }




class Node {
    int data;
    Node left, right;

    public Node(int i) {
        this.data = i;
    }
}
