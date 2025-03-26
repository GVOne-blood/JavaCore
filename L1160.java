import java.util.Arrays;

public class L1160 {

    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];

        // Count occurrences of each character in `chars`
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }

        int totalLength = 0;

        // Process each word in `words`
        for (String word : words) {
            int[] temp = charCount.clone();
            boolean canForm = true;

            for (char c : word.toCharArray()) {
                if (--temp[c - 'a'] < 0) {
                    canForm = false;
                    break; // Exit early if a character is not available
                }
            }

            if (canForm) {
                totalLength += word.length(); // Add word length to total if it can be formed
            }
        }

        return totalLength;
    }

}
