package jp.educure.message;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
public class MessageController {

    @GetMapping("/form")
    public String showForm() {
        return "form"; // resources/templates/form.html を探しに行く
    }

    @PostMapping("/message")
    @ResponseBody
    public String postMessage(
            @RequestParam(value = "message", required = false) String message,
            @RequestParam(value = "color", required = false) String color) {

        // message が空の場合
        if (message == null || message.trim().isEmpty()) {
            message = "No message provided";
        }

        // color が空の場合
        if (color == null || color.trim().isEmpty()) {
            color = "black";
        }

        String now = LocalDateTime.now().toString();

        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>Message Board</title>
        </head>
        <body>
            <h1>Message Board</h1>
            <div style="color: %s; font-size: 20px; padding: 10px; border: 1px solid black;">
                %s
            </div>
            <p>Posted at: %s</p>
        </body>
        </html>
        """.formatted(color, message, now);
    }
}
