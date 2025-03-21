public class L2614 {

    public boolean isPrime (int n){
        for (int i = 2;i*i <= n; i++) if (n % i == 0) return false;
        return n > 1;
    }
    public int diagonalPrime(int[][] nums) {
        int res = 0;
        for (int i = 0;i < nums.length; i++){
            if (isPrime(nums[i][i])) res = Math.max(res, nums[i][i]);
            if (isPrime(nums[i][nums.length - i - 1])) res = Math.max(res, nums[i][nums.length - i - 1]);
        }
        return res;
    }
}
