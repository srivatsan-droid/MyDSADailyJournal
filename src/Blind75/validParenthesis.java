package Blind75;

import java.util.Stack;

public class validParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char convert : s.toCharArray()) {
            if(convert == '(') {
                stack.push(')');
            }
            else if(convert == '[') {
                stack.push(']');
            }
            else if(convert == '{') {
                stack.push('}');
            }
            else if(stack.isEmpty() || stack.pop() != convert) {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "(]";
        boolean ans = isValid(s);
        System.out.println(ans);
    }
}
