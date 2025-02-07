import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L804 {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[] = new String[]{
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        Map<Character, String> convert = new HashMap<>();
        Set<String> frequence = new HashSet<>();

        for (char c = 'a'; c <= 'z'; c++) {
            convert.put(c, morse[c - 'a']);  // Sửa chỉ số mảng đúng
        }

        for (String word : words) {
            StringBuilder s = new StringBuilder();  // Tạo mới StringBuilder cho mỗi từ
            for (int i = 0; i < word.length(); i++) {
                s.append(convert.get(word.charAt(i)));
            }
            frequence.add(s.toString());  // Thêm chuỗi vào Set
        }

        return frequence.size();
    }
}
