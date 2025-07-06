// ここにコードを書いてください
// 必要なインポート文を記載
import java.util.List;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        // 学生の名簿を管理するArrayListを作成
        List<String> names = new ArrayList<>();

        // 学生を追加
        names.add("田中");
        names.add("佐藤");
        names.add("鈴木");

        // 学生リストを表示
        System.out.println("学生リスト：" + names);

        // 2番目の学生を取得（インデックスは0から始まるので1を指定）
        System.out.println("二番目の学生：" + names.get(1));

        // 学生数を取得
        System.out.println("学生数：" + names.size());

        // 特定の学生が含まれているか確認
        String searchElement = "鈴木";
        boolean contains鈴木 = names.contains(searchElement);

        if(contains鈴木){
            System.out.println("鈴木さんは含まれていますか？：" + true);

        }else {
        System.out.println("鈴木さんは含まれていますか？：" + false);
        }
    }
}
