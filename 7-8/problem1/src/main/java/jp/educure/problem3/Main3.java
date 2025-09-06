package jp.educure.problem3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main3 implements CommandLineRunner {

    private final UsermanagementService usermanagementService;

    public Main3(UsermanagementService usermanagementService) {
        this.usermanagementService = usermanagementService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main3.class, args);
    }

    @Override
    public void run(String... args) {
        // 正常なユーザー
        User user1 = new User("John Doe", "john.doe@example.com");
        usermanagementService.createUser(user1);

        // エラーになるユーザー
        User user2 = new User("Error User", "error@example.com");
        usermanagementService.createUser(user2);
    }
}
