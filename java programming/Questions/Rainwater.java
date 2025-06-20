package Questions;
public class Rainwater {
    public static int trappedRainWater(int height[]) {
        int n = height.length;
        // calculate left max and right max boundry of a baar-->array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[height.length];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // waterLevel = min(left max bound , right max bound)
            trappedWater += waterLevel - height[i];
        }
        // trapped water = waterLevel - height[i]
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainWater(height));
    }
}
