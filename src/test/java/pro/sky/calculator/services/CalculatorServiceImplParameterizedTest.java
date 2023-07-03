package pro.sky.calculator.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorServiceImplParameterizedTest {
    private CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectResultWhilePlus(Float num1, Float num2) {
        Float result = out.plus(num1, num2);
        Float expected = num1 + num2;
        Assertions.assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectResultWhileMinus(Float num1, Float num2) {
        Float result = out.minus(num1, num2);
        Float expected = num1 - num2;
        Assertions.assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectResultWhileMultiply(Float num1, Float num2) {
        Float result = out.multiply(num1, num2);
        Float expected = num1 * num2;
        Assertions.assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectResultWhileDivide(Float num1, Float num2) {
        Float result = out.divide(num1, num2);
        Float expected = num1 / num2;
        Assertions.assertEquals(result, expected);
    }

    static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                arguments(3.0F, 22.9F),
                arguments(5.0F, 3231.12F)
        );
    }
}
