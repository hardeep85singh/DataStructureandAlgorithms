package leetCode.easy;

public class LengthOfLastWord {

    public static void main(String[] args){
        String s = " a";
        System.out.println(lengthOfLastWordIterateFromStart(s));
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        boolean char_flag = false;
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i))) {
                // Once the first character from last
                // is encountered, set char_flag to true.
                char_flag = true;
                len++;
            }
            else {
                // When the first space after the characters
                // (from the last) is encountered, return the
                // length of the last word
                if (char_flag == true)
                    return len;
            }
        }
        return len;
    }
    public static int lengthOfLastWordIterateFromStart(String s) {
        int length = 0;
        String str = s.trim();

        for (int i = 0; i< str.length(); i++){
            if(s.charAt(i) == ' ' ){
                length = 0;

            } else {
               length ++;
            }
        }
        return length;
    }
}
