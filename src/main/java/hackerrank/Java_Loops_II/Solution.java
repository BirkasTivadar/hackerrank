package hackerrank.Java_Loops_II;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        IntStream.range(0, q)
                .forEach(i -> {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int n = scanner.nextInt();
                    int result = a + b;
                    for (int j = 0; j < n; j++) {
                        System.out.printf("%d ", result);
                        result += (int) Math.pow(2, j + 1) * b;
                    }
                    System.out.println();
                });

//        for (int i = 0; i < q; i++) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int n = scanner.nextInt();
//            int result = a + b;
//            for (int j = 0; j < n; j++) {
//                System.out.printf("%d ", result);
//                result += (int) Math.pow(2, j + 1) * b;
//            }
//            System.out.println();
//        }
        scanner.close();
    }
}
