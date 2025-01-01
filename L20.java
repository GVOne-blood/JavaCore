import java.util.Stack;

public class L20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(currentChar);
            } else if (stack.peek() == '(' && currentChar == ')' || stack.peek() == '[' && currentChar == ']' || stack.peek() == '{' && currentChar == '}') {
                stack.pop();
            } else {
                stack.push(currentChar);
            }
            i++;
        }
        return stack.isEmpty();
    }
}
