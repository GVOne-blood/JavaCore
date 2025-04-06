import java.util.ArrayList;
import java.util.List;

public class L1903 {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        sb.reverse();
        int i = 0;

        for (char c : sb.toString().toCharArray()) {
            if ((c - '0') % 2 == 1) {
                sb.reverse();
                return sb.toString();
            }
            sb.deleteCharAt(i);
        }

        return "";
    }

}
