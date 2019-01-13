/**
 * Java class Problem5 displays all the prime numbers lower than a given number.
 *
 * @author Victor
 */

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int prim, div;
        for (int i = 1; i < n; i++) {
            div = 1;
            prim = 1;
            while (i / 2 >= div && prim == 1) {
                div++;
                if (i % div == 0)
                    prim = 0;
            }
            if (prim == 1)
                System.out.println(i);
        }
    }
}
