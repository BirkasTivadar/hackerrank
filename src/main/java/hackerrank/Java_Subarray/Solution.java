package hackerrank.Java_Subarray;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrayOfNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();
            arrayOfNumbers[i] = number;
        }

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
