public class L2000 {
    public String reversePrefix(String word, char ch) {
        StringBuilder res = new StringBuilder(word);
        if (res.indexOf(ch + "") != -1) {
            StringBuilder sb = new StringBuilder(res.substring(0, res.indexOf(ch + "") + 1));
            res.delete(0, res.indexOf(ch + "") + 1);
            res = sb.reverse().append(res);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        L2000 l2000 = new L2000();
        System.out.println(l2000.reversePrefix("abcdefd", 'd'));
    }
}
