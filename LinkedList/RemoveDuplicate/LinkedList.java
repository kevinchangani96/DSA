package LinkedList.RemoveDuplicate;

import java.util.ArrayList;

public class LinkedList {
    ListNode head;
    ListNode tail;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(20);
        ll.insert(50);
        ll.print();
        ll.remove();
        ll.print();

    }

    private void remove() {

        ArrayList<Integer> list = new ArrayList<>();

        ListNode pre = head;
        ListNode curr = head;
        while (curr != null && curr.next!=null) {
            list.add(curr.data);
            pre=curr;
            curr = curr.next;
            if (list.contains(curr.data)) {
                pre.next = curr.next;
                curr.next.prev=pre;
            }
        }
    }

    private void print() {
        ListNode temp = head;

        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();

        temp=tail;

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    private void insert(int data) {
        ListNode nn = new ListNode(data);

        if (head==null){
            head=tail=nn;
        }else {
            nn.prev= tail;
            tail.next=nn;
            tail=nn;
        }
    }
}
class ListNode{
    int data;
    ListNode prev,next;

    ListNode(int data){
        this.data=data;
    }
}

