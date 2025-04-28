public class L1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0, j = 0;
        int cnl = 0, cnr = 0, cnt = 0;
        while (i < s.length()){
            if (s.charAt(i) == '(') cnt++;
            else cnt--;
            if (cnt == 0)  {
                    res.append(s, j + 1, i);
                    j = i + 1;
                }
            i++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        L1021 l1021 = new L1021();
        System.out.println(l1021.removeOuterParentheses("(()())(())"));

    }
}
