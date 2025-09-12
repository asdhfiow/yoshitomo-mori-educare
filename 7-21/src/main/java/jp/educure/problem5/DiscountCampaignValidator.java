package jp.educure.problem5;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Component
public class DiscountCampaignValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return DiscountCampaignForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        DiscountCampaignForm form = (DiscountCampaignForm) target;

        if (form.getDiscountType() == null || form.getDiscountValue() == null) {
            return;
        }

        // 定額の場合
        if ("定額".equals(form.getDiscountType())) {
            if (form.getDiscountValue() % 100 != 0) {
                errors.rejectValue("discountValue", "discountValue.invalid", "定額割引は100円単位で入力してください");
            }
            if (form.getDiscountValue() > 10000) {
                errors.rejectValue("discountValue", "discountValue.max", "定額割引は最大10,000円までです");
            }
        }

        // 定率の場合
        if ("定率".equals(form.getDiscountType())) {
            if (form.getDiscountValue() < 1 || form.getDiscountValue() > 50) {
                errors.rejectValue("discountValue", "discountValue.range", "定率割引は1〜50%の範囲で入力してください");
            }
        }

        // 日付チェック
        LocalDate today = LocalDate.now();
        if (form.getStartDate() != null && form.getStartDate().isBefore(today)) {
            errors.rejectValue("startDate", "startDate.invalid", "開始日は本日以降を指定してください");
        }

        if (form.getStartDate() != null && form.getEndDate() != null) {
            if (form.getEndDate().isBefore(form.getStartDate())) {
                errors.rejectValue("endDate", "endDate.invalid", "終了日は開始日より後の日付を指定してください");
            }

            long months = ChronoUnit.MONTHS.between(form.getStartDate(), form.getEndDate());
            if (months >= 1) {
                errors.rejectValue("endDate", "endDate.period", "キャンペーン期間は最大1か月までです");
            }
        }
    }
}
