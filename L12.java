import java.util.LinkedHashMap;
import java.util.Map;

public class L12 {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String symbol[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < val.length; i++) {
            if (num == 0) {
                break;
            }
            while (num >= val[i]) {
                num -= val[i];
                result.append(symbol[i]);
            }

        }
        return result.toString();
    }
}
