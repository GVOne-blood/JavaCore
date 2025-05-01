public class L2574 {
        public int[] leftRightDifference(int[] nums) {
            int n = nums.length;
            int[] sumL = new int[n];
            int[] sumR = new int[n];
            int[] res = new int[n];

            for (int i = 1; i < n; i++) {
                sumL[i] = sumL[i - 1] + nums[i - 1];
            }

            for (int i = n - 2; i >= 0; i--) { // Ensure it includes i == 0
                sumR[i] = sumR[i + 1] + nums[i + 1];
            }

            for (int i = 0; i < n; i++) {
                res[i] = Math.abs(sumL[i] - sumR[i]);
            }

            return res;
        }


    public static void main(String[] args) {
        L2574 l2574 = new L2574();
        System.out.println(l2574.leftRightDifference(new int[]{10, 4, 8, 3}));
    }
}
