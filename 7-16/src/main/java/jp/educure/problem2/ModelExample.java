package jp.educure.problem2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelExample {

    @GetMapping("/model")
    public String showInfo(Model model) {
        model.addAttribute("username", "Alice");
        return "model"; 
    }
}
