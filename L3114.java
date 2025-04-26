public class L3114 {
    public String findLatestTime(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(0) == '?' &&  sb.charAt(1) == '?') {sb.setCharAt(0, '1'); sb.setCharAt(1, '1');}
        else if (sb.charAt(0) == '?' && sb.charAt(1) != '?'){
            if (sb.charAt(1) == '1' ||  sb.charAt(1) == '0') sb.setCharAt(0, '1');
            else sb.setCharAt(0, '0');
        }
        else if (sb.charAt(0) != '?' && sb.charAt(1) == '?'){
            if (sb.charAt(0) == '1') sb.setCharAt(1, '1');
            else sb.setCharAt(1, '9');
        }
        if (sb.charAt(3) == '?') sb.setCharAt(3, '5');
        if (sb.charAt(4) == '?') sb.setCharAt(4, '9');
        return sb.toString();
    }
}
