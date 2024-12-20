import java.util.HashMap;
import java.util.Map;

public class L1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> f = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            f.put(nums[i], i);
        }
    int temp =0;
        for (int i = 0; i < nums.length; i++){
            temp = target - nums[i];
            if (f.containsKey(temp) && f.get(temp) != i) return new int[]{i, f.get(temp)};
        }
        return new int[]{};
    }
}
