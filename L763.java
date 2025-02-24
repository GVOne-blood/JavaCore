import java.util.ArrayList;
import java.util.List;

public class L763 {
    public List<Integer> partitionLabels(String s) {
        List <Integer> result = new ArrayList<>();
        int j =0, cut = 0;
       for (int i = 0;i < s.length(); i++)
       {
           j = Math.max(j, s.lastIndexOf(s.charAt(i)));
           if (j == i){
               result.add(i - cut + 1);
               cut = i + 1;
           }
       }
        return result;
    }
}
