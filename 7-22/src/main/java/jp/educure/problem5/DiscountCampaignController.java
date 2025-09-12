package jp.educure.problem5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/discount")
public class DiscountCampaignController {

    @Autowired
    private DiscountCampaignValidator validator;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(validator);
    }

    @GetMapping("/input")
    public String showForm(Model model) {
        model.addAttribute("discountCampaignForm", new DiscountCampaignForm());
        return "discount-input";
    }

    @PostMapping("/confirm")
    public String confirm(@Valid @ModelAttribute DiscountCampaignForm form,
                          BindingResult result,
                          Model model) {
        if (result.hasErrors()) {
            return "discount-input";
        }
        model.addAttribute("form", form);
        return "discount-confirm";
    }
}
