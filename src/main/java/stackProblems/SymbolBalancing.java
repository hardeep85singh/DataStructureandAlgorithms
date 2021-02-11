package stackProblems;

import java.util.Stack;

public class SymbolBalancing {

    public boolean isValidSymbolPattern(String str){
        Stack<Character> characterStack = new Stack<>();

        if(str == null || str.length() == 0){
            return true;
        }

        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ')'){
                if(!characterStack.isEmpty() && characterStack.peek() == '('){
                    characterStack.pop();
                } else {
                    return false;
                }
            } else if(str.charAt(i) == ']'){
                if(!characterStack.isEmpty() && characterStack.peek() == '['){
                    characterStack.pop();
                } else {
                    return false;
                }
            } else if (str.charAt(i) == '}'){
                if(!characterStack.isEmpty() && characterStack.peek() == '{'){
                    characterStack.pop();
                } else {
                    return false;
                }
            } else {
                characterStack.push(str.charAt(i));
            }

            if(characterStack.isEmpty()){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
