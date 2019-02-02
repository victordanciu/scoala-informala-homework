/**
 * Junit Tests.
 *
 * @author Victor
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhatTimeTest {

    private WhatTime date = new WhatTime();

    @Test
    void getvalidateTimeTrue() {
        //test the case when inserted hh and mm may form a correct time format
        Assertions.assertTrue(date.validateTime(14, 20));
    }

    @Test
    void getvalidateTimeFalse() {
        //test the case when inserted hh and mm may not form a correct time format because of hh and mm
        Assertions.assertFalse(date.validateTime(25, 60));
    }

    @Test
    void getvalidateTimeFalseHh() {
        //test the case when inserted hh and mm may not form a correct time format because of hh
        Assertions.assertFalse(date.validateTime(24, 18));
    }

    @Test
    void getvalidateTimeFalseMm() {
        //test the case when inserted hh and mm may not form a correct time format because of mm
        Assertions.assertFalse(date.validateTime(17, 60));
    }
}