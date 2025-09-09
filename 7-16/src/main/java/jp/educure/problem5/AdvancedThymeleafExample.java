package jp.educure.problem5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdvancedThymeleafExample {
    @GetMapping("/advanced")
    public String showInfo(Model model){

        Map<String, String> user = Map.of(
            "name", "Bob",
            "role", "Admin",
            "status", "ACTIVE"
        );
        
        model.addAttribute("user", user);

        List<Product> products = new ArrayList();
        products.add(new Product("Laptop", 1200.0));
        products.add(new Product("smartphone", 800.0));
        products.add(new Product("Tablet", 450.0));
        
        model.addAttribute("products", products);
        
        return "advanced";
    }
}
