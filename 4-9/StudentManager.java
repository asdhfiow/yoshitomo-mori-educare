public class StudentManager {
    private String[] students = new String[5];
    private int count = 0;

    // 学生を追加するメソッド
    public void addStudent(String name) {
        if (count >= students.length) {
            System.out.println("エラー: これ以上学生を追加できません。リストがいっぱいです。");
            return;
        }
        students[count] = name;
        count++;
    }

    // 指定IDの学生名を取得するメソッド
    public String getStudent(int id) {
        if (id < 0 || id >= count) {
            System.out.println("エラー: 無効な学生IDです: " + id);
            return null;
        }

        if (students[id] == null) {
            System.out.println("エラー: 学生ID " + id + " にデータがありません。");
            return null;
        }

        return students[id];
    }

    // 指定IDの学生名を更新するメソッド
    public void updateStudent(int id, String name) {
        if (id < 0 || id >= count) {
            System.out.println("エラー: 無効な学生IDです: " + id);
            return;
        }

        students[id] = name;
        System.out.println("学生ID " + id + " を " + name + " に更新しました。");
    }
}
