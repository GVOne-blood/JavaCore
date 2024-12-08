import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class L2554 {
    public void maxCount(int[] banned, int n, int maxSum) {
        int cnt = 0;
        
       Set <Integer> temp = new LinkedHashSet<>();
       for (int i = 1; i <=n ; i++) temp.add(i);
        
        for (int i = 0; i < banned.length; i++) temp.remove(banned[i]);
        for (int i : temp) if (maxSum >= i){maxSum -= i; cnt++; System.out.println(maxSum + " " + i);}
        System.out.println(cnt);
    }
}
