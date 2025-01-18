public class L1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    int temp [] = new int [101];
    for (int i = 0; i < nums.length; i++) temp[nums[i]]++;
    for (int i = 1; i < temp.length; i++) temp[i] += temp[i - 1];
    for (int i = 0; i < nums.length; i++) if (nums[i] != 0) nums[i] = temp[nums[i] - 1]; else nums[i] = 0;
        return nums;
    }
}
