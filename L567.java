public class L567 {
        public int[] tk(String s1) {
            int tk[] = new int[26];
            for (char c : s1.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    tk[c - 'a']++;
                }
            }
            return tk;
        }
    
        public boolean kt(int[] tk, String s) {
            int[] tempTk = tk.clone(); // Tạo bản sao của tk để không ảnh hưởng đến dữ liệu gốc
            for (char c : s.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    tempTk[c - 'a']--;
                }
            }
            for (int i = 0; i < tempTk.length; i++) {
                if (tempTk[i] != 0) {
                    return false;
                }
            }
            return true;
        }
    
        public boolean checkInclusion(String s1, String s2) {
            int[] tk = tk(s1);
            int l = s1.length();
            for (int i = 0; i <= s2.length() - l; i++) {
                String s = s2.substring(i, i + l);
                if (kt(tk, s)) {
                    return true;
                }
            }
            return false;
        }
}
