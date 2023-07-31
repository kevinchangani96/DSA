package LinkedList.LinkedList;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;


//1. Done   Create, insert, delete, print, update, find in singly linked list
//2. Done   Count nodes / length of linked list
//3. Done   Print linked list in reverse
//4. Done   Get nth node in linked list
//5. Done   Get nth node from end in  linked list
//6. Done   Given only a pointer to a node to be deleted in a singly linked list, how do you delete it? (head not given)
//7. Done   Create and print circular linked list without tail node
//8.        Exchange first and last nodes in Circular Linked List
//9. Done   Print middle node of the linked list
//10.Done   Remove duplicates from a sorted linked list
//11.Done   Reverse a linked list
//12.Done   Check if linked list is circular linked list
//13.Done   Count nodes in circular linked list
//14.Done   Detect loop in linked list
//15.Done   Find length of loop in linked list
//16.Done   Remove duplicates from singly linked list

public class Linkedlist {


    public static void main(String[] args) {
        Linklist1 list = new Linklist1();
        list.insert(10);
        list.insert(20);
        list.insert(40);
        list.tail.next = list.head.next;
//        list.insert(20);
//        list.disply();
//        list.delete(10);
//        list.getNthnode(2);
////        list.disply();
//        System.out.println();
//        list.getNthNodefromLast(2);
//        list.deleteNotHead(list.head.next);
//        System.out.println();
//        list.disply();
//        System.out.println(list.detectloop());
//      list.countnodeinloop();
//      list.update(1,20);
        list.circularInsert(10);
        list.printCircular();

    }

}

class Linklist1 {
    Node head;
    Node tail;

    public void insert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }

    }

    public void disply() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.data == data && temp.next == tail) {
                temp.next = null;
                tail = temp;
                return;
            } else if (temp.next.data == data) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void getNthnode(int n) {
        int c = 1;
        Node temp = head;
        while (c != n) {
            temp = temp.next;
            c++;
        }
        System.out.print(temp.data);
    }

    public void getNthNodefromLast(int n) {
        int c = 0;
        Node t = head;
        while (t != null) {
            c++;
            t = t.next;
        }
        int ans = c - n + 1;

        Node temp = head;
        int count = 1;
        while (count != ans) {
            count++;
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public void deleteNotHead(Node temp) {
        temp.data = temp.next.data;
        temp.next = temp.next.next;

    }

    public boolean detectloop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void countnodeinloop() {
        Node slow = head;
        Node fast = head;
        boolean hasLoop = false;

        // Detect the loop using Floyd's cycle detection algorithm
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }


        // Count the nodes in the loop
        int count = 1;
        fast = fast.next;
        while (slow != fast) {
            count++;
            fast = fast.next;
        }

        System.out.println(count);
        ;
    }

    public void update(int inx, int value) {
        Node temp = head;
        int count = 1;

        while (temp != null && count != inx) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Wrong Index");
        }
        temp.data = value;
    }

    public void circularInsert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
            nn.next = head;
        } else {
            tail.next = nn;
            tail = nn;
            tail.next = head;
        }
    }

    public void printCircular() {
        Node curr = head;
        if(head==null){
            System.out.println("List is Empty");
        }else{
            System.out.println("Circular list:");
            do {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }while (curr!=head);
        }
    }
    }



class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}