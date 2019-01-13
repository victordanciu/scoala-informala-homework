/**
 * Java class Problem2 displays the smallest number from a collection of numbers.
 *
 * @author Victor
 */

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] v = new int[100];

        for (int i = 0; i < n; i++) {
            v[i] = keyboard.nextInt();
        }
        int min = v[0];
        for (int i = 1; i < n; i++) {
            if (v[i] < min)
                min = v[i];
        }

        System.out.println("The smallest no. is: " + min);
    }
}
