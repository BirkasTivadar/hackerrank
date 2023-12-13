package hackerrank.Java_Subarray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arrayOfNumbers = new int[size];
        IntStream.range(0, size)
                .forEach(i -> arrayOfNumbers[i] = scanner.nextInt());

        scanner.close();

        int counter = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i; j <= size; j++) {
                int[] subArray = Arrays.copyOfRange(arrayOfNumbers, i, j);
                if (Arrays.stream(subArray).sum() < 0) counter++;
            }
        }
        System.out.println(counter);
    }
}
