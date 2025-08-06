import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main2 {
    public static void main(String[] args) {
        // プロパティファイルのパス
        String filePath = "excersise.properties";

        // Properties オブジェクトを作成
        Properties properties = new Properties();

        try (FileInputStream input = new FileInputStream(filePath)) {
            // プロパティファイルを読み込む
            properties.load(input);

            // username と password を取得
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            // 出力
            System.out.println("username=" + username);
            System.out.println("password=" + password);

        } catch (IOException e) {
            System.out.println("プロパティファイルの読み込みに失敗しました");
            e.printStackTrace();
        }
    }
}
