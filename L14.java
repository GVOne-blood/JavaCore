import java.util.Arrays;
import java.util.stream.Collectors;

public class L14 {
    public String longestCommonPrefix(String[] strs) {
       // StringBuilder result = new StringBuilder();
       String result = "";
        String s;
        int cnt = 0;
        for (int i = 0; i < strs[0].length(); i++){
            s = strs[0].substring(0, i + 1);
            for (String str : strs){
                if (str.startsWith(s)) cnt++;
                if (cnt == strs.length){ result = s; cnt =0;}
            }
            cnt = 0;
        }
        return result;
    }
}
