package jp.educure.problem2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    // フォーム表示
    @GetMapping("/calculator")
    public String showCalculator() {
        return "calculator";
    }

    // 計算処理
    @PostMapping("/calculator/result")
    public String calculate(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2,
                            @RequestParam("operator") String operator,
                            Model model) {
        String message;
        try {
            int result;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    message = num1 + " + " + num2 + " = " + result;
                    break;
                case "-":
                    result = num1 - num2;
                    message = num1 + " - " + num2 + " = " + result;
                    break;
                case "*":
                    result = num1 * num2;
                    message = num1 + " * " + num2 + " = " + result;
                    break;
                case "/":
                    if (num2 == 0) {
                        message = "エラー: 0で割ることはできません。";
                    } else {
                        result = num1 / num2;
                        message = num1 + " / " + num2 + " = " + result;
                    }
                    break;
                default:
                    message = "不明な演算子です。";
            }
        } catch (Exception e) {
            message = "エラー: 入力値を確認してください。";
        }

        model.addAttribute("message", message);
        return "result";
    }
}
