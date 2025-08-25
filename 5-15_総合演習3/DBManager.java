import java.sql.*;

public class DBManager {
    private Connection connection;
    private String URL;
    private String USER;
    private String PASSWORD;

    // デフォルトコンストラクタ
    public DBManager(){
        this.URL = "jdbc:postgresql://localhost:5432/vocabulary_db";
        this.USER = "postgres";
        this.PASSWORD = "CYV94XpcfV";
    }

    // データベースの初期化
    public void initializeDatabase(){
        try {
            Class.forName("org.postgresql.Driver"); // ドライバのロード
            connection = DriverManager.getConnection(URL, USER, PASSWORD); // 接続
        } catch (ClassNotFoundException e){
            System.out.println("ドライバのロードに失敗しました。");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("データベースに接続失敗");
        }
    }

    // connectionのゲッター
    public Connection getConnection(){
        return this.connection;
    }

    // closeメソッド
    public void close() {
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            connection = null; // 再接続処理の際、前の接続が残っているか明確になるためにnullを代入
        } else {
            return;
        }
    }
}
