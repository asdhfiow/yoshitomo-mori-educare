import com.google.gson.Gson;
import java.io.*;

public class Main4 {
    public static void main(String[] args) {
        try {
            // Gsonクラスを使う準備
            Gson gson = new Gson();

            // JSONファイルをFileReaderで読み込んで文字列にする
            FileReader reader = new FileReader("exercise.json");

            // JSON文字列をJavaのEmployeeクラスに変換
            Employee employee = gson.fromJson(reader, Employee.class);

            // 情報を出力
            System.out.println("Name : " + employee.getName());
            System.out.println("Age : " + employee.getAge());
            System.out.println("Salary : " + employee.getSalary());

        } catch (IOException e) {
            System.out.println("ファイル読み込みエラー: " + e.getMessage());
        }
    }
}
