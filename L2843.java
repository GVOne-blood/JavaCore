public class L2843 {

    public boolean isSymmetric(int n){
        String s = String.valueOf(n);
        int  len = s.length();
        if (len % 2 != 0) return false;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < len / 2; i++){
            sum1 += s.charAt(i) - '0';
            sum2 += s.charAt(len - 1 - i) - '0';
        }
        return sum1 == sum2;
    }
    public int countSymmetricIntegers(int low, int high) {
        if (low > high) return 0;
        int cnt = 0;
        for (int i = low; i <= high; i+=1) if (isSymmetric(i)) cnt++;
        return cnt;
    }
}
