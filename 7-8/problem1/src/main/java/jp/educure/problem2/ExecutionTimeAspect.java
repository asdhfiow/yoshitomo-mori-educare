package jp.educure.problem2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    @Around("execution(* jp.educure.problem2.CalculatorService.*(..))")
    public Object measureTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed(); // メソッド実行
        long end = System.currentTimeMillis();

        // フルシグネチャ
        System.out.println("execution(" + joinPoint.getSignature() + ") executed in " + (end - start) + "ms");

        return result;
    }
}
