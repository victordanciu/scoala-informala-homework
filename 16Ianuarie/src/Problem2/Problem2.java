/**
 * Class Problem2:
 * -method getCelsius converts Fahrenheit degrees to Celsius (float temp to float tempCels);
 * -for a given (by the user) body temperature, measured in Fahrenheit degrees, the Problem2 class
 * outputs it in Celsius degrees, with the following message: "Your body temperature in Celsius degrees is X",
 * where X is respectively the Celsius degrees. In addition if the measured temperature in Celsius is higher
 * than 37 degrees, the program warns the user that they are ill, with the following message "You are ill!".
 */

package Problem2;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float temp = keyboard.nextInt();
        System.out.println("Your body temperature in Celsius degrees is " + getCelsius(temp));
        if (getCelsius(temp) > 37)
            System.out.println("You are ill!");
    }

    public static float getCelsius(float temp) {
        float tempCels = ((temp - 32) * 5) / 9;
        return tempCels;
    }
}
