/**
 * Java class Problem8: Input 3 numbers, and display the biggest.
 *
 * @author Victor
 */

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();

        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        System.out.println(max);
    }
}