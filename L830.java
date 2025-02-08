import java.util.ArrayList;
import java.util.List;

public class L830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List <List < Integer >> result = new ArrayList<>();
        int cnt = 0;
        s = s + " ";
        for (int i = 0; i < s.length() - 1; i++){
            char c = s.charAt(i);
            if (cnt >= 2 && (i == s.length() - 1 || c != s.charAt(i + 1))) {
                List < Integer > list = new ArrayList<>();
                list.add(i - cnt);
                list.add(i);
                result.add(list);
            }
            if (c != s.charAt(i + 1)) {
                 cnt = 0;
            }
            else cnt++;

        }
        return result;
    }
}
