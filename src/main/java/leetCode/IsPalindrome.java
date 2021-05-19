package leetCode;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
    public static void main(String[] args){
        int x = 43211234;
        System.out.println(isPalindromeByReverse(x));

    }

    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        List<Integer> list = new ArrayList<>();
        int remainder = 0;

        while (x % 10 != 0 || x / 10 != 0){
            remainder = x % 10;
            x = x / 10;
            list.add(remainder);
        }

        int j = 0;
        for (int i = 0; i < list.size() / 2; i++){
            if(list.get(i).equals(list.get(list.size() -1-i))){
                j++;
            }
        }
        return j == list.size()/2;
    }

    public static boolean isPalindromeByReverse(int x) {
        int temp = x;
        if (x < 0){
            return false;
        }
        int reverse = 0;

        while (x != 0){
            reverse = reverse * 10 + x % 10;
            x = x /10;
        }

        return temp == reverse;
    }
}
