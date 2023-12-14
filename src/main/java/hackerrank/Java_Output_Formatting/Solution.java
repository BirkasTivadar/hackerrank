package hackerrank.Java_Output_Formatting;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        System.out.println("================================");

        Scanner scanner = new Scanner(System.in);

        IntStream.range(0, 3)
                .forEach(i -> {
                    String myString = scanner.next();
                    int myInt = scanner.nextInt();
                    System.out.print(String.format("%-15s%03d", myString, myInt)
                            .concat(System.lineSeparator()));
                });

//        for (int i = 0; i < 3; i++) {
//            String myString = scanner.next();
//            int myInt = scanner.nextInt();
//            System.out.print(String.format("%-15s%03d", myString, myInt)
//                    .concat(System.lineSeparator()));
//        }

        scanner.close();

        System.out.println("================================");
    }
}
