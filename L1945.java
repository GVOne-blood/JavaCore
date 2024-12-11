public class L1945 {
    public String findLucky(String s, int k) {
        int sum = 0;
        if (k == 0) return s;
        for (int i = 0; i < s.length(); i++) {
            sum += (Integer.parseInt(s.charAt(i) + ""));
            System.out.println(sum);
    }
        return findLucky(sum + "", k - 1);
    
}
    public int getLucky(String s, int k) {
        String sum = "";
        for (char c : s.toCharArray()){
            sum += (c - 'a' + 1) + "";
            System.out.println(sum);
        }
            int result = Integer.parseInt(findLucky(sum, k));
        return result ;
    }
}
