package jp.educure.problem2;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhoneNumberController {

    @GetMapping("/phone/input")
    public String showForm(PhoneNumberForm form) {
        return "phone-input"; 
    }

    @PostMapping("/phone/confirm")
    public String confirm(@Valid PhoneNumberForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "phone-input"; 
        }
        model.addAttribute("phoneNumber", form.getPhoneNumber());
        return "phone-confirm";  
    }
}
