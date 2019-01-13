/**
 * Java class Problem4 checks if a number is a palindrome (e.g. 1221, 34143).
 *
 * @author Victor
 */

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int firstn = n;
        int reversedn = 0;

        while (firstn > 0) {
            reversedn += firstn % 10;
            firstn /= 10;
            reversedn *= 10;
        }
        reversedn /= 10;
        if (n == reversedn)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
