public class L1317 {
    boolean isNonZero(int n){
        if (n == 1) return true;
        boolean check = true;
        while ( n > 0){
            if (n % 2 == 0)
                if (n % 5 == 0) { check = false; break;}
            n /= 10;
        }
        return check;
    }
    public int[] getNoZeroIntegers(int n) {
        int [] res = new int [2];
        int i = 1;
        int j = n - 1;
        while (i <= n/2 + 1){
            if (isNonZero(i) && isNonZero(j)){
                res[0] = i;
                res[1] = j;
                return res;
            }
            i++;
            j--;
        }
        return res;
    }
}
