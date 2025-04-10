public class L2485 {
    public int pivotInteger(int n) {
        if (n == 1) return 1;
        int [] flexSum = new int [n];
        int sum = 0;
        flexSum[0] = 1;
        for (int i = 1; i < n ; i++) flexSum[i] = flexSum[i - 1] + i + 1;
        int i = n - 1;
        while (i > 0){
           int t1 = flexSum[i];
           int t2 = flexSum[n - 1] - flexSum[i - 1];

           if (flexSum[i] == flexSum[n - 1] - flexSum[i]) return i + 1;
           i--;
        }
        return -1;
    }
}
