import java.util.Arrays;

public class L2873 {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxValue = 0;

        for (int j = 1; j < n - 1; j++) {
            int maxLeft = Integer.MIN_VALUE;
            int maxRight = Integer.MIN_VALUE;

            // Find the maximum value of nums[i] - nums[j] for i < j
            for (int i = 0; i < j; i++) {
                maxLeft = Math.max(maxLeft, nums[i] - nums[j]);
            }

            // Find the maximum value of nums[k] for k > j
            for (int k = j + 1; k < n; k++) {
                maxRight = Math.max(maxRight, nums[k]);
            }

            // Compute the maximum value for the current j
            maxValue = Math.max(maxValue, (long) maxLeft * maxRight);
        }

        return maxValue;
    }

}
