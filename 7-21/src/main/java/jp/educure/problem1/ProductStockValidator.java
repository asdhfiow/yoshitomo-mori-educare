package jp.educure.problem1;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ProductStockValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return ProductStockForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ProductStockForm form = (ProductStockForm) target;

        if (form.getStock() == null) {
            errors.rejectValue("stock", "stock.required", "在庫数は必須入力です");
            return;
        }

        if (form.getStock() < 1 || form.getStock() > 999) {
            errors.rejectValue("stock", "stock.range", "在庫数は1~999の範囲で入力してください");
        }
    }
}
