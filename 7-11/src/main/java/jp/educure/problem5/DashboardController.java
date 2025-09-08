package jp.educure.problem5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        // ユーザー情報
        Customer customer = new Customer("ユーザー名:山田太郎", "taro.tanaka@example.com");

        // 商品リスト
        List<Item> items = Arrays.asList(
                new Item("ノートPC", 120000),
                new Item("スマートフォン", 80000),
                new Item("イヤホン", 5000)
        );

        // Modelに追加
        model.addAttribute("customer", customer);
        model.addAttribute("items", items);

        return "dashboard"; // dashboard.html を表示
    }
}
