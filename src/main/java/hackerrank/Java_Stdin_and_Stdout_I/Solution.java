package hackerrank.Java_Stdin_and_Stdout_I;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IntStream.range(0, 3)
                .forEach(i -> {
                    int myInt = scanner.nextInt();
                    System.out.println(myInt);
                });

//        for (int i = 0; i < 3; i++) {
//            int myInt = scanner.nextInt();
//            System.out.println(myInt);
//        }
        scanner.close();
    }
}
