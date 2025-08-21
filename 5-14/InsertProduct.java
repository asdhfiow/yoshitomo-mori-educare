import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertProduct {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db";
        String user = "yoshitomo";
        String password = "Yoshitomo123";

        // 追加する商品情報
        String productName = "スマートフォン";
        int price = 80000;
        int stock = 30;

        try (Connection con = DriverManager.getConnection(url, user, password)) {

            // 商品追加用SQL
            String insertSql = "INSERT INTO products (product_name, price, stock) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = con.prepareStatement(insertSql)) {
                pstmt.setString(1, productName);
                pstmt.setInt(2, price);
                pstmt.setInt(3, stock);

                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("商品が正常に追加されました。");
                }
            }

            // テーブル内容を表示
            String selectSql = "SELECT * FROM products ORDER BY product_id";
            try (PreparedStatement pstmt2 = con.prepareStatement(selectSql);
                 ResultSet rs = pstmt2.executeQuery()) {

                System.out.println("| product_id | product_name  | price  | stock |");
                System.out.println("|-----------|--------------|--------|-------|");

                while (rs.next()) {
                    int id = rs.getInt("product_id");
                    String name = rs.getString("product_name");
                    int p = rs.getInt("price");
                    int s = rs.getInt("stock");

                    System.out.printf("| %-9d | %-12s | %-6d | %-5d |\n", id, name, p, s);
                }
            }

        } catch (Exception e) {
            System.out.println("エラーが発生しました。");
            e.printStackTrace();
        }
    }
}
