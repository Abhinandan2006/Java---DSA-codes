package Array;


// public class subarrays {

//     public static void maxsubarraysum(int arr[]) {
//         int cursum = 0;
//         int maxsum = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 cursum = 0;
//                 for (int j2 = i; j2 <= j; j2++) {
//                     // subarray sum
//                     cursum += arr[j2];

//                 }
//                 //System.out.println(cursum);
//                 if (maxsum < cursum) {
//                     maxsum = cursum;
//                 }
//             }
//         }
//         System.out.println("max sum= " + maxsum);
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 5, 3, 1, 5, 3 };
//         maxsubarraysum(arr);
//     }
// } 

// public class subarrays {
//     public static void maxsubarraysum(int arr[]) {
//         int cursum = 0;
//         int maxsum = Integer.MIN_VALUE; // -ve infinity
//         int prefix[] = new int[arr.length];

//         // Initialize the prefix array
//         prefix[0] = arr[0];
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + arr[i];
//         }

//         // Calculate the maximum subarray sum
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 cursum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
//                 if (maxsum < cursum) {
//                     maxsum = cursum;
//                 }
//             }
//         }

//         System.out.println("max sum= " + maxsum);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         maxsubarraysum(arr);
//     }
// }

// public class subarrays {

//     public static void printSubStrings(String str){
//        int n = str.length();
//        for (int i = 0; i < n; i++) {
//         for (int j = i+1; j <= n; j++) {
//             System.out.println(str.substring(i, j));
//         }
//        }
//     }
//     public static void main(String[] args) {
//         String str = "abcdba";
//         printSubStrings(str);
//     }
// }

