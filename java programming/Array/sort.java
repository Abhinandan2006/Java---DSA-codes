package Array;

// BUBBLE SORT
// public class sort {
//     public static void main(String[] args) {
// time complexity = 0{n^2}
//         int a[] = { 3, 6, 2, 1, 7, 4 };
//         for (int i = 0; i < a.length - 1; i++) {
//             for (int j = 0; j < a.length - i - 1; j++) {
//                 if (a[j + 1] < a[j]) {
//                     int temp = a[j];
//                     a[j] = a[j + 1];
//                     a[j + 1] = temp;
//                 }
//             }

//         }
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i]+" ");
//         }    
//     }
// }

//SELECTION SORT
// import java.util.*;

// public class sort {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a[] = new int[10];
//         for (int i = 0; i < 10; i++) {
//             a[i] = sc.nextInt();
//         }
//         for (int i = 0; i <= a.length - 1; i++) {
//             int min = i;
//             for (int j = i + 1; j < a.length; j++) {
//                 if (a[j] < a[min]) {
//                     min = j;
//                 }
//             }
//             int temp = a[min];
//             a[min] = a[i];
//             a[i] = temp;

//         }
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i]+" ");
//         }
//     }
// }

//insertion sort
// import java.util.*;

// public class sort {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a[] = new int[10];
//         for (int i = 0; i < 10; i++) {
//             a[i] = sc.nextInt();
//         }
//         for (int i = 0; i < a.length; i++) {
//             int k = a[i];
//             int j = i-1;
//             while (j>=0 && a[j] > k) {
//                 a[j+1] = a[j];
//                 j=j-1;
//             }
//             a[j+1]=k;
//         }
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i]+" ");
//         }
//     }

// import java.util.*;

// public class sorting {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         sort(arr);
//     }

//     public static void sort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {  
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         System.out.println("Sorted array in descending order:");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// import java.util.*;

// public class sort {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[5];
//         for (int i = 0; i < 5; i++) {
//             arr[i] = sc.nextInt();
//         }
//         selectionsort(arr);
//     }

//     public static void selectionsort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             int min = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[min]) {
//                     min = j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i] = arr[min];
//             arr[min] = temp;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// import java.util.*;

// public class sort {

//     public static void main(String[] args) {
//         @SuppressWarnings("resource")
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[5];
//         for (int i = 0; i < 5; i++) {
//             arr[i] = sc.nextInt();
//         }
//         insertionsort(arr);
//     }
//     public static void insertionsort(int arr[]){
//         for (int i = 0; i < arr.length; i++) {
//             int k = arr[i];
//             int j = i-1;
//             while (j>=0 && k<arr[j]) {
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = k;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]+" " );
//         }
//     }
// } 

// counting sort

public class sort {
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void counting(int arr[]) {
        int largest = Integer.MIN_VALUE; //Integer.MIN_VALUE means we want to stode -♾️ in largest
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
        }

        //sortng
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,1,4,1,5,6,1,6,7};
        counting(arr);
        printarr(arr);
    }
}