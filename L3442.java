import java.util.Arrays;

public class L3442 {
    public int maxDifference(String s) {

        int [] fred = new int [26];
        for (int i =  0; i < s.length(); i++) fred[s.charAt(i) - 'a']++;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //    int oddVal = Arrays.stream(fred).max().getAsInt();

        for (int num : fred) if (num % 2 != 0 && num != 0) {
            max = Math.max(max, num);
        }

        for (int num : fred) if (num % 2 == 0 && num != 0) {
            min = Math.min(min, num);
        }
        return max - min;

    }
}
