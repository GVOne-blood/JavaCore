public class L1910 {

    public String removeOccurrences(String s, String part) {
//        StringBuilder stack = new StringBuilder();
//        for (int i = 0; i < s.length(); i++){
//            stack.append(s.charAt(i));
//            if (stack.toString().contains(part)){
//                stack.setLength(stack.length() - part.length());
//            }
//        }
//        return stack.toString();
        StringBuilder stack = new StringBuilder(s);
        while (stack.indexOf(part) != -1){
            int id = stack.indexOf(part);
            stack.delete(id, id + part.length());
        }
        return stack.toString();
    }
}
