import java.util.HashMap;
import java.util.Map;

public class L791   {
    public String customSort(String order, String s) {
        // Tạo một map để đếm tần suất xuất hiện của các ký tự trong s
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        // Thêm các ký tự theo thứ tự trong 'order'
        for (char c : order.toCharArray()) {
            if (charCount.containsKey(c)) {
                int count = charCount.get(c);
                for (int i = 0; i < count; i++) {
                    result.append(c);
                }
                charCount.remove(c);
            }
        }

        // Thêm các ký tự còn lại không có trong 'order'
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
