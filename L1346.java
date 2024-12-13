import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L1346 {
    public boolean checkIfExist(int[] arr) {
        Set <Integer> set = new HashSet<>();
            
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == 0) continue;
            set.add(arr[i]);
            if ((arr[i] % 2 == 0 && set.contains(arr[i] / 2)) || set.contains(arr[i] * 2))
            { System.out.println(arr[i]);
                return true;}
        }
       // if (set.size() >= 2) return true;
        return false;
    }
}
