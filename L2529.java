public class L2529 {
    public int maximumCount(int[] nums) {
        int positiveCount = 0;
        int negativeCount = 0;

        // Count positive numbers
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > 0) {
                positiveCount = nums.length - mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Count negative numbers
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < 0) {
                negativeCount = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return Math.max(positiveCount, negativeCount);
    }
}
