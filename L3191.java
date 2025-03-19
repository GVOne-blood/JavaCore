import java.util.Arrays;

public class L3191 {
    public int minOperations(int[] nums) {
        int res = 0;
        int i = 0;
        while (i < nums.length - 2){
            if (nums[i] == 0) {
                nums[i] = 1 - nums[i];
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];
                res++;

            }
            i++;
        }
        if (Arrays.stream(nums).min().getAsInt() == 0) return -1;
    return res;

    }
}
