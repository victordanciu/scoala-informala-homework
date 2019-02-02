/**
 * Class Problem3:
 * -Method validateDate() verifies if an inserted integer hh represents a valid hour and an inserted integer mm represents
 * a valid minute part of an hour;
 * -If the inserted integers hh and mm represents a valid time, the time is displayed in a detailed sentence; otherwhise,
 * the warn message of incorrect time is displayed.
 */

import java.util.Scanner;

public class WhatTime {

    public static void main(String[] args) {
        System.out.println("What time is it?");
        Scanner keyboard = new Scanner(System.in);
        int hh = keyboard.nextInt();
        int mm = keyboard.nextInt();
        if (validateTime(hh, mm)) {
            if (hh < 10 && mm > 9)
                System.out.println("The time is: 0" + hh + ":" + mm + " now.");
            if (hh < 10 && mm <= 9)
                System.out.println("The time is: 0" + hh + ":0" + mm + " now.");
            if (hh >= 10 && mm <= 9)
                System.out.println("The time is: " + hh + ":0" + mm + " now.");
            if (hh > 9 && mm > 9)
                System.out.println("The time is: " + hh + ":" + mm + " now.");
        } else
            System.out.println("Incorrect time!");
    }

    public static boolean validateTime(int hh, int mm) {
        //this method validates if the inserted hh and mm may format a valid number
        boolean valid = false;
        if ((hh >= 0) && (hh < 24) && (mm >= 0) && (mm <= 59))
            valid = true;
        return valid;
    }
}