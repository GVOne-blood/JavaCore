public class L1796 {
    public int secondHighest(String s) {
        int [] fred = new int [10];
        int res = 0;
        int cnt = 0;
        for (char c : s.toCharArray()) if (c >= '0' && c <= '9') fred[c - '0']++;

        for (int i = 9; i >= 0; i--){
            if (fred[i] > 0){ cnt++;
                if (res == 0) res = i;
                else return i;
            }
        }
        return cnt > 1? res : -1;
    }
}
