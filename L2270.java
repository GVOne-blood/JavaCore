import java.util.Arrays;

public class L2270 {
    public int waysToSplitArray(int[] nums) {
        int count = 0;
        int n = nums.length;
        long  [] sum = new long[n];
       // int arraySum = Arrays.stream(nums).sum();
        sum[0] = nums[0];
        for (int i = 1; i < n; i++){
            sum[i] = sum[i - 1] + nums[i];
           // sum[n - i - 1] = sum[n - i] - nums[n - i - 1];
        }
        for (int i = 0; i < n - 1; i++){
            if (sum[n - 1] - sum[i] < sum[i]) count++;
        }
        return count;
    }
}
