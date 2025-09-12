package jp.educure.problem3;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventPeriodController {

    @GetMapping("/event/input")
    public String showInputForm(EventPeriodForm form) {
        return "event-input";
    }

    @PostMapping("/event/confirm")
    public String confirm(@Valid EventPeriodForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "event-input";
        }
        model.addAttribute("startDate", form.getStartDate());
        model.addAttribute("endDate", form.getEndDate());
        return "event-confirm";
    }
}
