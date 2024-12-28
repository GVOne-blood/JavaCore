import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L3364 {

        public int minimumSumSubarray(List<Integer> nums, int l, int r) {
            if (nums == null || nums.size() == 0 || l <= 0 || r <= 0) {
                throw new IllegalArgumentException("Invalid input parameters.");
            }
    
            int[] sum = new int[nums.size() + 1];
            sum[0] = 0;
            for (int i = 0; i < nums.size(); i++) {
                sum[i + 1] = sum[i] + nums.get(i);
            }
    
            List<Integer> tempList = new ArrayList<>();
    
            for (int i = 0; i < sum.length - l; i += l) {
                int temp = sum[i + l] - sum[i];
                if (temp > 0) {
                    tempList.add(temp);
                }
            }
    
            for (int i = 0; i < sum.length - r; i += r) {
                int temp = sum[i + r] - sum[i];
                if (temp > 0) {
                    tempList.add(temp);
                }
            }
    
            int min = tempList.stream().min(Integer::compare).orElse(-1);
            return min == 0 ? -1 : min;
        }
    

    }
    

