import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

    public static void main(String[] args) {
        // Integer型のArrayListを作成
        List<Integer> scores = new ArrayList<>();

        // 点数を追加
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(55);
        scores.add(43);

        // 点数リストを表示
        System.out.println("点数リスト：" + scores);

        // 平均点を計算
        int total = sum(scores);
        double average = (double) total / scores.size();
        System.out.println("平均点：" + average);

        // 最高点を取得
        int max = Collections.max(scores);
        System.out.println("最高点：" + max);

        // 不合格者数（60点以下）を計算
        int failCount = 0;
        for (int score : scores) {
            if (score <= 60) {
                failCount++;
            }
        }
        System.out.println("不合格者数：" + failCount);
    }

    // 合計点を求めるメソッド（mainの外！）
    public static int sum(List<Integer> scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;  
        }
        return sum;
    }
}

