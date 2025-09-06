package jp.educure.problem4;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @LogExecution
    public void processOrder() {
        System.out.println("注文処理中...");
        try {
            Thread.sleep(500); // 処理時間をシミュレート
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("注文処理完了");
    }
}
