import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateProduct {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db";
        String user = "yoshitomo";
        String password = "Yoshitomo12";

        String updatePriceSQL = "UPDATE products SET price = price - 5000 WHERE product_name = 'タブレット'";
        String updateStockSQL = "UPDATE products SET stock = stock + 5 WHERE price < 50000";
        String selectSQL = "SELECT * FROM products ORDER BY product_id";

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("JDBCドライバが見つかりません", e);
        }

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement updatePricePstmt = con.prepareStatement(updatePriceSQL);
             PreparedStatement updateStockPstmt = con.prepareStatement(updateStockSQL);
             PreparedStatement selectPstmt = con.prepareStatement(selectSQL)) {

            // タブレットの価格更新
            int countPriceRows = updatePricePstmt.executeUpdate();

            // 在庫更新
            int countStockRows = updateStockPstmt.executeUpdate();

            // 更新後のテーブルを表示
            try (ResultSet rs = selectPstmt.executeQuery()) {
                System.out.println("価格を価格を値下げした行数:" + countPriceRows + " 在庫を増やした行数:" + countStockRows);
                System.out.println("| product_id | product_name  | price  | stock |");
                System.out.println("|------------|---------------|--------|-------|");

                int rowCount = 0;
                while (rs.next()) {
                    int productId = rs.getInt("product_id");
                    String productName = rs.getString("product_name");
                    int price = rs.getInt("price");
                    int stock = rs.getInt("stock");

                    System.out.printf("| %-10d | %-2s | %-3d | %-5d \n", productId, productName, price, stock);
                    rowCount++;
                }
                System.out.println("(" + rowCount + "行)");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
