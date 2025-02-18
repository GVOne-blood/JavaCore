import java.util.ArrayList;
import java.util.List;

public class L1492 {
    public int kthFactor(int n, int k) {
        // List<Integer> factors = new ArrayList<>();
        int cnt = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){

                cnt++;
            }
            if (cnt == k){
                return i;
            }

        }
        return -1;
    }
}
