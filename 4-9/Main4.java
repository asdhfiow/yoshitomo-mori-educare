public class Main4 {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // 学生を追加
        try {
            manager.addStudent("アリス");
            manager.addStudent("ボブ");
            manager.addStudent("チャーリー");
            manager.addStudent(null);       
            manager.addStudent("イヴ");
            manager.addStudent("unko"); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー: " + e.getMessage());
        }

        // 学生ID 2 の出力
        try {
            System.out.println("学生ID 2: " + manager.getStudent(2));
        } catch (Exception e) {
            System.out.println("エラー: " + e.getMessage());
        }

        // 学生ID 3 のnullチェック
        try {
            System.out.println("学生ID 3: " + manager.getStudent(3));
        } catch (Exception e) {
            System.out.println("エラー: " + e.getMessage());
            System.out.println("学生ID 3: null");
        }

        // 学生ID 10 のアクセス
        try {
            System.out.println("学生ID 10: " + manager.getStudent(10));
        } catch (Exception e) {
            System.out.println("エラー: " + e.getMessage());
            System.out.println("学生ID 10: null");
        }

        // 値の更新
        try {
            manager.updateStudent(1, "ボビー");
            System.out.println("更新後の学生ID 1: " + manager.getStudent(1));
        } catch (Exception e) {
            System.out.println("エラー: " + e.getMessage());
        }

        // 再度、無効なIDへのアクセス
        try {
            System.out.println(manager.getStudent(10));
        } catch (Exception e) {
            System.out.println("エラー: " + e.getMessage());
        }
    }
}
