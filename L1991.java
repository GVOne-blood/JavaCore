public class L1991 {
    public int findMiddleIndex(int[] nums) {
        int [] sum = new int [nums.length + 1];
        // sum[0] = 0; sum [nums.length] = 0;
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) sum[i] = sum[i - 1] + nums[i];
        // int sumL = 0, int sumR = 0;
     //   if (sum[nums.length - 2] == 0) return nums.length - 2;
        if (sum[nums.length - 1] - sum[0] == 0) return 0;
        for (int i = 1; i < nums.length; i++){
            if (sum[nums.length - 1] - sum[i] == sum[i - 1]) return i;
        }
        return -1;
    }
}
