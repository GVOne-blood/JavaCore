public class L2601 {
    public boolean primeSubOperation(int[] nums) {
        int n = nums.length;
        int [] primes = new int [1001];
        primes[0] = 0; primes[1] = 0;
        for (int i = 2;i < 1001; i++) primes[i] = 1;
        for (int i = 2;i < 1001; i++){
            if (primes[i] == 1) {
                for (int j = i*i; j < 1001; j+=i) primes[j] = 0;
            }
        }
        int i = 0;
        int j = 1;
        while (i < nums.length){
            int temp = nums[i] - j;
            if (temp < 0) return false;
            if (primes[temp] == 1 || temp == 0){
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        return true;
    }
}
