package jp.educure.problem4;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoopExapmle {
    @GetMapping("/loop")
    public String showInfo(Model model){
        List <String> items = List.of("Item1", "Item2", "Item3");
        model.addAttribute("items", items);
        return "loop";
    }
}