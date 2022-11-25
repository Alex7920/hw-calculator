package com.example.hwcalculator.controller;

import com.example.hwcalculator.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculator")
public class CalculatorController {

private final CalculatorService calculatorService;

    @GetMapping()

    public String hello(){
        return "Привет! Ты в калькуляторе!";
    }

    @GetMapping("/plus")

    public String plus(@RequestParam(name = "num1") Integer a,
                       @RequestParam(name = "num2") Integer b) {
        int plus = calculatorService.plus(a, b);
        return a + "+" + b +"=" + plus;


    }
    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1") Integer a,
                        @RequestParam(name = "num2") Integer b) {
        int minus = calculatorService.minus(a, b);
        return a + "-" + b +"=" + minus;

    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "num1") Integer a,
                           @RequestParam(name = "num2") Integer b) {
        int multiply = calculatorService.multiply(a, b);
        return a + "*" + b +"=" + multiply;
    }
    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1") Integer a,
                         @RequestParam(name = "num2") Integer b) {
        double divide = calculatorService.divide(a, b);
        return a + "/" + b +"=" + divide;

    }
}
