package leetCode.easy;

public class ClimbStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairsRecursive(n));
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 2;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result[n - 1];

    }

    public static int climbStairsRecursive(int n){
        if(n <= 2){
            return n;
        }
        return climbStairsRecursive(n-1) + climbStairsRecursive(n-2);
    }
}
