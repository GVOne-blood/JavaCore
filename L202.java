import java.util.HashSet;
import java.util.Set;

public class L202 {
    public boolean isHappy(int n) {
        if (n < 10) return false;
        int sum = 0, temp = n;
        Set<Integer> set = new HashSet<>();
        while (true){
            while (temp > 0) {
                sum += (temp%10) * (temp%10); 
                temp /= 10;
                
            }
            // loop++;
            // if (loop > 10) return false;
            temp = sum;

            System.out.println(sum + "sum - temp" + temp);
            
            if (set.contains(1)){
                return true;
            }
            else if (set.contains(sum)) return false;
            set.add(sum);
            sum = 0;
        }
        
        
    }
}
