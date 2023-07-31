package LinkedList.DoublyLinkList;

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
//        linkedList.reverseprint();
//        linkedList.update(50);
        linkedList.pairsum(40);

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
        System.out.println();
        temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
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
        if (Head.data == value && Head == tail) {
            Head = null;
            tail = null;
        } else if (Head.data == value) {
            Head.next.prev = null;
            Head = Head.next;

        } else {
            Node pre = Head;
            Node Cur = Head.next;
            while (Cur.data != value) {
                pre = Cur;
                Cur = Cur.next;
            }
            if (Cur.next == null) {
                pre.next = null;
                tail = Cur.prev;
            } else {
                Cur.next.prev = Cur.prev;
                pre.next = Cur.next;
            }
        }
    }

    public void update(int value) {
        Node temp = Head;

    }

    public void pairsum(int sum) {
        Node headT = Head;
        Node tailT = tail;

        while(headT!=tailT){
            int total = headT.data + tailT.data;
            if(total == sum){
                System.out.println("Pairs: (" + headT.data + "," + tailT.data + ")");
                return;
            }else if(total < sum){
                headT = headT.next;
            }else{
                tailT = tailT.prev;
            }
            System.out.println("Pair not found");
            return;
        }

    }

    class Node {
        int data;
        Node next, prev;

        public Node(int data) {
            this.data = data;
        }
    }
}
