package interviewProblems;

import java.util.Locale;

public class AddNumbers {
    public static void main(String[] args ){
        String str1 = "12343";
        String str2 = "8975898";

        System.out.println(addLargeNumbers(str1, str2));

    }

    public static String addLargeNumbers(String str1, String str2){

        //check length, make sure length of str2 is larger
        if(str1.length() > str2.length()){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        // Empty string for storing result
        String result = "";

        // length of both strings
        int n1 = str1.length();
        int n2 = str2.length();

        // Reverse both strings
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++){
            int sum = ((int)(str1.charAt(i)) + (int)(str2.charAt(i)) + carry);

            result = result + (char)(sum % 10);

            carry = sum /10;
        }

        // add remaining digits of larger number
        for (int i = n1; i< n2; i++){
            int sum = ((int) (str2.charAt(i)) + carry);
            result = result + (char)(sum % 10);
            carry = sum /10;
        }

        // add remaining carry
        if(carry > 0){
            result = result + (char)(carry);
        }
        result = new StringBuilder(result).reverse().toString();
        return result;
    }
}
