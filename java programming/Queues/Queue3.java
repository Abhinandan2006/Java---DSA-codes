package Queues;
// queue using two stacks

// import java.util.*;
// public class Queue3 {
//     static class Queue {
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>(); // for temp storage;

//         public static boolean isEmpty() {
//             return s1.isEmpty();
//         }

//         // add
//         public static void add(int data) {
//             while ((!s1.isEmpty())) {
//                 s2.push(s1.pop());
//             }

//             s1.push(data);

//             while (!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
//         }

//         // remove
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("queue is empty");
//                 return -1;
//             }

//             return s1.pop();
//         }

//         // peek;
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("queue is empty");
//                 return -1;
//             }

//             return s1.peek();
//         }
//     }

//     @SuppressWarnings("static-access")
//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// stack using two queues
 
import java.util.*;
import java.util.LinkedList;
public class Queue3 {

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        //add
        public static void push(int data){
            if (!q1.isEmpty()) {
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        public static int pop(){
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }

            int top = -1;
            // case 1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    else{
                        q2.add(top);
                    }
                }
            }
            else{
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }

            int top = -1;
            // case 1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                        q2.add(top);
                }
            }
            else{
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}