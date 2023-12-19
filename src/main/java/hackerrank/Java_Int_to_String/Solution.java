package hackerrank.Java_Int_to_String;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        scanner.close();

        String myString = null;
        String result;

        try {
            myString = String.valueOf(myInt);
        } catch (IllegalArgumentException iae) {
            result = "Wrong answer";
        }

        if (myInt >= -100 && myInt <= 100 && myInt == Integer.parseInt(myString)) {
            result = "Good job";
        } else {
            result = "Wrong answer";
        }

        System.out.println(result);
    }
}