package jp.educure.problem3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class ConditionalExample {
    @GetMapping("/conditional")
    public String showInfo(Model model){
        model.addAttribute("isLoggedIn", true);
        return "conditional";
    }
}