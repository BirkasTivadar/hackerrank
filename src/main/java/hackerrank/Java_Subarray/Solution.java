package hackerrank.Java_Subarray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arrayOfNumbers = new int[size + 1];
        IntStream.range(0, size)
                .forEach(i -> arrayOfNumbers[i] = scanner.nextInt());

        scanner.close();

        IntStream.range(0, size)
                .forEach(i -> {
                    for (int j = i; j <= size; j++) {
                        int[] subArray = Arrays.copyOfRange(arrayOfNumbers, i, j);
                        if (Arrays.stream(subArray).sum() < 0) {
                            arrayOfNumbers[size] += 1;
                        }
                    }
                });

        System.out.println(arrayOfNumbers[size]);
    }
}
