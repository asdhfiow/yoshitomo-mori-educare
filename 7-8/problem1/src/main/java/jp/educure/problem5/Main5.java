package jp.educure.problem5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("jp.educure.problem5")
public class Main5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main5.class);
        PaymentService paymentService = context.getBean(PaymentService.class);

        paymentService.cashProcessDisplay();

        context.close();
    }
}
