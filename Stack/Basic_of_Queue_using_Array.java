package Stack;

public class Basic_of_Queue_using_Array {
    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        print();
        System.out.println("Size : " + size());
        dequeue();
        System.out.println("Peek :" +peek());
    }

    private static int peek() {
        if (isEmpty()){
            return -1;
        }
        return queue[front];
    }

    private static int size() {
        if (rear==-1){
            return -1;
        }
        rear++;
        return rear-front;
    }

    private static void print() {
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    private static void dequeue() {
        if (isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        front++;
    }

    private static boolean isEmpty(){
        if (rear == -1 || rear==front){
            return true;
        }
        return false;
    }
    private static void enqueue(int value) {
        if (rear== queue.length-1){
            System.out.println("Queue is Full");
            return;
        }
        if (rear==-1){
            front++;
        }
        rear++;
        queue[rear]=value;
    }
}
