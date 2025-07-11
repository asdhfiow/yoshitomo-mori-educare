public class Main4 {
    public static void main(String[] args) {
        String[] student = new String[5];
        student[0] = "アリス";
        student[1] = "ボブ";
        student[2] = "チャーリー";
        student[3] = null;  // 明示的にnullを設定
        student[4] = "イヴ";

        // try-catch: 範囲外への追加
        try {
            student[5] = "追加できない";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー: これ以上学生を追加できません。リストがいっぱいです。");
        }

        // 学生ID 2 の出力
        System.out.println("学生ID 2: " + student[2]);

        // 学生ID 3: null チェックあり
        if (student[3] == null) {
            System.out.println("エラー: 学生ID 3 にデータがありません。");
        }
        System.out.println("学生ID 3: " + student[3]);

        // 学生ID 10 へのアクセス（例外処理）
        try {
            System.out.println("学生ID 10: " + student[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー: 無効な学生IDです: 10");
            System.out.println("学生ID 10: null");
        }

        // 値の更新
        student[1] = "ボビー";
        System.out.println("更新後の学生ID 1: " + student[1]);

        // 再度、無効なIDにアクセスして例外出力
        try {
            System.out.println(student[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー: 無効な学生IDです: 10");
        }
    }
}
