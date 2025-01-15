public class L1071 {
    public static int gcd(int a, int b) { if (b == 0) { return a; } return gcd(b, a % b);}
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        int GCD = gcd(str1.length(), str2.length());
        return str1.substring(0, GCD);
    }
}