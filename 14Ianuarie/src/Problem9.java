/**
 * Java class Problem9: Input 2 values:  start  and  finish, then display the numbers from start to finish.
 *
 * @author Victor
 */

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int start = keyboard.nextInt();
        int finish = keyboard.nextInt();
        if (start < finish)
            for (int i = start; i <= finish; i++)
                System.out.println(i);
        if (start > finish)
            for (int i = start; i >= finish; i--)
                System.out.println(i);
    }
}