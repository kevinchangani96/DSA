package BinaryTree.BinarySearchTree;

public class solution {
    public static void main(String[] args) {
       BinaryTree binaryTree =new BinaryTree();
       binaryTree.insert(12);
       binaryTree.insert(15);
       binaryTree.insert(17);
       binaryTree.insert(5);
       binaryTree.insert(2);
       binaryTree.insert(10);
       binaryTree.inOrderPrint(binaryTree.root);
       binaryTree.Serch(binaryTree.root,10);
    }
}
class BinaryTree{
    Node root;


    public void insert(int value) {
        root=insert(value,root);
    }

    private Node insert(int value, Node root) {
        if (root==null){
            root=new Node(value);
            return  root;
        }
        else if (value>root.data){
            root.right=insert(value,root.right);
        }
        else {
            root.left=insert(value,root.left);
        }
        return root;
    }

    public void inOrderPrint(Node root) {
        if (root==null){
            return;
        }
        inOrderPrint(root.left);
        System.out.println(root.data);
        inOrderPrint(root.right);
    }

    public boolean Serch(Node root, int value) {
        if (root==null){
            return false;
        }
        if (root.data==value){
            return true;
        }
        if (root.data>value){
            return  Serch(root.left,value);
        }
        return  Serch(root.right,value);
    }
}

class Node{
    int data;
    Node left,right;

    public Node(int data) {
        this.data = data;
    }
}
