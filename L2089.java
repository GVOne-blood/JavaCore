import java.util.ArrayList;
import java.util.List;

public class L2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int cnt = 0; int sl = 0;
        for (int num : nums) {
            if (num < target) cnt++;
            if (num == target) sl++;
        }
        while (sl > 0){
            result.add(cnt);
            cnt++;
            sl--;
        }
        return result;
    }
}
