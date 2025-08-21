import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchProduct {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db"; // データベースURL
        String user = "yoshitomo"; // データベースのユーザー名
        String password = "Yoshitomo12"; // データベースのパスワード
        
        String query = "SELECT product_name, price FROM products WHERE price >= ?";
        // ここにコードを書いてください


        try {
            // ドライバを使えるようにする
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("ドライバのロードに失敗しました。");
        }


        Connection con = null;


        try {
            con = DriverManager.getConnection(url,user,password);
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setInt(1, 100000);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                String product_name = rs.getString("product_name");
                int price = rs.getInt("price");

                System.out.println("商品名：" + product_name + "価格：" + price);
            }

            rs.close();
            pstmt.close();
        }catch(SQLException e){ 
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
   }
}