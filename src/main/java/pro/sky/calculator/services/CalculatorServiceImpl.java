package pro.sky.calculator.services;

import org.springframework.stereotype.Service;
import pro.sky.calculator.myexceptions.DividerIsNullException;
import pro.sky.calculator.myexceptions.InvalidValueException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String greet() {
        return "Welcome to the calculator!";
    }

    @Override
    public Float plus(Float num1, Float num2) {
        if (num1 == null || num2 == null) {
            throw new InvalidValueException("Invalid number");
        } else {
            return num1 + num2;
        }
    }

    @Override
    public Float minus(Float num1, Float num2) {
        if (num1 == null || num2 == null) {
            throw new InvalidValueException("Invalid number");
        } else {
            return num1 - num2;
        }
    }

    @Override
    public Float multiply(Float num1, Float num2) {
        if (num1 == null || num2 == null) {
            throw new InvalidValueException("Invalid number");
        } else {
            return num1 * num2;
        }
    }

    @Override
    public Float divide(Float num1, Float num2) {
        if (num1 == null || num2 == null) {
            throw new InvalidValueException("Invalid number");
        } else if (num2 == 0) {
            throw new DividerIsNullException("Divider is zero");
        }
        return num1 / num2;
    }
}
