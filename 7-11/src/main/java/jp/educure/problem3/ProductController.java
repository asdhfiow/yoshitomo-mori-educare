package jp.educure.problem3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Arrays;

@Controller
public class ProductController {

    // ハードコードの商品データ
    private List<Product> products = Arrays.asList(
            new Product(1, "ペン", 1000, "書きやすいペン"),
            new Product(2, "ノート", 500, "A4サイズのノート"),
            new Product(3, "消しゴム", 300, "よく消える消しゴム")
    );

    // 商品一覧ページ
    @GetMapping("/product")
    public String list(Model model) {
        model.addAttribute("products", products);
        return "productList";
    }

    // 商品詳細ページ
    @GetMapping("/product/{id}")
    public String detail(@PathVariable("id") int id, Model model) {
        for (Product p : products) {
            if (p.getId() == id) {
                model.addAttribute("product", p);
                return "productDetail";
            }
        }
        return "error"; // 商品が見つからなかった場合
    }
}
