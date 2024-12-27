public class L724 {
    public int pivotIndex(int[] nums) {
        int [] sum = new int [nums.length + 1];
        sum[0] = 0;
        for (int i = 0; i < nums.length; i++)
            sum[i + 1] = sum[i] + nums[i];
            for (int i = 0; i < sum.length - 1; i++){
                if (sum[i] == sum[nums.length] - sum[i + 1]) return i;

            }
            return -1;
        
    }
}
