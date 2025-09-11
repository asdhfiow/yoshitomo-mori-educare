package jp.educure.problem4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    // ”リスト”でダミーデータを作成
  private final List<Product> productList = new ArrayList<>() {{
    add(new Product(1, "ノートパソコン", 120000));
    add(new Product(2, "スマートフォン", 80000));
    add(new Product(3, "イヤホン", 12000));
}};


    // 商品一覧
    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("products", productList);
        return "product-list";
    }

    // 商品詳細
    @GetMapping("/products/{id}")
    public String productDetail(@PathVariable("id") int id, Model model) {
        Product product = productList.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
        model.addAttribute("product", product);
        return "product-detail";
    }
}
