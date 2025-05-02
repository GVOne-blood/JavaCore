public class L2278 {
    public int percentageLetter(String s, char letter) {
        int []temp = new int [26];
        for (int i = 0; i < s.length(); i++) temp[s.charAt(i) - 'a']++;
//        System.out.println(temp[letter - 'a']);
//        System.out.println(s.length());
        return (int) Math.floor((double) temp[letter - 'a'] / s.length() * 100);
    }

    public static void main(String[] args) {
        L2278 l2278 = new L2278();
        System.out.println(l2278.percentageLetter("vmvvvvvzrvvpvdvvvvyfvdvvvvpkvvbvvkvvfkvvvkvbvvnvvomvzvvvdvvvkvvvvvvvvvlvcvilaqvvhoevvlmvhvkvtgwfvvzy", 'v'));
    }
}
