import java.util.Queue;

public class L3174 {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i)) && result.length() != 0){
                result.setLength(result.length() - 1);
            }
            else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
