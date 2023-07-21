package LinkedList.LabPrograms;


public class Count_nodes {
    public static void main(String[] args) {
        Linklist1 list = new Linklist1();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println(list.size());
        list.disply();

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


    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void disply() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

