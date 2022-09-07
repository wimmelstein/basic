package nl.inholland.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void calculateWithWrongNumbersWillFail() {
        Assertions.assertEquals(6, App.calculate(2, 3));
    }


    @Test
    void calculateWithRightNumbersWillPass() {
        Assertions.assertEquals(6, App.calculate(2, 4));
    }
}