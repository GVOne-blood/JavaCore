import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map <String, Integer> map = new HashMap<>();
        for (String word: s1.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word: s2.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        String s = new String();
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                s += word + " ";
            }
        }
        return s.split(" ")[0].equals("") ? new String[0] : s.split(" ");

    }
}
