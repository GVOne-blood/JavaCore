public class L1524 {
    public int numOfSubarrays(int[] arr) {
        int even = 1;
        int odd = 0;
        int cnt = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum % 2 == 0) {
                even++;
                cnt += odd;
            } else {
                odd++;
                cnt += even;
            }
        }
        return cnt;
    }
}
