package interviewProblems;

public class StringReverse {

    public static void main(String[] args){
        String str = "Hardeep Singh";

        // reversed string using StringBuffer
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println(reverseStr);

        //iterative method to reverse String
        reverseStr = reverseIterative(str);
        System.out.println(reverseStr);

        // recursive method to reverse String
        reverseStr = reverseRecursive(str);
        System.out.println(reverseStr);

    }

    public static String reverseIterative(String str){
        char[] ch = str.toCharArray();
        StringBuilder newStr = new StringBuilder();
        for (int i = ch.length-1; i>=0; i--){
            newStr.append(ch[i]);
        }
        return newStr.toString();
    }

    public static String reverseRecursive(String str){
        if(str.length() < 2){
            return str;
        }

        return reverseIterative(str.substring(1)) + str.charAt(0);

    }
}

