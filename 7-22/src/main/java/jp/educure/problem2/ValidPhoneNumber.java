package jp.educure.problem2;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneNumberValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPhoneNumber {
    String message() default "正しい電話番号形式で入力してください（xx-xxxx-xxxx または xxx-xxxx-xxxx）";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
