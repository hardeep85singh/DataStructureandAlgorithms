package leetCode.easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args){
        int[] digits = {1,7};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int[] newDigits;
        for (int i = digits.length-1; i>=0; i--){
            int num = digits[i] + carry;
            digits[i] = num % 10;
            carry = num / 10;
        }

        if(carry == 1){
            newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            for (int i = 0; i < digits.length; i++){
                newDigits[i+1] = digits[i];
            }
            return newDigits;
        }
        return digits;
    }
}
