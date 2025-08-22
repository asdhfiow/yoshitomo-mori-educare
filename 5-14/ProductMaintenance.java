import java.sql.*;

public class ProductMaintenance {

    public static void main(String[] args) {
        // データベース接続情報
        String url = "jdbc:postgresql://localhost:5432/educure_db"; 
        String username = "yoshitomo";
        String password = "Yoshitomo12"; 

        String updateSQL1 = "UPDATE products SET price = 0 WHERE stock = 0"; 
        String deleteSQL = "DELETE FROM products WHERE price >= 200000";
        String updateSQL2 = "UPDATE products SET stock = 20 WHERE price >= 100000 AND stock <= 10";
        String selectSQL = "SELECT * FROM products ORDER BY product_id ASC";
        
        // JDBCドライバのロード
        try {
            Class.forName("org.postgresql.Driver"); 
        } catch (ClassNotFoundException e) {
            System.out.println("ドライバのロードに失敗しました。");
            return;
        }

        try (
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement updateSQL1Pstmt = con.prepareStatement(updateSQL1);
            PreparedStatement deleteSQLPstmt = con.prepareStatement(deleteSQL);
            PreparedStatement updateSQL2Pstmt = con.prepareStatement(updateSQL2);
            PreparedStatement selectSQLPstmt = con.prepareStatement(selectSQL)
        ) {
            // 1. 在庫数0の商品価格を0に
            int r1 = updateSQL1Pstmt.executeUpdate();

            // 2. 価格200000以上の商品削除
            int d = deleteSQLPstmt.executeUpdate();

            // 3. 価格100000以上、在庫数10以下 → 在庫数20に更新
            int r2 = updateSQL2Pstmt.executeUpdate();

            // 影響を受けた行数を表示
            System.out.println(
                "影響を受けた行数 (在庫数0の商品価格を0に設定): " + r1 +
                " 影響を受けた行数 (価格が200000以上の商品削除): " + d +
                " 影響を受けた行数 (価格100000以上、在庫数10以下の商品を在庫数20に更新): " + r2
            );

            // 4. 更新後の結果を表示
            try (ResultSet rs = selectSQLPstmt.executeQuery()) {
                System.out.println("| product_id | product_name  | price  | stock |");
                System.out.println("|------------|---------------|--------|-------|");
                int rowCount = 0;
                while (rs.next()) {
                    int id = rs.getInt("product_id");
                    String name = rs.getString("product_name");
                    int price = rs.getInt("price");
                    int stock = rs.getInt("stock");
                    System.out.printf("| %-10d | %-10s | %-6d | %-5d |\n", id, name, price, stock);
                    rowCount++;
                }
                System.out.println("(" + rowCount + " 行)");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
