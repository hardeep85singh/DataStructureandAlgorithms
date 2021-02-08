package misc;

import java.util.Scanner;

public class Scanning {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n --> 0){
            String in = scanner.nextLine();
            System.out.println(in);

        }
        scanner.useDelimiter("\\d+");

    }
}
