package jp.educure.problem2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main2 implements CommandLineRunner {

    private final CalculatorService calculatorService;

    public Main2(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main2.class, args);
    }

    @Override
    public void run(String... args) {
        try {
            calculatorService.add(5, 3);
            calculatorService.subtract(10, 4);
            calculatorService.multiply(6, 7);
            calculatorService.divide(10, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
