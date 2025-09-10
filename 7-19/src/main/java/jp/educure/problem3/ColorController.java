package jp.educure.problem3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColorController {

    // フォーム表示
    @GetMapping("/color")
    public String showForm() {
        return "color-select";
    }

    // フォーム送信後の処理
    @PostMapping("/color/result")
    public String showResult(@RequestParam("name") String name,
                             @RequestParam("color") String color,
                             Model model) {
        String message = name + "さんの好きな色は " + color + " です。";
        model.addAttribute("message", message);
        return "color-result";
    }
}
