/**
 * Class TemperatureConverter:
 * -method fahrenheitToCelsius converts Fahrenheit degrees to Celsius (double temp to double);
 * -for a given (by the user) body temperature, measured in Fahrenheit degrees, the TemperatureConverter class
 * outputs it in Celsius degrees, with the following message: "Your body temperature in Celsius degrees is X",
 * where X is respectively the Celsius degrees. In addition if the measured temperature in Celsius is higher
 * than 37 degrees, the program warns the user that they are ill, with the following message "You are ill!".
 *
 * @author Victor
 */

import java.util.Scanner;

public class TemperatureConverter {

    public static double fahrenheitToCelsius(double temp) {
        //this method converts variable double temp (expected fahrenheit) to celsius.
        return ((temp - 32) * 5) / 9;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double temp = keyboard.nextInt();
        System.out.println("Your body temperature in Celsius degrees is " + fahrenheitToCelsius(temp));
        if (fahrenheitToCelsius(temp) > 37)
            System.out.println("You are ill!");
    }
}
