package jp.educure.problem1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

    // フォーム表示
    @GetMapping("/message")
    public String showForm() {
        return "message-form";
    }

    // フォーム送信後の処理
    @PostMapping("/message/result")
    public String showResult(@RequestParam("name") String name,
                             @RequestParam("message") String message,
                             Model model) {
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        return "message-result";
    }
}
