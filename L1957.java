public class L1957 {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        char indecate = ' ';
        //result.append(s.charAt(0));
        for (int i = 0; i < s.length() - 1; i++) {
            if (count == 0) indecate = s.charAt(i);
            if (indecate == s.charAt(i + 1)) {
                count++; 
            System.out.println(count); } 
            else count = 0;
            if (count < 2) result.append(s.charAt(i));
        }
        result.append(s.charAt(s.length() - 1));
        return result.toString();
    }
}
