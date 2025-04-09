public class L674 {
    public int findLengthOfLCIS(int[] nums) {
        int res = 1;
        int maxLen = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                res = 0;
            }
            res += 1;
            maxLen = Math.max(maxLen, res);
        }
        return maxLen;
    }
}
