/**
 * Class Problem3:
 * -Method validateDate() verifies if an inserted integer hh represents a valid hour and an inserted integer mm represents
 * a valid minute part of an hour;
 * -If the inserted integers hh and mm represents a valid time, the time is displayed in a detailed sentence; otherwhise,
 * the warn message of incorrect time is displayed.
 */

package Problem3;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        System.out.println("What time is it?");
        Scanner keyboard = new Scanner(System.in);
        int hh = keyboard.nextInt();
        int mm = keyboard.nextInt();
        if (validateDate(hh, mm) == 1)
            System.out.println("The time is " + hh + ":" + mm + " now.");
        else
            System.out.println("Incorrect time!");
    }

    public static int validateDate(int hh, int mm) {
        int valid = 0;
        if ((hh >= 0) && (hh <= 24) && (mm >= 0) && (mm <= 59))
            valid = 1;
        return valid;
    }
}