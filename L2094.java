import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L2094 {
    public boolean check(int num, int [] fred){
        int [] temp = fred.clone();
        while (num > 0){
            temp[num % 10]--;
            if (temp[num % 10] < 0) return false;
            num /= 10;
        }
        return true;
    }
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> res = new ArrayList<>();
        int [] fred = new int [101];
        for (int i = 0;i < digits.length; i++) fred[digits[i]]++;
        for (int i = 100; i <= 998; i+=2) if (check(i, fred)) res.add(i);
        int [] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) ans[i] = res.get(i);
        return ans;
    }
}
