public class L3084 {
    public long countSubstrings(String s, char c) {
        int fred = 0;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == c) fred++;
        return (long)fred * (fred + 1) / 2;
    }
}
