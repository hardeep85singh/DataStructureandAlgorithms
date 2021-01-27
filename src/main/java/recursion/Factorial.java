package recursion;

public class Factorial {
// Time complexity - O(n)
// {T(n) = T(n-1) + 3}
    public int factorialCal(int number){
        if(number < 0){
            throw new NegativeNumberException();
        } else if (number == 0){
            return 1;
        } else if (number == 1){
            return number;
        } else {
            return factorialCal(number -1) * number;
        }
    }

    public static class NegativeNumberException extends IllegalArgumentException{
        public NegativeNumberException(){
            String s = "Number should not be negative.";
        }
    }

}
