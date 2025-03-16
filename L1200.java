import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++){
            minDiff = Math.min(minDiff, arr[i+1] - arr[i]);
        }

        for (int i = 0;i < arr.length - 1; i++){
            if (arr[i+1] - arr[i] != minDiff){
                continue;
            }
            List<Integer> pair = new ArrayList<>();
            pair.add(arr[i]);
            pair.add(arr[i+1]);
            result.add(pair);
        }
        return result;
    }
}
