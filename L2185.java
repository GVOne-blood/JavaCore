public class L2185 {
    public int prefixCount(String[] words, String pref) {
        int sum = 0;
        for (String item : words) if (item.startsWith(pref)) sum++;
        return sum;
    }
}
