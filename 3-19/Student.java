import java.util.Objects;
public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //equalsメソッドをオーバーライド
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;  // 同じ参照なら true
        } 
        if (obj == null || getClass() != obj.getClass()) {
            return false;// 型チェック
        }
        Student student = (Student) obj;  // Student型にキャスト
        return this.id == student.id;     // idが同じなら同一
    }
      // hashCode()メソッドをオーバーライド（equals()をオーバーライドした場合、必ずオーバーライドするべき）
      @Override
      public int hashCode() {
          return Objects.hash(id);
      }
  
      // 学籍番号と氏名を表示するメソッド   
      @Override
      public String toString() {
          return "ID: " + id + ", 名前: " + name;
      }
}
