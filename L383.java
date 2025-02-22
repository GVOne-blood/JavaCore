import java.util.HashMap;
import java.util.Map;

public class L383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map <Character, Integer> map = new HashMap<>();
        for (char c : ransomNote.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        for (char c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for (int count : map.values()){
            if (count > 0){
                return false;
            }
        }
        return true;
    }
}
