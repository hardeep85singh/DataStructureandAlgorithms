package leetCode.easy;

public class ConvertBinaryString {
    public static void main(String[] args) {
        String a = "11"; // 3
        String b = "1"; // 1 --> 3 + 1 = 4 to binary i.e 100

        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        String str = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;

        while (i >= 0 || j >= 0 || sum == 1) {

            if (i >= 0) {
                sum = sum + (a.charAt(i) - '0');
            }
            if (j >= 0) {
                sum = sum + (b.charAt(j) - '0');
            }

            str = (char) (sum % 2 + '0') + str;
            sum = sum / 2;
            i--;
            j--;
        }
        return str;
    }
}
