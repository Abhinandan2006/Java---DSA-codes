package Questions;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.*;

// public class leetcode {

//     public static int[] leetcode(int[] nums, int target) {
//         Map<Integer, Integer> complementMap = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             int currentNumber = nums[i];
//             int complement = target - currentNumber;
//             if (complementMap.containsKey(complement)) {
//                 return new int[] { complementMap.get(complement), i };
//             }
//             complementMap.put(currentNumber, i);
//         }

//         return new int[] { -1, -1 };
//     }

//     public static void main(String[] args) {
//         int[] nums = { 2, 7, 11, 15 };
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the target: ");
//         int target = sc.nextInt();

//         int[] result = leetcode(nums, target);

//         if (result[0] != -1) {
//             System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
//         } else {
//             System.out.println("No valid pair found.");
//         }
//     }
// }
// class leetcode {
// public boolean isPalindrome(int x) {
// if (x < 0) {
// return false;
// }

// long reversed = 0;
// long temp = x;

// while (temp != 0) {
// int digit = (int) (temp % 10);
// reversed = reversed * 10 + digit;
// temp /= 10;
// }

// return (reversed == x);
// }
// }