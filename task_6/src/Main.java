import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        DynamicArrayStack arr = new DynamicArrayStack();
        linkedListStack list = new linkedListStack();
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        System.out.println(arr.pop());
        System.out.println(arr.pop());
        System.out.println(arr.peek());
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        System.out.println(list.peek());
        System.out.println(list.pop());
        System.out.println(list.peek());
        System.out.println(reverseString("abcd"));
        System.out.println(balancedBrackets.isBalanced("(){}"));
        System.out.println(balancedBrackets.isBalanced("(){>><<})"));

    }

    public static String reverseString(String x) {
        Stack<Character> st = new Stack<Character>();
        String result = "";
        for (int i = 0; i < x.length(); i++) {
            st.push(x.charAt(i));
        }
        while (!st.isEmpty()) {
            result += st.pop();
        }
        return result;
    }
}
