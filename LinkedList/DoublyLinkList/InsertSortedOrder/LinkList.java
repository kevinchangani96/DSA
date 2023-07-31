package LinkedList.DoublyLinkList.InsertSortedOrder;

public class LinkList {
    ListNode head;
    ListNode tail;

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.insert(10);
        ll.insert(50);
        ll.insert(30);
        ll.insert(40);
        ll.insert(80);
        ll.insert(20);
        ll.print();
    }

    private void print() {
        ListNode temp = head;
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
        System.out.println();
    }

    private void insert(int value) {
        ListNode nn = new ListNode(value);
        if (head == null) {
            head = tail = nn;
            return;
        }

        if (head.data > value) {
            nn.next = head;
            head.prev = nn;
            head = nn;
            return;
        }

        ListNode curr = head;

        while (curr.next != null && curr.next.data < value) {
            curr = curr.next;
        }

        if (curr.next != null) {
            nn.next = curr.next;
            curr.next.prev = nn;
        } else {
            tail = nn;
        }

        nn.prev = curr;
        curr.next = nn;
    }

}

class ListNode {
    int data;
    ListNode prev, next;

    ListNode(int data) {
        this.data = data;
    }
}

