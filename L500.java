public class L500 {
    public final String row_1 = "qwertyuiop";
    public final String row_2 = "asdfghjkl";
    public final String row_3 = "zxcvbnm";

    public boolean check(String word, String pattern) {
        int i = 0;
        // Check if all characters of word are in the pattern
        while (i < word.length() && pattern.contains(word.charAt(i) + "")) {
            i++;
        }
        // Return true if all characters are in the same row pattern, else return false
        return i == word.length();
    }

    public String[] findWords(String[] words) {
        StringBuilder s = new StringBuilder();
        for (String word : words) {
            boolean isValid = false;
            char firstChar = Character.toLowerCase(word.charAt(0));
            if ("qwertyuiop".indexOf(firstChar) != -1)
                isValid = check(word.toLowerCase(), "qwertyuiop");
            else if ("asdfghjkl".indexOf(firstChar) != -1)
                isValid = check(word.toLowerCase(), "asdfghjkl");
            else if ("zxcvbnm".indexOf(firstChar) != -1)
                isValid = check(word.toLowerCase(), "zxcvbnm");

            if (isValid) s.append(word).append(" ");
        }
        return s.isEmpty()? new String [] {} : s.toString().split(" ");

    }
}
