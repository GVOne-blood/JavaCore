import java.util.Arrays;

public class L455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0, cnt = 0;
        while (i < g.length && j < s.length){
            if (g[i] <= s[j]){
                i++;
                j++;
                cnt++;
            } else {
                j++;
            }
        }
        return cnt;
    }
}
