package Stack;
// import java.util.*;;
// public class Stack {
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// ques 1 -> push at bottom of stack

// import java.util.*;
// public class Stack1 {
//     public static void pushAtBottom(Stack<Integer> s, int data){
//         if (s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }

//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         pushAtBottom(s, 4);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// ques 2 -> reverse a string using a stack

// import java.sql.Struct;
// import java.util.*;
// public class Stack1 {
//     public static String reverseStack(String str){
//         Stack<Character> s = new Stack<>();
//         int idx = 0;
//         while(idx < str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }

//         StringBuilder result = new StringBuilder();
//         while (!s.isEmpty()) {
//             char curr = s.pop();
//             result.append(curr);
//         }
//         return result.toString(); 

//     }

//     public static void main(String[] args) {
//         String str = "Nandan";
//         String result = reverseStack(str);
//         System.out.println(result);
//     }
// }

// ques 3 -> reverse a stack problem
// import java.util.*;

// public class Stack1 {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if (s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }

//     public static void reverseStack(Stack<Integer> s) {
//         if (s.isEmpty()) {
//             return;
//         }
//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s, top);

//     }

//     public static void printStack(Stack<Integer> s){
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }

//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         reverseStack(s);
//         printStack(s);
//     }
// }

// ques 4 -> stock span problem

//import java.util.*;
// public class Stack1 {
//     public static void stockSpan(int stock[], int span[]) {
//         Stack<Integer> s = new Stack<>();
//         span[0] = 1;
//         s.push(0);

//         for (int i = 1; i < stock.length; i++) {
//             int currPrice = stock[i];
//             while (!s.isEmpty() && currPrice > stock[s.peek()]) {
//                 s.pop();
//             }
//             if (s.isEmpty()) {
//                 span[i] = i + 1;
//             } else {
//                 int prevHigh = s.peek();
//                 span[i] = i - prevHigh;
//             }
//             s.push(i);
//         }
//     }

//     public static void main(String[] args) {
//         int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
//         int span[] = new int[stock.length];
//         stockSpan(stock, span);

//         for (int i = 0; i < span.length; i++) {
//             System.out.print(span[i] + " ");
//         }
//     }
// }

// imp ques 5 -> next greater element 
// import java.util.*;
// public class Stack1 {

//     public static void main(String[] args) {
//         int arr[] = {6,8,0,1,3};
//         Stack<Integer> s = new Stack<>();
    
//         int nextGreater[] = new int[arr.length];
//         for (int i = arr.length-1; i >= 0; i--) { // for greater in right 
//             // while
//             while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
//                 s.pop();
//             }
//             if (s.isEmpty()) { 
//                 nextGreater[i] = -1;
//             }
//             else{
//                 nextGreater[i] = arr[s.peek()];
//             }
//             s.push(i);
//         }

//         for (int i = 0; i < nextGreater.length; i++) {
//             System.out.print(nextGreater[i]+" ");
//         }
//         System.out.println();
//     }
// }

// ques 6 ->valid parentheses
// import java.util.*;
// public class Stack1 {
//     public static boolean isValid(String str){
//         Stack<Character> s = new Stack<>();
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             // opening
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 s.push(ch);
//             }
//             else{
//                 if (s.isEmpty()) {
//                     return false;
//                 }
//                 if( (s.peek() == '(' && ch == ')') 
//                 || (s.peek() == '{' && ch =='}') 
//                 || (s.peek() == '[' && ch ==']')) {
//                     s.pop();
//                 }
//                 else{
//                     return false;
//                 }
//             }
//         }
//         if (s.isEmpty()) {
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         String str = "({}[])";
//         System.out.println(isValid(str));
//     }
// }

// ques 7 -> duplicate parentheses
// import java.util.*;
// public class Stack1 {
//     public static boolean isDuplicate(String str){
//         Stack<Character> s = new Stack<>();
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             //closing
//             if (ch == ')') {
//                 int count = 0;
//                 while (s.peek() != '(') {
//                     s.pop();
//                     count++;
//                 }
//                 if (count < 1) {
//                     return true;
//                 }
//                 else{
//                     s.pop();
//                 }
//             }
//             // opening
//             else{
//                 s.push(ch);
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         String str1 = "((a+b))";
//         String str2 = "(a - b)";
//         System.out.println(isDuplicate(str1));
//         System.out.println(isDuplicate(str2));
//     }
// }

//imp ques - Maximum area in a histogram
import java.util.*;
public class Stack1 {
    public static int maxArea(int height[]){
        int maxArea = 0;
        int nsr[] = new int[height.length];
        int nsl[] = new int[height.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = height.length-1; i >=0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = height.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //current area: width = j-i-1 nsr[i] - nsl[i] - 1;

        for (int i = 0; i < height.length; i++) {
            int length = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = length * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};
        System.out.println(maxArea(height));
    }
}