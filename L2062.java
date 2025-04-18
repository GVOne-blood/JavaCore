import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L2062 {
        public int countVowelSubstrings(String word) {
            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
            int count = 0;

            for (int i = 0; i < word.length(); i++) {
                Set<Character> seen = new HashSet<>();
                for (int j = i; j < word.length(); j++) {
                    char c = word.charAt(j);
                    if (vowels.contains(c)) {
                        seen.add(c);
                        if (seen.size() == 5) {
                            count++;
                        }
                    } else {
                        break;
                    }
                }
            }
            return count;
        }
}
