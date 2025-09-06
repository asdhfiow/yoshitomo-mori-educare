// package jp.educure.problem5;

// import org.aspectj.lang.ProceedingJoinPoint;
// import org.aspectj.lang.annotation.Aspect;
// import org.aspectj.lang.annotation.Before;
// import org.springframework.stereotype.Component;

// @Aspect
// @Component
// public class AuthenticationAspect {

//     @Before ("execution(* jp.educure.problem5.PaymentService.cashProcessDisplay()")
//     public void beforeCertification (ProceedingJoinPoint joinPoint) throws Throwable {
//         String methodSignature = joinPoint.getSignature().toString();

//         long startTime = System.currentTimeMillis();
//         System.out.println(startTime + "[認証チェック]" + methodSignature + "を実行する前に認証を確認中...");
//     }
// }


package jp.educure.problem5;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1) // 1番目に実行
public class AuthenticationAspect {

    @Before("execution(* jp.educure.problem5.PaymentService.cashProcessDisplay(..))")
    public void beforeCertification(JoinPoint joinPoint) {
        System.out.println("[認証チェック] " + joinPoint.getSignature().getName() + " を実行する前に認証を確認中...");
    }
}
