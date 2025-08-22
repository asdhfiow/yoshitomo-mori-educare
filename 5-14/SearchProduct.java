import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchProduct {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db";
        String user = "yoshitomo";
        String password = "Yoshitomo12";
        
        String query = "SELECT product_name, price FROM products WHERE price >= ?";

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("ドライバのロードに失敗しました。");
        }

        
        try (
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = con.prepareStatement(query)
        ) {
            pstmt.setInt(1, 100000);

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()){
                    String product_name = rs.getString("product_name");
                    int price = rs.getInt("price");
                    
                    // 出力
                    System.out.print("商品名: " + product_name + ", 価格: " + price + " ");
                }
                // 最後に改行する
                System.out.println();
            }

        } catch (SQLException e) { 
            e.printStackTrace();
        }
   }
}
