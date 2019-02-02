/**
 * Junit Tests.
 *
 * @author Victor
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private TemperatureConverter t = new TemperatureConverter();

    @Test
    void fahrenheitToCelsiusNoDecimals() {
        //test the case when the input and output shall be integers
        Assertions.assertEquals(100, t.fahrenheitToCelsius(212));
    }

    @Test
    void fahrenheitToCelsiusTwoDecimals() {
        //test the case when the input (fahrenheit) does not have decimals, but the output (celsius) has
        //both the expected and calculated variables will be multiplied with 100 for approximation on 2 decimals.
        double aprox1 = t.fahrenheitToCelsius(200) * 100;
        int aprox2 = (int) aprox1;
        Assertions.assertEquals(9333, aprox2);
    }

}