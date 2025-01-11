public class L1422 {
    public int maxScore(String s) {
        if (!s.contains("1")) return 1;
       int maxScore = 0;
       int len = s.length();
       int [] sum = new int [len];
       sum[0] = s.charAt(0) == '1' ? 1 : 0;
       for (int i = 1; i < len; i++)
        sum[i] = sum [i - 1] + (s.charAt(i) == '1' ? 1 : 0);
        for (int i = 0; i < len - 1; i++){ 
            System.out.println(sum[len - 1] - sum[i] + (i + 1) - sum[i]);
            maxScore = Math.max(maxScore, sum[len - 1] - sum[i] + (i + 1) - sum[i]);
        }
        return maxScore;
    }
}
