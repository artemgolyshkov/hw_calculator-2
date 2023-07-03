package pro.sky.calculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.services.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greet() {
        return calculatorService.greet();
    }

    @GetMapping("/plus")
    public Float plus(Float num1, Float num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public Float minus(Float num1, Float num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public Float multiply(Float num1, Float num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public Float divide(Float num1, Float num2) {
        return calculatorService.divide(num1, num2);
    }


}
