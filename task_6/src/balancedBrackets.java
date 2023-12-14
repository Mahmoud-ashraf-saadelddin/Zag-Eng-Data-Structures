import java.util.Stack;

public class balancedBrackets {
    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isOpen(ch)) {
                st.push(ch);
            } else if (isClosed(ch)) {
                char last = st.pop();
                if (!isMatch(last, ch))
                    return false;
            }

        }
        return st.isEmpty();

    }

    private static boolean isOpen(char open) {
        return open == '(' || open == '<' || open == '[' || open == '{';

    }

    private static boolean isClosed(char close) {
        return close == ')' || close == '>' || close == ']' || close == '}';

    }

    private static boolean isMatch(char open, char close) {
        return open == '(' && close == ')' || open == '<' && close == '>'
                || open == '[' && close == ']' || open == '{' && close == '}';
    }
}
