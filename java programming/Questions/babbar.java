package Questions;
// public class babbar {
//     public static void ReverseArray(int arr[]) {
//         int temp[] = new int[arr.length];
//         for (int i = 0; i < arr.length; i++) {
//             temp[i] = arr[arr.length - i - 1];
//         }
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = temp[i];
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4 };
//         ReverseArray(arr);

//     }
// }

// public class babbar {

//     public static int largest(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (largest<arr[i]) {
//                 largest = arr[i];
//             }
//         }
//         return largest;
//     }
//     public static int smallest(int arr[]){
//          int smallest = Integer.MAX_VALUE;
//          for (int i = 0; i < arr.length; i++) {
//             if (smallest > arr[i]) {
//                 smallest = arr[i];
//             }
//          }
//          return smallest;
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,4,3,1,4,9};
//         System.out.println(largest(arr));
//         System.out.println(smallest(arr));
//     }
// }

// public class babbar {

//     public static void FindSmallest(int arr[], int k) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j + 1] < arr[j]) {
//                     int temp = arr[j + 1];
//                     arr[j + 1] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         System.out.println(arr[k - 1]);
//     }

//     public static void main(String[] args) {
//         int arr[] = { 7, 10, 4, 3, 20, 15 };
//         int k = 3;
//         FindSmallest(arr, k);
//     }
// }

// public class babbar {

//     public static void rotate(int arr[]){
//         int temp[] = new int[arr.length];
//         for (int i = 0; i < arr.length; i++) {
//             temp[i] = arr[arr.length-i-1];
//         }
//         for (int i = 0; i < temp.length; i++) {
//             arr[i]=temp[i];
//         }
//         temp[0] = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             temp[i] = arr[arr.length-i];
//         }
//         for (int i = 0; i < temp.length; i++) {
//             arr[i] = temp[i];
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7};
//         rotate(arr);
//     }
// }

// public class babbar {

//     // Method to reverse a part of the array from index si to ei
//     public static void ReverseArray(int arr[], int si, int ei) {
//         while (si < ei) {
//             int temp = arr[si];
//             arr[si] = arr[ei];
//             arr[ei] = temp;
//             si++;
//             ei--;
//         }
//     }

//     // Method to rotate the array by k times to the left
//     public static void rotate(int arr[], int k) {
//         k = k % arr.length;
//         if (k < 0) {
//             k = k + arr.length;
//         }

//         ReverseArray(arr, 0, k - 1);         // Reverse the first k elements
//         ReverseArray(arr, k, arr.length - 1); // Reverse the remaining elements
//         ReverseArray(arr, 0, arr.length - 1); // Reverse the entire array
//     }

//     // Method to print the array
//     public static void printarray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7};
//         rotate(arr, 4);
//         printarray(arr);
//     }
// }

// public class babbar {

//     public static void MinimizeTheHeight(int arr[], int k) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] <= k) {
//                 arr[i] = arr[i] + k;
//             } else {
//                 arr[i] = arr[i] - k;
//             }
//         }
//     }

//     public static void Difference(int arr[]) {
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         int Difference;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             if (min > arr[i]) {
//                 min = arr[i];
//             }
//         }
//         Difference = max - min;
//         System.out.println(Difference);
//     }

//     public static void main(String[] args) {
//         int arr[] = {3, 9, 12, 16, 20 };
//         MinimizeTheHeight(arr, 3);
//         Difference(arr);
//     }
// }

// public class babbar {

//     public static int Jump(int arr[]) {
//         if (arr.length == 0 || arr[0] == 0) {
//             return -1; // Can't make any jumps if the first element is 0 or array is empty
//         }

//         int maxReach = arr[0]; // The maximum index we can reach
//         int steps = arr[0];    // Steps we can still take
//         int jumps = 1;         // Number of jumps made

//         for (int i = 1; i < arr.length; i++) {
//             if (i == arr.length - 1) {
//                 return jumps;
//             }

//             maxReach = Math.max(maxReach, i + arr[i]);
//             steps--;

//             if (steps == 0) {
//                 jumps++;
//                 if (i >= maxReach) {
//                     return -1; // Can't reach further
//                 }
//                 steps = maxReach - i;
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 4, 3, 2, 6, 7};
//         int result = Jump(arr);
//         System.out.println(result);
//     }
// }


