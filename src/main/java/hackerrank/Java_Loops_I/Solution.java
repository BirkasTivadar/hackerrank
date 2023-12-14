package hackerrank.Java_Loops_I;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        scanner.close();

        IntStream.range(1, 11)
                .forEach(i -> System.out.println(String.format("%d x %d = %d", myInt, i, myInt * i)));
    }
}