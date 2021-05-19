package stringProblems;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccurenceOfCharacters {

    public static void main(String[] args)
    {
        String str = "hardeepsingh";
//        getOccuringChar(str.toUpperCase());
        noOfOccurOneForLoop(str.toUpperCase());
    }
    static final int MAX_CHAR = 256;

    static void getOccuringChar(String str)
    {
        // Create an array of size 256
        // i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];

        int len = str.length();

        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1)
                System.out.println(
                        "Number of Occurrence of "+ str.charAt(i)+ " is:" + count[str.charAt(i)]);
        }
    }

    public static void noOfAccurenceHashmap(String str){
        // creating hashmap containing char as key and occurences as a value
        Map<Character, Integer> charCountMap = new HashMap<>();

        // converting given string to char array
        char[] strArray = str.toCharArray();

        //checking each char of strArray
        for (char c : strArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void noOfOccurOneForLoop(String str){
        int[] count = new int[100];

        int length = str.length();
        for (int i = 0; i< length; i++){
            System.out.print(str.charAt(i) + " " + (int) str.charAt(i) + " ");
            count[str.charAt(i)] ++;
        }

        char[] ch = new char[length];
        for (int i = 0; i < ch.length; i++){
            System.out.println("Character :" + count[i] + " : " + count[i] );
        }

//        char[] ch = new char[length];
//
//        for (int i = 0; i < length; i++) {
//            ch[i] = str.charAt(i); //H
//
//            System.out.println(ch[i] + " " + count[i]);

//            int find = 0;
//            for (int j = 0; j <= i; j++) {
//
//                // If any matches found
//                if (str.charAt(i) == ch[j])
//                    find++;
//            }
//            if (find == 1)
//                System.out.println(
//                        "Number of Occurrence of "+ str.charAt(i)+ " is:" + count[str.charAt(i)]);
//        }
    }
}

