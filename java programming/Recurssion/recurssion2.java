package Recurssion;
// public class recurssion2 {
//     public static void hanoi(int n, String src, String helper,String dest){
//         if (n==1) {
//             System.out.println("transfer disk "+ n+ " from " + src + " to "+dest);
//             return;
//         }
//         hanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk "+ n+ " from " + src + " to "+dest);
//         hanoi(n-1, helper, src, dest);
//     }
//     public static void main(String[] args) {
//         int n=3;
//         hanoi(n, "S", "H", "D");
//     }
// }

// public class recurssion2 {

//     public static void rev(String str, int idx){
//         if (idx==0) {
//             System.out.print(str.charAt(idx));
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         rev(str, idx-1);
//     }
//     public static void main(String[] args) {
//         String str="abcd";
//         rev(str, str.length()-1);
//     }
// }

// public class recurssion2 {

//     public static int first=-1;
//     public static int last=-1;
//     public static void occ(String str, int idx,char element){
//         if (idx==str.length()) {
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char curr=str.charAt(idx);
//         if (curr==element) {
//             if (first==-1) { 
//                 first=idx;
//             }
//             else{
//                 last=idx;
//             }
//         }
//         occ(str, idx+1, element);
//     }
// public static void main(String[] args) {
//     String str= "aababchaah";
//     occ(str, 0, 'a');
// }
// }

// import java.util.Scanner;

// public class recurssion2 {

//     public static boolean issorted(int arr[], int idx){
//         if (idx == arr.length-1) {
//             return true;
//         }
//         if (arr[idx]<arr[idx+1]) {
//             // array is sorted till now
//            return issorted(arr, idx+1);
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[]= new int[5];
//         System.out.print("enter the elements in array");
//         for (int i = 0; i < arr.length; i++) {
//              arr[i]=sc.nextInt();
//         }
//         System.out.print(issorted(arr, 0));
//     }
// }

// public class recurssion2 {

//     public static void moveallx(String str, int idx, int count, String newString) {
//         if (idx == str.length()) {
//             for (int i = 0; i < count; i++) {
//                 newString += 'x';
//             }
//             System.out.print(newString);
//             return;
//         }
//         char curr = str.charAt(idx);
//         if (curr == 'x') {
//             count++;
//             moveallx(str, idx+1, count, newString);
//         }
//         else{
//             newString += curr; // newstring = newstring + curr
//             moveallx(str, idx+1, count, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "axbcxxd";
//         String newString="";
//         moveallx(str, 0, 0, newString);
//     }
// }

// public class recurssion2 {

//     public static boolean[] map = new boolean[26];
//     public static void duplicate( String str, int idx, String newString){
//         if (idx== str.length()) {
//             System.out.println(newString);
//             return;
//         }
//         char curr = str.charAt(idx);
//         if (map[curr-'a']== true) {
//             duplicate(str, idx+1, newString); 
//         } 
//         else{
//             newString += curr;
//             map[curr-'a']= true;
//             duplicate(str, idx+1, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abbccda";
//         String newString = "";
//         duplicate(str, 0, newString);
//     }
// }

// public class recurssion2 {

//     public static void subsequence(String str, int idx , String newString){
//         if (idx == str.length()) {
//             System.out.println(newString);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         // to be
//         subsequence(str, idx+1, newString+currchar);

//         // or not to be
//         subsequence(str, idx+1, newString);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         subsequence(str, 0, "");
//     }
// }
// import java.util.HashSet;
// public class recurssion2 {

//     public static void subsequence(String str, int idx , String newString, HashSet<String> set){
//         if (idx == str.length()) {
//             if (set.contains(newString)) {
//                 return;
//             } else{
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }
//         char currchar = str.charAt(idx);
//         // to be
//         subsequence(str, idx+1, newString+currchar, set);

//         // or not to be
//         subsequence(str, idx+1, newString, set);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         HashSet<String> set = new HashSet<>();
//         subsequence(str, 0, "", set);
//     }
// }

public class recurssion2 {

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(idx);
        String mapping = keypad[currchar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "123";
        printComb(str, 0, "");
    }
}