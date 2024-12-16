public class L169 {
    public int majorityElement(int[] nums) {
        int count = 0, cadidate = 0;
        for (int i : nums){
            if (count == 0) cadidate = i;
            if (i == cadidate) count++;
            else count--;
        }
        return cadidate;
    }
}
