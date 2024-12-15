public class L2109 {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        result.append(s.substring(0, spaces[0]));
        for (int i = 0; i < spaces.length - 1; i++) {
            result.append( " " + s.substring(spaces[i], spaces[i + 1]));
            //System.out.println(result);
        }
        result.append(" " + s.substring(spaces[spaces.length - 1]));
        return result.toString();
    }
}
