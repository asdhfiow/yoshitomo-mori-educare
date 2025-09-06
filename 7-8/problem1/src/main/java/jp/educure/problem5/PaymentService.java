package jp.educure.problem5;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void cashProcessDisplay() {
        System.out.println("支払い処理を実行中...");
        try {
            Thread.sleep(500); // 実行時間を疑似的に500msにする
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("支払い完了");
    }
}
