package pro.sky.calculator.services;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.myexceptions.DividerIsNullException;
import pro.sky.calculator.myexceptions.InvalidValueException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {
    private CalculatorServiceImpl out = new CalculatorServiceImpl();
    private Float num1;
    private Float num2;

    @Test
    public void shouldThrowInvalidValueExceptionWhenParamIsZeroWhilePlus() {
        num1 = 1.0F;
        num2 = null;
        assertThrows(InvalidValueException.class, () -> out.plus(num1, num2));
    }

    @Test
    public void shouldReturnCorrectResultWhilePlus() {
        num1 = 5.0F;
        num2 = 1.0F;
        double actual = num1 + num2;
        double expected = out.plus(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowInvalidValueExceptionWhenParamIsZeroWhileMinus() {
        num1 = 1.0F;
        num2 = null;
        assertThrows(InvalidValueException.class, () -> out.minus(num1, num2));
    }

    @Test
    public void shouldReturnCorrectResultWhileMinus() {
        num1 = 5.0F;
        num2 = 1.0F;
        double actual = num1 - num2;
        double expected = out.minus(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowInvalidValueExceptionWhenParamIsZeroWhileMultiply() {
        num1 = 1.0F;
        num2 = null;
        assertThrows(InvalidValueException.class, () -> out.multiply(num1, num2));
    }

    @Test
    public void shouldReturnCorrectResultWhileMultiply() {
        num1 = 5.0F;
        num2 = 1.0F;
        double actual = num1 * num2;
        double expected = out.multiply(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowInvalidValueExceptionWhenParamIsZeroWhileDivide() {
        num1 = null;
        num2 = 1.0F;
        assertThrows(InvalidValueException.class, () -> out.divide(num1, num2));
    }

    @Test
    public void shouldReturnCorrectResultWhileDivide() {
        num1 = 5.0F;
        num2 = 1.0F;
        double actual = num1 / num2;
        double expected = out.divide(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowDividerIsNullExceptionWhenDividerIsZero() {
        num1 = 1.0F;
        num2 = 0.0F;
        assertThrows(DividerIsNullException.class, () -> out.divide(num1, num2));
    }
}
