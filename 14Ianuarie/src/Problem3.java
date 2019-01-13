/**
 * Java class Problem3 displays the max digit from a number. Read the number from keyboard.
 *
 * @author Victor
 */

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int max = 0;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            n /= 10;
            if (max < digit)
                max = digit;
        }
        System.out.println("The highest digit is: " + max);
    }
}
