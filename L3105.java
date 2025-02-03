import java.util.HashSet;
import java.util.Set;

public class L3105 {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLenDe = 1;
        int maxLenIn = 1;
        int temp1 = 1;
        int temp2 = 1;
       for (int i = 1; i < nums.length; i++){
           if (nums[i] < nums[i - 1]){
                maxLenDe++;
                temp2 = Math.max(temp2, maxLenDe);
                maxLenIn = 1;
              }
              else if (nums[i] > nums[i - 1]){
                maxLenIn++;
                temp1 = Math.max(temp1, maxLenIn);
                maxLenDe = 1;
              }
                else{
                    maxLenIn = 1;
                    maxLenDe = 1;
                }
       }
       return Math.max(temp1, temp2);
    }
}
