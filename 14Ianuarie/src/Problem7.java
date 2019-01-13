/**
 * Java class Problem7: Input the length of the side of a square, and display its area.
 * Produce an error message if the length is negative.
 *
 * @author Victor
 */

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int length = keyboard.nextInt();
        if (length < 0)
            System.out.println("Length shall not be negative!");
        else
            System.out.println(length * length);
    }
}