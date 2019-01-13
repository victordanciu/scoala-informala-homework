/**
 * Java class Problem6: Input the dimensions of a rectangle and display area and perimeter.
 *
 * @author Victor
 */

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int length = keyboard.nextInt();
        int width = keyboard.nextInt();
        System.out.println("The area is " + length * width);
        System.out.println("The perimeter is " + 2 * (length + width));
    }
}