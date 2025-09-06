package jp.educure.problem4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogExecutionAspect {

    @Around("@annotation(jp.educure.problem4.LogExecution)")
    public Object logExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodSignature = joinPoint.getSignature().toString();

        System.out.println("[LOG] 開始: " + methodSignature);
        Object result;

        try {
            result = joinPoint.proceed();  // メソッド実行
        } finally {
            System.out.println("[LOG] 終了: " + methodSignature);
        }

        return result;
    }
}
