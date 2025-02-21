public class L53 {
//kadane algorithms
    public int maxSubArray(int[] nums) {
        int subSum = nums[0];
        int finalSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            subSum = Math.max(nums[i], subSum + nums[i]);
            finalSum = Math.max(subSum, finalSum);
        }
        return finalSum;
    }
}
