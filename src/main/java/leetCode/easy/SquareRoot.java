package leetCode.easy;

public class SquareRoot {

    public static void main(String[] args) {
        int x = 999;
        System.out.println(mySqrtBinary(x));
    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }

        int i = 1;
        while (i * i <= x) {
            i = i + 1;
        }

        return i - 1;
    }
    public static int mySqrtBinary(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 1;
        int right = x;

        while (left < right){
            int mid = left + (right - left + 1) /2;
            if(mid <= x / mid ){
                left = mid;
            } else {
                right = mid -1;
            }
        }
        return left;
    }
}
