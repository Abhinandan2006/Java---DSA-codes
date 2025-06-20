package Questions;
// import java.util.*;
// public class practice {
// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     int a= sc.nextInt();
//     int b= sc.nextInt();
//     int c= sc.nextInt();
//     int avg=(a+b+c)/3;
//     System.out.println(avg);
// }

// }

// import java.util.*;
// public class practice {

//     public static int SumOdd(int n){
//         int s=0;
//         for (int i = 1; i <= n; i++) {
//             if (i%2!=0) {
//                 s=s+i;
//             }
//         }
//         return s;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter the number n: ");
//         int n= sc.nextInt();
//         int sum = SumOdd(n);
//         System.out.print("the sum is: "+sum);
//     }
// }

// import java.util.*;
// public class practice {

//     public static int greater(int a,int b){
//         if (a>b) {
//             System.err.print("a is greatest");
//         }
//         else{
//             System.out.print("b is greatest");
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter the value of a: ");
//         int a=sc.nextInt();
//         System.out.print("enter the value of b: ");
//         int b= sc.nextInt();
//         int gt=greater(a, b);
//         System.out.print(gt);
//     }
// }

// import java.util.*;
// public class practice {

//     public static float cir(int r){
//       float c= (float) (2*3.14*r);
//        return  c ;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter the radius of circle: ");
//         int r= sc.nextInt();
//         float c=cir(r);
//         System.out.print(c);
//     }
// }

// import java.util.*;

// public class practice {

//     public static void main(String[] args) {
//         int a = 0;
//         int b = 1;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n = sc.nextInt();
//         System.out.print(a + " ");
//         System.out.print(b + " ");
//         for (int i = 1; i <= n; i++) {
//             int c = a + b;
//             a = b;
//             b = c;

//             System.out.print(c + " ");
//         }

//     }
// }

// import java.util.*;

// public class practice {

//     public static void main(String[] args) {
//         int s = 0, b;
//         @SuppressWarnings("resource")
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number: ");
//         int n = sc.nextInt();
//         int a=n;
//         while (n != 0) {
//             b = n % 10;
//             s = s * 10 + b;
//             n = n / 10;
//         }
//         if (s == a) {
//             System.out.print("its a palindrome");
//         } else {
//             System.out.print("not a palindrome");
//         }

//     }
// }

// public class practice {

//     public static int voting(int[] nums) {
//         int candidate = -1;
//         int count = 0;
//         for (int num : nums) { //enhanced for loop
//             if (count == 0) {
//                 candidate = num;
//                 count = 1;
//             } else if (num == candidate) {
//                 count++;
//             } else {
//                 count--;
//             }
//         }
//         count = 0;
//         for (int num : nums) {
//             if (num == candidate) {
//                 count++;
//             }
//         }

//         if (count > nums.length / 2) {
//             return candidate;
//         } else {
//             return -1; 
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums = {2, 2, 1, 1, 1, 2, 2};
//         int result = voting(nums);
//         if (result != -1) {
//             System.out.println("The majority element is: " + result);
//         } else {
//             System.out.println("There is no majority element.");
//         }
//     }
// }

// public class practice {
//     public static int binary(int arr[], int n) {
//         int l = 0, h = arr.length - 1;
//         while (l <= h) {
//             int mid = l + (h - l) / 2;
//             if (arr[mid] == n) {
//                 System.out.println("The position of element is " + mid);
//                 return mid; 
//             }
//             if (arr[mid] > n) {
//                 h = mid - 1; 
//             } else {
//                 l = mid + 1;
//             }
//         }
//         System.out.println("Element not present");
//         return -1; 
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
//         int x = binary(arr, 5);
//         System.out.println(x);
//     }
// }

// public class practice {

//     // Recursive function to find the length of a string
//     public static int lengthofstring(String x, int idx) {
//         // Base case: if we reach the end of the string
//         if (idx == x.length()) {
//             return 0;
//         }
//         // Recursive case: move to the next character and add 1 for each call
//         return 1 + lengthofstring(x, idx + 1);
//     }

//     public static void main(String[] args) {
//         String x = "NANDAN";
//         int length = lengthofstring(x, 0); // Start from index 0
//         System.out.println("The length of the string is: " + length);
//     }
//

// public class practice {

//     // Helper function to count substrings starting from index 'start'
//     public static int countSubstringsFrom(String s, int start, int end) {
//         // Base case: if end exceeds the string length, return 0
//         if (end == s.length()) {
//             return 0;
//         }

//         // Check if the current substring starts and ends with the same character
//         int count = (s.charAt(start) == s.charAt(end)) ? 1 : 0;

//         // Recursive call to check the next substring
//         return count + countSubstringsFrom(s, start, end + 1);
//     }

//     // Main function to count all substrings in the string
//     public static int countAllSubstrings(String s, int start) {
//         // Base case: if start exceeds the string length, return 0
//         if (start == s.length()) {
//             return 0;
//         }

//         // Count substrings starting from the current character
//         int count = countSubstringsFrom(s, start, start);

