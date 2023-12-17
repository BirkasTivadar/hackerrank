package hackerrank.Java_Datatypes;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        IntStream.range(0, T)
                .forEach(i -> {
                    String number = scanner.next();
                    printDataTypes(number);
                });

//        for (int i = 0; i < T; i++) {
//            String number = scanner.next();
//            printDataTypes(number);
//        }

        scanner.close();
    }

    private static void printDataTypes(String number) {
        long n;
        try {
            n = Long.parseLong(number);
        } catch (IllegalArgumentException iae) {
            System.out.printf("%s can't be fitted anywhere.%n", number, iae);
            return;
        }
        canBeFitted(n);
    }

    private static void canBeFitted(Long n) {
        System.out.printf("%d can be fitted in:%n", n);
        if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
            System.out.println("* byte");
        }
        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
            System.out.println("* short");
        }
        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
            System.out.println("* int");
        }
        System.out.println("* long");
    }
}
