package jp.educure.problem1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main1 implements CommandLineRunner {

    private final UserService userService;

    public Main1(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main1.class, args);
    }

    @Override
    public void run(String... args) {
        try {
            System.out.println(userService.getUserDetails());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
