package jp.educure.problem1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Controller
public class ProductStockController {

    private final ProductStockValidator productStockValidator;

    public ProductStockController(ProductStockValidator productStockValidator) {
        this.productStockValidator = productStockValidator;
    }

    // Validator を有効化
    @InitBinder("productStockForm")
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(productStockValidator);
    }

    // 入力画面
    @GetMapping("/stock/input")
    public String showInputForm(Model model) {
        model.addAttribute("productStockForm", new ProductStockForm());
        return "input";
    }

    // 確認画面
    @PostMapping("/stock/confirm")
    public String confirm(@Valid @ModelAttribute ProductStockForm productStockForm,
                          BindingResult bindingResult,
                          Model model) {
        if (bindingResult.hasErrors()) {
            return "input";
        }
        model.addAttribute("stock", productStockForm.getStock());
        return "confirm";
    }
}
