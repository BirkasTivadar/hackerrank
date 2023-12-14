package hackerrank.Java_Output_Formatting;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String myString = scanner.next();
            int myInt = scanner.nextInt();
            System.out.print(String.format("%-15s%03d", myString, myInt)
                    .concat(System.lineSeparator()));
        }
        scanner.close();

        System.out.println("================================");

    }
}
