package LinkedList.Circular;

import org.w3c.dom.Node;

import java.util.List;

public class CircularLinkedlist_witout_tailnode {
    ListNode head;
    ListNode temp;

    public static void main(String[] args) {
        CircularLinkedlist_witout_tailnode ll = new CircularLinkedlist_witout_tailnode();
        ll.Circularinsert(10);
        ll.Circularinsert(20);
//        ll.Circularinsert(20);
        ll.Circularinsert(30);
        ll.Circularinsert(50);
        ll.Circularinsert(80);

        ll.print();

    }
    public void Circularinsert(int data) {
        ListNode nn = new ListNode(data);
        if (head == null) {
            head = nn;
            temp = nn;
        } else {
            temp.next = nn;
            temp = nn;
            temp.next = head;
        }
    }

    private void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            if (head == temp) {
                break;
            }
        }
//            Node temp = head;
//            do{
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }while (temp != head);

    }
}

class ListNode {
    int data;
    ListNode next;

    protected ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}


