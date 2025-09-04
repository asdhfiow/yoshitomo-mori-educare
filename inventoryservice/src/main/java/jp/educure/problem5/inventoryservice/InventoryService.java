package jp.educure.problem5.inventoryservice;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    // 在庫確認メソッド
    public boolean isProductAvailable(Integer productId) {
        if (productId == null) {
            return false;
        }
        return productId % 2 == 0; // 偶数IDは在庫あり
    }
}
