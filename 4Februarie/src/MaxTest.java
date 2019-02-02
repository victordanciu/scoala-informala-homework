/**
 * Junit Tests.
 *
 * @author Victor
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    private Max m = new Max();

    @Test
    void getMaxABiggest() {
        //tests the case when the first number is maximum.
        Assertions.assertEquals(12, m.getMax(m.getMax(12, 4), 5));
    }

    @Test
    void getMaxBBiggest() {
        //tests the case when the second number is maximum.
        Assertions.assertEquals(24, m.getMax(m.getMax(11, 24), 9));
    }

    @Test
    void getMaxEquals() {
        //tests the case when all the numbers are equal.
        Assertions.assertEquals(11, m.getMax(m.getMax(11, 11), 11));
    }

    @Test
    void getMaxNegativeNumbers() {
        //tests the case when the numbers are negative.
        Assertions.assertEquals(-15, m.getMax(m.getMax(-100, -15), -20));
    }
}