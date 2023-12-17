package hackerrank.Java_EndOfFile;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.printf("%d %s%n", n++, line);
        }
        scanner.close();
    }
}
