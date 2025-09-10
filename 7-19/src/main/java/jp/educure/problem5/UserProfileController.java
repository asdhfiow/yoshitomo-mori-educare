package jp.educure.problem5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserProfileController {

    // ダミーユーザー
    private UserProfileForm dummyUser = new UserProfileForm("山田太郎", 25, "よろしくお願いします！");

    // プロフィール表示
    @GetMapping("/profile/{id}")
    public String viewProfile(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", dummyUser);
        model.addAttribute("id", id);
        return "profile-view";
    }

    // 編集画面表示
    @GetMapping("/profile/{id}/edit")
    public String editProfile(@PathVariable("id") int id, Model model) {
        model.addAttribute("form", dummyUser);
        model.addAttribute("id", id);
        return "profile-edit";
    }

    // 編集後の確認画面
    @PostMapping("/profile/{id}/confirm")
    public String confirmProfile(@PathVariable("id") int id,
                                 @ModelAttribute("form") UserProfileForm form,
                                 Model model) {
        model.addAttribute("form", form);
        model.addAttribute("id", id);
        return "profile-confirm";
    }

    // 確定処理
    @PostMapping("/profile/{id}/save")
    public String saveProfile(@PathVariable("id") int id,
                              @ModelAttribute("form") UserProfileForm form,
                              Model model) {
        // 保存処理
        dummyUser.setName(form.getName());
        dummyUser.setAge(form.getAge());
        dummyUser.setBio(form.getBio());

        model.addAttribute("user", dummyUser);
        model.addAttribute("id", id);
        return "profile-view";
    }
}
