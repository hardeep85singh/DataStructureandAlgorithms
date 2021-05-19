package leetCode.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String [] args){
        String s = "[{)]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (map.containsKey(curr)) {
                stack.push(curr);
            } else if (map.containsValue(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}

//
//switch(s.charAt(i)) {
//        case '(': num = 1; break;
//        case ')': num = 5; break;
//        case '{': num = 10; break;
//        case '}': num = 50; break;
//        case '[': num = 100; break;
//        case ']': num = 500; break;
//        }
