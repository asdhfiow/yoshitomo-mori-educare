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

        // パラメータ不足チェック
        if (num1Str == null || num2Str == null) {
            return buildErrorHtml("エラー：パラメータが不足しています");
        }

        int num1, num2;
        try {
            // ここで負数も正しく処理できる
            num1 = Integer.parseInt(num1Str);
            num2 = Integer.parseInt(num2Str);
        } catch (NumberFormatException e) {
            return buildErrorHtml("エラー：数値として認識できません");
        }

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

    // エラー時も完全な HTML を返す
    private String buildErrorHtml(String message) {
        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>計算エラー</title>
            <style>
                .error { color: red; font-size: 20px; }
            </style>
        </head>
        <body>
            <div class="error">
                %s
            </div>
        </body>
        </html>
        """.formatted(message);
    }
}
