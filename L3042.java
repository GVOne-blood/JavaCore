public class L3042 {
    public boolean isPrefixAndSuffix (String str1, String str2){
        return  str2.startsWith(str1) && str2.endsWith(str1);
    }
    public int countPrefixSuffixPairs(String[] words) {
        int cnt = 0;
        for (int i = 0 ; i < words.length - 1; i++)
            for (int j = i + 1; j < words.length; j++){
                if (isPrefixAndSuffix(words[i], words[j])) cnt++;
            }
        return cnt;
    }
}
