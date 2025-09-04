package jp.educure.problem4.paymentprocessor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/process")
    public String processOrder(@RequestParam double amount) {
        orderService.processOrder(amount);
        return "注文処理が完了しました";
    }
}
