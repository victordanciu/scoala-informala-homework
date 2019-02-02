/**
 * Class Max:
 * -Method getMax() with two integer (int) parameters, returns maximal of the two numbers;
 * -Three numbers are read from the console and the biggest of them will be printed;
 * -Method getMax() is used for comparing only the first 2 numbers; and the result of this first 2 numbers, with the
 * third one.
 *
 * @author Victor
 */


import java.util.Scanner;

public class Max {

    public static int getMax(int a, int b) {
        //this method returns the maximum of 2 int variables.
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();

        System.out.println("The maximum is: " + getMax(getMax(a, b), c));
    }
}


