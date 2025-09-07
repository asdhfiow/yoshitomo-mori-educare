package jp.educure.problem4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    // 初期画面: フォームを表示
    @GetMapping("/")
    public String showForm() {
        return "greetingForm"; // greetingForm.htmlを表示
    }

    // フォーム送信後の処理（POST）
    @PostMapping("/greet")
    public String greet(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "greetingResult"; // greetingResult.htmlを表示
    }
}
