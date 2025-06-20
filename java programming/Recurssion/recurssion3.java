package Recurssion;
public class recurssion3 {
    public static void printperm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            // "abc"--> "ab"
            String newstr = str.substring(0, i) + str.substring(i + 1);
            printperm(newstr, permutation + currchar);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        printperm(str, "");
    }
}

// public class recurssion3 {
// public static int countpaths(int i, int j, int n, int m) {
// if (i == n || j == m) {
// return 0;
// }
// if (i == n - 1 && j == m - 1) {
// return 1;
// }
// int downpaths = countpaths(i + 1, j, n, m);
// int rightpaths = countpaths(i, j + 1, n, m);

// return downpaths + rightpaths;
// }

// public static void main(String[] args) {
// int n = 3, m = 3 ;
// int totalpaths = countpaths(0, 0, n, m);
// System.out.println(totalpaths);
// }
// }

// public class recurssion3 {

// public static int placetiles(int n, int m){
// if (n==m) {
// return 2;
// }
// if (n<m) {
// return 1;
// }
// int vertplacement = placetiles(n-m, m);
// int horzplacement = placetiles(n-1, m);

// return vertplacement + horzplacement;
// }
// public static void main(String[] args) {
// int n=4, m=2;
// System.out.println(placetiles(n, m));

// }
// }

// public class recurssion3 {

// public static int callguest(int n) {
// if (n <= 1) {
// return 1;
// }
// int single = callguest(n - 1);

// int pair = (n - 1) * callguest(n - 2);

// return single + pair;
// }

// public static void main(String[] args) {
// int n = 4;
// System.out.println(callguest(n));
// }
// }

// import java.util.*;

// public class recurssion3 {

// public static void printsubset(ArrayList<Integer> subset) {
// for (int i = 0; i < subset.size(); i++) {
// System.out.print(subset.get(i) + " ");
// }
// System.out.println();
// }

// public static void findsubset(int n, ArrayList<Integer> subset) {
// if (n == 0) {
// printsubset(subset);
// return;
// }
// subset.add(n);
// findsubset(n - 1, subset);

// subset.remove(subset.size() - 1);
// findsubset(n - 1, subset);
// }

// public static void main(String[] args) {
// int n = 3;
// ArrayList<Integer> Subset = new ArrayList<>();
// findsubset(n, Subset);
// }
// }

// public class recurssion3 {

// public static void occurance(int arr[], int idx, int key) {
// if (idx == arr.length) {
// return;
// }
// if (arr[idx] == key) {
// System.out.print(idx+" ");
// }
// occurance(arr, idx + 1, key);

// }

// public static void main(String[] args) {
// int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
// int key = 2;
// occurance(arr, 0, key);
// }
// }

// public class recurssion3 {

// public static String
// digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
// public static void printdigit(int number){
// if (number==0) {
// return;
// }
// int lastdigit = number%10;
// printdigit(number/10);
// System.out.print(digits[lastdigit]+" ");
// }
// public static void main(String[] args) {
// printdigit(1234);
// }
// }