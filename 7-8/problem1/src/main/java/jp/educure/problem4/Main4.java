package jp.educure.problem4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main4 implements CommandLineRunner {

    private final OrderService orderService;

    public Main4(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main4.class, args);
    }

    @Override
    public void run(String... args) {
        orderService.processOrder();
    }
}
