package leetCode.easy;

public class RomanToInteger {

    public static void main(String[] args){
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String S) {
        int ans = 0, num = 0;
        for (int i = S.length()-1; i >= 0; i--) {
            switch(S.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans){
                ans = ans - num;
            } else {
                ans = ans + num;
            }
        }
        return ans;
    }
}

//    The only really tricky thing about counting in roman numerals is when a numeral is used
//    as a subtractive value rather than an additive value.
//    In "IV" for example, the value of "I", 1, is subtracted from the value of "V", 5.
//    Otherwise, you're simply just adding the values of all the numerals.
//    The one thing we should realize about the subtractive numerals is that
//    they're identifiable because they appear before a larger number.
//    This means that the easier way to iterate through roman numerals is from right to left,
//    to aid in the identifying process.
//     So then the easy thing to do here would be to iterate backwards through S,
//     look up the value for each letter, and then add it to our answer (ans).
//     If we come across a letter value that's smaller than the largest one seen so far,
//     it should be subtracted rather than added.

