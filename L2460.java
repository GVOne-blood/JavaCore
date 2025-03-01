public class L2460 {
    public int[] applyOperations(int[] nums) {
        for (int i = 0;i < nums.length - 1; i++) if (nums[i] == nums[i + 1]){
            nums[i] *= 2;
            nums[i + 1] = 0;
        }
        int z = 0;
        int [] result = new int [nums.length];
        for (int num : nums) if (num != 0) {
            result[z] = num;
            z++;
        }
        return result;
    }
}
