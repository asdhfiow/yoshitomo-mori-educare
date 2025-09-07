package jp.educure.problem2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String displayUser(Model model) {
        // Modelにユーザー名を設定
        String userName = "John Doe";
        model.addAttribute("userName", userName);

        // user.html を返す
        return "user";
    }
}
