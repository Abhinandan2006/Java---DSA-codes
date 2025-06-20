package DynamicProgramming;

public class knapsack {

        // Recursion (Plain)
        static int knapsackRecursion(int[] wt, int[] val, int W, int n) {
            if (n == 0 || W == 0) return 0;
    
            if (wt[n - 1] <= W) {
                // Choose maximum of including or excluding the item
                return Math.max(
                    val[n - 1] + knapsackRecursion(wt, val, W - wt[n - 1], n - 1),
                    knapsackRecursion(wt, val, W, n - 1)
                );
            } else {
                return knapsackRecursion(wt, val, W, n - 1);
            }
        }
    
        // Memoization (Top-Down DP)
        static int knapsackMemoization(int[] wt, int[] val, int W, int n, int[][] dp) {
            if (n == 0 || W == 0) return 0;
    
            if (dp[n][W] != -1) return dp[n][W];
    
            if (wt[n - 1] <= W) {
                dp[n][W] = Math.max(
                    val[n - 1] + knapsackMemoization(wt, val, W - wt[n - 1], n - 1, dp),
                    knapsackMemoization(wt, val, W, n - 1, dp)
                );
            } else {
                dp[n][W] = knapsackMemoization(wt, val, W, n - 1, dp);
            }
    
            return dp[n][W];
        }
    
        // Tabulation (Bottom-Up DP)
        static int knapsackTabulation(int[] wt, int[] val, int W, int n) {
            int[][] dp = new int[n + 1][W + 1];
    
            // Build dp table bottom-up
            for (int i = 0; i <= n; i++) {
                for (int w = 0; w <= W; w++) {
                    if (i == 0 || w == 0)
                        dp[i][w] = 0;
                    else if (wt[i - 1] <= w)
                        dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                    else
                        dp[i][w] = dp[i - 1][w];
                }
            }
            return dp[n][W];
        }
    
        public static void main(String[] args) {
            int[] wt = {2,5,1,3,4};
            int[] val = {15,14,10,45,30};
            int W = 7;
            int n = wt.length;
    
            System.out.println("Recursion result: " + knapsackRecursion(wt, val, W, n));
    
            int[][] dp = new int[n + 1][W + 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= W; j++) {
                    dp[i][j] = -1;
                }
            }
            System.out.println("Memoization result: " + knapsackMemoization(wt, val, W, n, dp));
    
            System.out.println("Tabulation result: " + knapsackTabulation(wt, val, W, n));
        }
    }
