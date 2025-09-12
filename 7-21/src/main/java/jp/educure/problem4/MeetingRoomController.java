package jp.educure.problem4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/meeting-room")
public class MeetingRoomController {

    @Autowired
    private MeetingRoomValidator validator;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(validator);
    }

    @GetMapping
    public String showForm(MeetingRoomForm form) {
        return "meeting-room";
    }

    @PostMapping("/confirm")
    public String confirm(@Valid MeetingRoomForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "meeting-room";
        }
        model.addAttribute("form", form);
        return "meeting-confirm";
    }

    @PostMapping("/complete")
    public String complete() {
        return "complete"; 
    }
}