//         // Recursive call to move to the next starting character
//         return count + countAllSubstrings(s, start + 1);
//     }

//     public static void main(String[] args) {
//         String s = "ababa";
//         int result = countAllSubstrings(s, 0);
//         System.out.println("The count of all contiguous substrings starting and ending with the same character is: " + result);
//     }
// }

// import java.util.*;
// public class practice {

//     public static void Arraysum(int arr[]){
//         int s=0;
//         for (int i = 0; i < arr.length; i++) {
//             s = s+arr[i];
//         }
//         System.out.println(s);
//     }
//     public static void main(String[] args) {
//         int arr[]={2,3,5,4,2};
//         Arraysum(arr);
//     }
// }

// public class practice {

//     public static int palindrome(int num) {
//         int r = 0;
//         while (num != 0) {
//             int d = num % 10;
//             r = r * 10 + d;
//             num = num / 10;
//         }
//         return r;
//     }

//     public static boolean ispalindrome(int num) {
//         return num == palindrome(num);
//     }

//     public static int convertpalindrome(int num) {
//         while (!ispalindrome(num)) {
//             num = num + palindrome(num);
//         }
//         return num;
//     }

//     public static void main(String[] args) {
//         int num = 7654;
//         System.out.println(convertpalindrome(num));
//     }
// }

// import java.util.*;
// import java.util.HashSet;
// public class practice {

//     public static void main(String[] args) {
//         HashSet<Integer> list = new HashSet<>();
//         int arr[] = {1,2,3,4,1};
//         for (int i = 0; i < arr.length; i++) {
//             list.add(arr[i]); 
//         }
//         System.out.println(list);

//         int i = 0;
//         for(Integer num : list){ // for index we use i but in this loop num traversing on elements of list
//             arr[i++] = num;
//         }
//         for (int j = 0; j < list.size(); j++) {
//             System.out.print(arr[j]+" ");
//         }
//     }
// } 

// public class practice {

//     public static void main(String[] args) {
//         int arr[] = {3,4,2,1,6,4};
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 System.out.print(arr[i] +", " + arr[j] );
//             }
//         }
//     }
// }

// public class practice {
//     public static int removeElement(int[] nums, int val) {
//         int lp = 0; 
//         int rp = nums.length - 1;
//         while(lp<=rp){
//            if (nums[lp] != val) {
//             lp++;
//            }
//            else if(nums[rp] == val){
//             rp--;
//            }
//            else{
//             int temp = nums[lp];
//             nums[lp] = nums[rp];
//             nums[rp] = temp;
//            }
//         }
//         return lp;
//     }
//     public static void main(String[] args) {
//         int nums[] = {0,2,3,4,5,3,1,0};
//        int newLength = removeElement(nums, 2);
//        for (int i = 0; i < newLength; i++) {
//         System.out.print(nums[i]+" ");
//        }
//     }   
// }

// public class practice {

//  public static void main(String[] args) {
//     String str = "NANDAN";
//     for (int i = 0; i < str.length(); i++) {
//        for (int j = i+1; j <= str.length(); j++) {
//             System.out.println(str.substring(i,j));
//        }
//     }
//  }
// }

// remove duplicates from array
// public class practice {
//    public static int removeDuplicates(int arr[]) {
//        if (arr.length == 0) return 0;
//        int i = 0;
//        for (int num : arr) {
//            if (i == 0 || num != arr[i - 1]) {
//                arr[i++] = num;
//            }
//        }
//        return i;
//    }

//    public static void main(String[] args) {
//        int arr[] = {1, 1, 1, 2, 2, 3, 3};
//        int result = removeDuplicates(arr);
//        System.out.println(result); // Output the number of unique elements

//        for (int i = 0; i < result; i++) {
//            System.out.println(arr[i]); // Output the unique elements
//        }
//    }
// }

// public class practice {

//    public static void main(String[] args) {
//       int arr[] = { 3, 2, 4, 2, 5, 2, 3 };
//       for (int i = 0; i < arr.length; i++) {
//          if (arr[i] % 2 == 0) {
//             arr[i] = 0;
//          } else {
//             arr[i] = 1;
//          }
//       }
//       for (int i = 0; i < arr.length; i++) {
//          System.out.print(arr[i] + " ");
//       }
//    }
//}

// class Solution {
//    public static void rotate(int[] nums, int k) {
//        int n = nums.length;
//        k = k % n; // If k > length of nums

//        reverse(nums, 0 , n - 1);
//        reverse(nums, 0 , k - 1);
//        reverse(nums, k, n - 1);
//    }

//    public static void reverse(int nums[], int lp, int rp){
//        while(lp <= rp){
//            int temp = nums[lp];
//            nums[lp] = nums[rp];
//            nums[rp] = temp;
//            lp++;
//            rp--;
//        }
//    }
//     public static void main(String[] args) {
//       int nums[] = {1,2,3,4,5,6,7};
//       rotate(nums, 3);
//       for (int i = 0; i < nums.length; i++) {
//          System.out.print(nums[i]+" ");
//       }
//     }
// }

