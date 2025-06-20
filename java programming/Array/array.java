package Array;
// import java.util.Scanner;
// public class array {
// public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int n=sc.nextInt();
//    int[]arr=new int[n];
//    for (int i = 0; i < n; i++) {
//       arr[i]=sc.nextInt();
//    }
//    for (int i = 0; i < n; i++) {
//       System.out.print (arr[i]+" ");
//    }
// }

// import java.util.Scanner;

// public class array {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int[][] arr = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }

//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(arr[i][j] + "  ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;

// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number n: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.print("enter the elements in array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("enter the element to search: ");// transversing means reaching each element of array on by one
//         int k=sc.nextInt();
//         for (int i = 0; i < arr.length; i++) {
//             if (k==arr[i]) {
//                 System.out.println(i);
//             }
//         }
//          for (int i = 0; i < n; i++) {
//              System.out.print(arr[i] + " ");
//          }

//     }
// }

// import java.util.Scanner;

// public class array {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter rows and columns: ");
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int[][] arr = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }

//         }
//         System.out.println("enter the elements to search: ");
//         int x = sc.nextInt();
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (arr[i][j] == x) {
//                     System.out.println("element found on:(" + i + "," + j + ")");
//                 }
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(arr[i][j] + "  ");
//             }
//             System.out.println();
//         }
//     }
// }

//  public class array {

//     public static int findlargesrt(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (largest < arr[i]) {
//                 largest = arr[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,4,5,3,8,5};
//         System.out.print(findlargesrt(arr));
//     }
//  }

// import java.util.*;

// public class array {

//     public static void main(String[] args) {
//         Integer arr[] = {6,1,3,7,2,8};
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//         // Sorting in descending order using custom comparator
//         Arrays.sort(arr, Collections.reverseOrder());

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

import java.util.Arrays;

public class array {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int temp[] = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length) {
            temp[k++] = nums1[i++];
        }
        while (j < nums1.length) {
            temp[k++] = nums2[j++];
        }
        Arrays.sort(temp);

        int mid = temp.length/2;
        if (temp.length%2 == 0) {
            return(temp[mid]+temp[mid-1])/2.0;

        }
        else{
            return temp[mid];
        }
    }

    public static void main(String[] args) {
        int nums1[] = { 1,3};
        int nums2[] = { 2, 4 };
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }
}