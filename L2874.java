public class L2874 {
    public long maximumTripletValue(int[] nums) {

        int[] preMax = new int[nums.length];
        preMax[0] = nums[0];
        for (int i = 1; i < nums.length; i++) preMax[i] = Math.max(preMax[i - 1], nums[i]);

        int[] suffixMax = new int[nums.length];
        suffixMax[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) suffixMax[i] = Math.max(suffixMax[i + 1], nums[i]);

        long maxValue = 0;
        for (int i = 1; i < nums.length - 1; i++)
            maxValue = Math.max(maxValue, (long) (preMax[i - 1] - nums[i]) * suffixMax[i + 1]);
        return maxValue;
    }
}
