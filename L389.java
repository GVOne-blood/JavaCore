public class L389 {
    public char findTheDifference(String s, String t) {
       int [] fred = new int[26];
       for (int i = 0; i < s.length(); i++) fred[s.charAt(i) - 'a']++;
         for (int i = 0; i < t.length(); i++) fred[t.charAt(i) - 'a']--;
         for (int i = 0;i <= 26; i++) if (fred[i] != 0) return (char) (i + 'a');
            return 'a';
    }
}
