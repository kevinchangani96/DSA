package LinkedList.DoublyLinkList.insert_update_delete;

import com.sun.source.tree.WhileLoopTree;

public class first {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
//        linkedList.print();
//        System.out.println();
        linkedList.delete(10);
        linkedList.print();
        System.out.println();
        linkedList.reverseprint();


    }

}

class LinkedList {
    Node Head;
    Node tail;

    public void insert(int i) {
        Node nn = new Node(i);
        if (Head == null) {
            Head = nn;
            tail = nn;
        } else {
            nn.prev = tail;
            tail.next = nn;
            tail = nn;
        }
    }

    public void print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");

            temp = temp.next;
        }
    }

    public void reverseprint() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public void delete(int value) {
        if (Head.data==value&&Head==tail ) {
            Head=null;
            tail=null;
        }
        else if (Head.data==value){
            Head.next.prev=null;
            Head=Head.next;

        }
        else {
            Node pre=Head;
            Node Cur=Head.next;
            while (Cur.data!=value){
                pre=Cur;
                Cur=Cur.next;
            }
            if (Cur.next==null){
                pre.next=null;
                tail=Cur.prev;
            }
            else {
                Cur.next.prev=Cur.prev;
                pre.next=Cur.next;
            }
        }
    }
}


class Node {
    int data;
    Node next, prev;

    public Node(int data) {
        this.data = data;
    }
}
