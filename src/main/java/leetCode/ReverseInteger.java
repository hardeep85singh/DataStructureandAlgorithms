package leetCode;
//Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-2 raise to 31, (2 raise to 31 - 1)], then return 0.


import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {

    public static void main(String[] args){

        int x = 123;
//        int x = (int) Math.pow(2, 31);
//        System.out.println(x);
        System.out.println(reverseArray(x));

    }

    public static int reverse(int x){
        List<Integer> list = new ArrayList<>();
        int remainder = 0;

        while (x % 10 != 0 || x /10 !=0){
            remainder = x % 10;
            x = x /10;
            list.add(remainder);
        }

        double y = 0;
        double length = list.size();
        for (int i = 0; i< length; i++){
            y = y + list.get(i) *  Math.pow(10, length -i -1);
        }

        if(y < Math.pow(2, 31) * -1 || y > (Math.pow(2,31) + 1)){
            return 0;
        } else {
            return (int)y;
        }
    }

    public static int reverseArray(int x){
        int[] arr = new int[10];
        int remainder = 0;
        int i = 0;
        while (x % 10 != 0 || x /10 !=0){
            remainder = x % 10;
            x = x /10;
            arr[i] = remainder;
            i++;
        }

        double y = 0;
//        double length = arr.length;
        for (int j = 0; j< i; j++){
            y = y + arr[j] *  Math.pow(10, i -j -1);
        }

        if(y < Math.pow(2, 31) * -1 || y > (Math.pow(2,31) + 1)){
            return 0;
        } else {
            return (int)y;
        }
    }
}
