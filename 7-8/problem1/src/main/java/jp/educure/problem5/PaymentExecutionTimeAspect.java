// package jp.educure.problem5;

// import org.aspectj.lang.annotation.Aspect;
// import org.springframework.stereotype.Component;

// @Aspect
// @Component
// public class PaymentExecutionTimeAspect {
//     private PaymentService paymentService;

//     // public PaymentExecutionTimeAspect(PaymentService paymentService) {
//     //     this.paymentService = paymentService;
//     // }

//     paymentService.cashProcessDisplay();
// }


package jp.educure.problem5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2) // 2番目に実行
public class PaymentExecutionTimeAspect {

    @Around("execution(* jp.educure.problem5.PaymentService.cashProcessDisplay(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed(); // 実際のメソッドを実行
        long end = System.currentTimeMillis();
        System.out.println("[実行時間] " + joinPoint.getSignature().getName() + ": " + (end - start) + "ms");
        return result;
    }
}
