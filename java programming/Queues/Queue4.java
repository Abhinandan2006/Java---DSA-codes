package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

// FIrst non repeating letter in a stream of characters
// public class Queue4 {
//     public static void printNonRepeating(String str) {
//         int freq[] = new int[26];
//         Queue<Character> q = new LinkedList<>();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch - 'a']++;
//             while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
//                 q.remove();
//             }

//             if (q.isEmpty()) {
//                 System.out.print(-1 + " ");
//             }

//             else {
//                 System.out.print(q.peek() + " ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         String str = "aabccxb";
//         printNonRepeating(str);
//     }
// }

// public class Queue4 {
//     public static void queueReversal(Queue<Integer> q) {
//         Stack<Integer> s = new Stack<>();
//         while (!q.isEmpty()) {
//             s.push(q.remove());
//         }

//         while (!s.isEmpty()) {
//             q.add(s.pop());
//         }
//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);
//         q.add(50);

//         queueReversal(q);

//         while (!q.isEmpty()) {
//             System.out.println(q.remove() + " ");
//         }
//     }
// } 

@SuppressWarnings("unused")
public class Queue4 {
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> FirstHalf = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i < size / 2; i++) {
            FirstHalf.add(q.remove());
        }

        while (!FirstHalf.isEmpty()) {
            q.add(FirstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}