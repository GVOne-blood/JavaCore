import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class L2670 {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result[] = new int[nums.length ];
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {set.add(nums[i]); ans[i] = set.size();}
       set.clear();
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = ans[i] - set.size();
            set.add(nums[i]);
        }
        return result;
    }
}
