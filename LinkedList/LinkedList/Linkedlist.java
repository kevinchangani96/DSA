package LinkedList.LinkedList;

import javax.xml.crypto.Data;

public class Linkedlist {

    public static void main(String[] args) {
        Linklist1 list = new Linklist1();
        list.insert(10);
        list.insert(20);
        list.insert(30);
//        list.insert(20);
        list.disply();
        list.delete(10);
        list.disply();
    }

}
class Linklist1{
    Node head;
    Node tail;
    public void insert(int data) {
        Node nn=new Node(data);
        if (head==null){
            head=nn;
            tail=nn;
        }
        else {
            tail.next=nn;
            tail=nn;
        }

    }

    public void disply() {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +  "->");
            temp =temp.next;
        }
        System.out.println("END");
    }

    public void delete(int data) {
        if(head==null)return;
        if (head.data == data){
            head =  head.next;
            return;
        }
        Node temp = head;
        while (temp != null && temp.next != null){
            if(temp.next.data == data && temp.next == tail){
                temp.next =null;
                tail = temp;
                return;
            }else if(temp.next.data == data){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
}


class  Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}