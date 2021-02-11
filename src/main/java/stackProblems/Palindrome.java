package stackProblems;
import java.util.Stack;
public class Palindrome {

    public boolean isPalindromeString(String str){
        int i = 0;
        int j = str.length();
        char[] ch = str.toCharArray();
        while(i < j && ch[i] == ch[j]){
            i++;
            j++;
        }
        if(i < j){
            return false;
        } else {
            return true;
        }
    }

    public boolean isPalindromeStack(String str){
        char[] ch =  str.toCharArray();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i != str.length() /2 ){
            stack.push(ch[i]);
            i++;
        }
        while(i < ch.length){
            if(ch[i] != ((Character)stack.pop()).charValue()){
                return false;
            }
            i++;
        }
        return true;
    }
}
