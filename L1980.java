import java.util.HashSet;
import java.util.Set;

public class L1980  {
    public String findDifferentBinaryString(String[] nums) {
        String result = "";
        Set<String> set = new HashSet<>();
        for (String num : nums) set.add(num);
        for (int i = 0;i <= nums.length; i++){
            result = String.format("%" + nums.length + "s", Integer.toBinaryString(i)).replace(' ', '0');
            if (!set.contains(result) ) {
                    return result;
                }
            }

        return "";
    }
}
