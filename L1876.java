import java.util.HashSet;
import java.util.Set;

public class L1876 {
    public int countGoodSubstrings(String s) {
       // StringBuilder temp = new StringBuilder();
        int cnt = 0;

       for (int i = 2 ;i < s.length(); i++){
        if (s.charAt(i) != s.charAt(i-1) && s.charAt(i) != s.charAt(i-2) && s.charAt(i-1) != s.charAt(i-2)){
            cnt++;
            }
        }

    return cnt;
    }
}
