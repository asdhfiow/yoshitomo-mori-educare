package jp.educure.problem5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3) // 3番目に実行
public class LoggingAspect {

    @After("execution(* jp.educure.problem5.PaymentService.cashProcessDisplay(..))")
    public void afterExecution(JoinPoint joinPoint) {
        System.out.println("[ログ出力]" +joinPoint.getSignature().getName() + "メソッドの実行が完了しました。");
    }
}
