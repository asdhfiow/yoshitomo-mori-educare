package jp.educure.problem5.inventoryservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final InventoryService inventoryService;
    

    public ProductController(InventoryService inventoryService, ProductRepository productRepository) {
        this.inventoryService = inventoryService;
        
    }

    @GetMapping("/check-availability/{productId}")
    public String checkProductAvailability(@PathVariable("productId") String productIdStr) {
        Integer productId = null;
        try {
            productId = Integer.parseInt(productIdStr);
        } catch (NumberFormatException e) {
            return "Invalid product ID: " + productIdStr;
        }

        boolean available = inventoryService.isProductAvailable(productId);
        return available
                ? "Product " + productId + " is available"
                : "Product " + productId + " is out of stock";
    }

    @GetMapping("/not-found")
    public String productNotFound() {
        return "Product not found";
    }
}
