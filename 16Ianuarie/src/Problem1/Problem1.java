/**
 * Class Problem1:
 * -Method getMax() with two integer (int) parameters, returns maximal of the two numbers;
 * -Three numbers are read from the console and the biggest of them will be printed;
 * -Method getMax() is used for comparing only the first 2 numbers; the result is afterwards
 * compared with the third number.
 */

package Problem1;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        if (c > getMax(a, b))
            System.out.println("The maximum is: " + c);
        else
            System.out.println("The maximum is: " + getMax(a, b));
    }

    public static int getMax(int a, int b) {
        int max;
        if (a > b)
            max = a;
        else
            max = b;
        return max;
    }
}
