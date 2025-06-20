package Queues;
import java.util.*;
// public class Deque1 {
//     public static void main(String[] args) {
//         Deque<Integer> dq = new LinkedList<>();
//         dq.addFirst(1);
//         dq.addFirst(2);
//         dq.addLast(3);
//         dq.addLast(4);
//         System.out.println(dq);
//         System.out.println("first ele = " + dq.getFirst());
//         System.out.println("last ele = " + dq.getLast());
//     }
// }

public class Deque1 {
    static class stack {
        Deque<Integer> dq = new LinkedList<>();
        public void push(int data){
            dq.addLast(data);
        }

        public int pop(){
            return dq.removeLast();
        }

        public int peek(){
            return dq.getLast();
        }
        
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
