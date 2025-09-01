package jp.educure.message;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
public class MessageController {

    @GetMapping("/form") // サーバーに対してget（コードの中の処理を画面にただ表示するだけ）するメソッドを送って、サーバーにHTMLを生成してもって、画面に表示する。
    public String showForm() {
        return """
        <!DOCTYPE html>
        <html>
        <head><title>Message Form</title></head>
        <body>
            <form action="/message" method="post">
                Message: <input type="text" name="message"><br>
                Color: <input type="text" name="color"><br>
                <input type="submit" value="Send">
            </form>
        </body>
        </html>
        """;
    }

    @PostMapping("/message") // ブラウザで入力したテキストの値をサーバーに送って、受け取ったデータを元にHTMLを生成してもらって画面に表示する
    public String postMessage(@RequestParam(value="message", defaultValue="No Message Provided") String message,
                              @RequestParam(value="color", defaultValue="black") String color) {
        String now = LocalDateTime.now().toString();
        return """
        <!DOCTYPE html>
        <html>
        <head><title>Message Board</title></head>
        <body>
            <h1>Message Board</h1>
            <div style="color:%s; font-size:20px; padding:10px; border:1px solid black;">%s</div>
            <p>Posted at: %s</p>
        </body>
        </html>
        """.formatted(color, message, now);
    }
}
