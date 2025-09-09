package jp.educure.problem1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicThymeleafExample {
    @GetMapping("/basic")
    public String showInfo() {
        return "basic";
    }
}
