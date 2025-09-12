package jp.educure.problem3;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EventPeriodValidator.class)
public @interface ValidEventPeriod {
    String message() default "開始日・終了日の入力が不正です";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
