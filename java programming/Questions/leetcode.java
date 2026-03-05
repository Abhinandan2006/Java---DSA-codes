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

import java.util.*;

class Solution {
    public int minimumTime(int n, int[][] edges) {
        int[][] d = edges;

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] e : d) graph[e[0]].add(new int[]{e[1], e[2], e[3]});

        int[] vis = new int[n];
        Arrays.fill(vis, Integer.MAX_VALUE);
        vis[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0}); 

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int time = curr[0];
            int node = curr[1];

            if (node == n - 1) {
                return time;
            }
            if (time > vis[node]){
                continue;
            }

            for (int[] edge : graph[node]) {
                int nei = edge[0], start = edge[1], end = edge[2];
                int waitTime = Math.max(time, start);

                if (waitTime <= end && waitTime + 1 < vis[nei]) {
                    vis[nei] = waitTime + 1;
                    pq.offer(new int[]{waitTime + 1, nei});
                }
            }
        }

        return -1;
    }
}
