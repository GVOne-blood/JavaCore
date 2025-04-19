import java.util.ArrayList;
import java.util.List;

public class L1078 {
    public String[] findOcurrences(String text, String first, String second) {
       StringBuilder sb = new StringBuilder(text);
        List<String> res = new ArrayList<>();
        String[] words = sb.toString().split(" ");
        for (int i = 0; i < words.length - 2; i++){
            if (words[i].equals(first) && words[i + 1].equals(second)) res.add(words[i + 2]);
        }
        return res.toArray(new String[0]);
    }
}
