package interviewProblems;

import java.util.Arrays;

public class CountChars {

    public static void main(String[] args){
        String str = "hardeep singh";
        countChars1(str);

    }

    public static void countChars(String str){
        int[] count = new int[256];
        int length = str.length();

        for(int i = 0; i< length; i++){
            count[str.charAt(i)]++;
        }

        char[] ch = new char[str.length()];

        for (int i = 0; i< length; i++){
            ch[i] = str.charAt(i);
            int value = 0;

            for (int j = 0; j <= i; j++){
                if(str.charAt(i) == ch[j]){
                    value ++;
                }
            }
            if(value == 1){
                System.out.println(str.charAt(i) + ": " + count[str.charAt(i)]);
            }
        }
    }

    public static void countChars1(String str){
        int n = str.length();

        int[] count = new int[256];
        int[] index = new int[256];

        for (int i = 0; i < 256; i++){
            index[i] = n;
        }

        for (int i = 0; i< n; i++){
            char x = str.charAt(i);
            count[x] ++;

            if(count[x] == 1 && x!= ' '){
                index[x] = i;
            }
            if(count[x] == 2){
                index[x] = n;
            }
        }
        Arrays.sort(index);
        for (int i = 0; i< 256 && index[i] !=n; i++){
            System.out.println(str.charAt(index[i]));
        }
    }
}
