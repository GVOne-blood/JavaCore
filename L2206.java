public class L2206 {
    public boolean divideArray(int[] nums) {
        int [] fred = new int [501];
        for (int num : nums) fred[num]++;
        for (int i = 0; i <= 500; i++){
            if (fred[i] % 2 != 0) return false;
        }
        return true;
    }
}
