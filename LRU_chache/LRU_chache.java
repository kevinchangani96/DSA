package LRU_chache;

import java.util.LinkedList;

public class LRU_chache {

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insert(10);
    }


}

class linkedlist {
    Node head;
    Node tail;

    public void insert(int i) {
        Node nn = new Node(i);
         if (head == null) {
             head = nn;
            tail = nn;
        } else {
            nn.prev = tail;
            tail.next = nn;
            tail = nn;
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
