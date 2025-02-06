public class L3151 {
    public boolean isArraySpecial(int[] nums) {
        int sum = 0;
        if (nums.length == 1) return true;
        for (int i = 0; i < nums.length - 1; i++){
           if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 1) sum++;
           if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 0) sum++;
        }
        return sum == nums.length;
    }
}
