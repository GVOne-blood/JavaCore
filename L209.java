public class L209 {
    public int minSubArrayLen(int target, int[] nums) {
       int sum = 0; int l = 0;
       int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
            while (sum >= target) {
                min = Math.min(min, i - l + 1);
                l++;
                sum -= nums[l];
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}
