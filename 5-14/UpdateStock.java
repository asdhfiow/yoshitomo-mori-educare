import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateStock {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db"; 
        String user = "yoshitomo"; 
        String password = "Yoshitomo12"; 

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("ドライバのロードに失敗しました。");
            return;
        }

        Connection con = null;
        PreparedStatement checkPstmt = null;
        PreparedStatement updatePstmt = null;
        PreparedStatement selectPstmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(url, user, password);

            // 在庫確認
            checkPstmt = con.prepareStatement("SELECT COUNT * FROM products WHERE stock > 0");
            rs = checkPstmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count == 0) {
                    System.err.println("エラー: 在庫が全て0のため、更新できる商品がありません。");
                    return;
                }
            }


            // 更新後の表示
            selectPstmt = con.prepareStatement("SELECT * FROM products ORDER BY product_id");
            rs = selectPstmt.executeQuery();

            System.out.println("| product_id | product_name  | price  | stock |");
            System.out.println("|------------|---------------|--------|-------|");
            int rowCount = 0;
            while (rs.next()) {
                int productId = rs.getInt("product_id");
                String productName = rs.getString("product_name");
                int price = rs.getInt("price");
                int stock = rs.getInt("stock");

                System.out.printf("| %-10d | %-2s | %-6d | %-5d \n", productId, productName, price, stock);
                rowCount ++;
            }
                System.out.println("(" + rowCount + "行)");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (checkPstmt != null) checkPstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (updatePstmt != null) updatePstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (selectPstmt != null) selectPstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (con != null) con.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
}
