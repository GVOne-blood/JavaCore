import java.util.*;

public class L347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        Queue <Integer> q = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        q.addAll(map.keySet());
        int result[] = new int [k];
        for (int i = 0;i < k; i++) result[i] = q.poll();
        return result;
//        int i = nums.length - 1;
//        int [] result = new int[100001];
//        while (i >= 0){
//            result[map.get(nums[i])] = nums[i];
//            i = i - 1;
//        }
//
//        int [] temp = new int [k];
//        int z = 0;
//        for (int j = 10; j >= 0; j--){
//            if (result[j] != 0) {
//                temp[z] = result[j];
//                z++;
//                k--;
//            }
//            if (k == 0) break;
//
//        }
//        return temp;
    }
}
