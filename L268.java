
import java.util.Arrays;

public class L268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        int m = (l + r) / 2;
        while (l < r){
            m = (l + r)/ 2;
            if (nums[m] > m) r = m;
            else l = m + 1;
        }
        return l;
    }
}
