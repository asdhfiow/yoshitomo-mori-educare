package jp.educure.problem2;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, String> {

    // 電話番号の正規表現
    private static final String PHONE_REGEX = "^(\\d{2}-\\d{4}-\\d{4}|\\d{3}-\\d{4}-\\d{4})$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()) {
            return true; // @NotBlank で別途チェックされる
        }
        return value.matches(PHONE_REGEX);
    }
}
