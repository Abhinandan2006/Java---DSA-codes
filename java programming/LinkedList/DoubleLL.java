package LinkedList;
public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int removeFirst(){
        if (head == null) {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    //print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addfirst(1);
        dll.addfirst(2);
        dll.addfirst(3);
        dll.print();
        dll.reverse();
        dll.print();
    }

}
