package jp.educure.problem3;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;

public class EventPeriodValidator implements ConstraintValidator<ValidEventPeriod, EventPeriodForm> {

    @Override
    public boolean isValid(EventPeriodForm form, ConstraintValidatorContext context) {
        if (form.getStartDate() == null || form.getEndDate() == null) {
            return true; // @NotNull で別にチェックされる
        }

        LocalDate today = LocalDate.now();

        // 開始日が今日以降でない場合
        if (form.getStartDate().isBefore(today)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("開始日は本日以降の日付を入力してください")
                    .addPropertyNode("startDate")
                    .addConstraintViolation();
            return false;
        }

        // 終了日が開始日より前または同じ場合
        if (!form.getEndDate().isAfter(form.getStartDate())) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("終了日は開始日より後の日付を入力してください")
                    .addPropertyNode("endDate")
                    .addConstraintViolation();
            return false;
        }

        return true;
    }
}
