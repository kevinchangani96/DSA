package BinaryTree;

import javax.print.DocFlavor;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
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

//        tree.printlevelorder();
//        System.out.println();
//        tree.preorderprint();
//        System.out.println();
//        tree.inorderprint();
//        System.out.println();
//        tree.postorderprint();
//        System.out.println();
//        System.out.println(tree.countnode(tree.root));
//        tree.nthnode(tree.root, 5);
//        System.out.println(tree.findnode(tree.root, 10));
//        System.out.println(heightoftree(tree.root));
//        tree.PrintSprialLevel();


        PreLevelPrintWithoutRecursion(tree.root);

    }

    private static void PreLevelPrintWithoutRecursion(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.data + " ");

            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);

            }
        }
    }


    private static int heightoftree(Node root) {
        if (root == null) {
            return -1;
        }
        int leftheight = heightoftree(root.left);
        int rightheight = heightoftree(root.right);
        return 1 + Math.max(leftheight, rightheight);
    }
}

class tree {
    static Node root;
    static int count = 0;

    public static void printlevelorder() {
        System.out.println("Level order Binary Tree");
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");

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
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderprintrecursion(root.left);
        preorderprintrecursion(root.right);
    }

    public static void inorderprint() {
        System.out.println("in order Binary Tree ");
        inorderprintrecursion(root);
    }

    private static void inorderprintrecursion(Node root) {
        if (root == null) {
            return;
        }
        preorderprintrecursion(root.left);
        System.out.print(root.data + " ");
        preorderprintrecursion(root.right);
    }

    public static void postorderprint() {
        System.out.println("post order Binary Tree ");
        postorderprintrecursion(root);
    }

    private static void postorderprintrecursion(Node root) {
        if (root == null) {
            return;
        }
        preorderprintrecursion(root.left);
        preorderprintrecursion(root.right);
        System.out.print(root.data + " ");
    }


    public static int countnode(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countnode(root.left) + countnode(root.right);
    }

    public static void nthnode(Node root, int i) {
        if (root == null) {
            return;
        }
        nthnode(root.left, i);
        count++;
        if (count == i) {
            System.out.println(root.data);
            return;
        }
        nthnode(root.right, i);


    }

    public static boolean findnode(Node root, int i) {
        if (root == null) {
            return false;
        }
        if (root.data == i) {
            return true;
        }
        return findnode(root.left, i) || findnode(root.right, i);
    }

    public static void PrintSprialLevel() {
        Deque<Node> deque = new LinkedList<>();
        boolean isRev = false;
        deque.add(root);
        while (!deque.isEmpty()) {
            if (isRev) {
                int size = deque.size();
                while (size > 0) {
                    Node node = deque.removeLast();
                    System.out.print(node.data + " ");
                    if (node.right != null) {
                        deque.addFirst(node.right);
                    }
                    if (node.left != null) {
                        deque.addFirst(node.left);
                    }
                    size--;
                    System.out.println();
                }
                isRev = !isRev;
            } else {
                int size = deque.size();
                while (size > 0) {
                    Node node = deque.removeFirst();
                    System.out.print(node.data + " ");

                    if (node.left != null) {
                        deque.addLast(node.left);
                    }
                    if (node.right != null) {
                        deque.addLast(node.right);
                    }
                    size--;
                }
                System.out.println();


            }

        }

    }
}


class Node {
    int data;
    Node left, right;

    public Node(int i) {
        this.data = i;
    }
}
