package jp.educure.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam(value = "num1", required = false) String num1Str,
            @RequestParam(value = "num2", required = false) String num2Str) {
        
        if (num1Str == null || num2Str == null) {
            return "エラー：パラメーターが不足しています";
        }

        if (!num1Str.matches("\\d+") || !num2Str.matches("\\d+")) {
            return "エラー：数値として認識できません";
        }

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        int result = num1 + num2;

        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>計算結果</title>
            <style>
                .result { color: blue; font-size: 24px; }
            </style>
        </head>
        <body>
            <div class="result">
                %d + %d = %d
            </div>
        </body>
        </html>
        """.formatted(num1, num2, result);
    }
}
