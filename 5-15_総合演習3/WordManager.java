import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class WordManager {
    public DBManager dbManager;

    // コンストラクタ
    public WordManager(DBManager dbManager){
        this.dbManager = dbManager;
    }
    
    // 単語をデータベースに追加する
    public void addWord(Word word) {
        dbManager.getConnection();
        try {
            // 単語を追加する準備（SQL書いてるだけ）
            PreparedStatement addPstmt = dbManager.getConnection().prepareStatement("INSERT INTO public.words (english, japanese) VALUES (?, ?);");
            addPstmt.setString(1, word.getEnglish());
            addPstmt.setString(2, word.getJapanese());
            // 実行
            addPstmt.executeUpdate();
            dbManager.getConnection();
            addPstmt.close();
            System.out.println("単語が追加されました！");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 全単語を取得
        public List<Word> getWords() {
            List<Word> wordList = new ArrayList<>();
        try {
            PreparedStatement selectPstmt = dbManager.getConnection().prepareStatement("SELECT english, japanese FROM words;");
            ResultSet rs = selectPstmt.executeQuery();
            while (rs.next()) {
                String english = rs.getString("english");
                String japanese = rs.getString("japanese");
                wordList.add(new Word(english, japanese));
            }
            rs.close();
            selectPstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return wordList;
    }

    // 単語数をカウントするゲッターメソッド
    public int getWordCount(){
        int count = 0;
        try {
            String wordCountSql = "SELECT COUNT(*) FROM words;";
            PreparedStatement pstmt = dbManager.getConnection().prepareStatement(wordCountSql);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);  // COUNT(*) の結果を取得
            }

            rs.close();
            pstmt.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return count;
    }

    // 単語を削除するメソッド（処理）
    public boolean deleteWord(String english){
        String deleteSQL ="DELETE FROM words WHERE english = ?;";
        try {
            // Deleteする準備(SQL文を書いただけ。実行はまだ。)
            PreparedStatement deletePstmt = dbManager.getConnection().prepareStatement(deleteSQL);
            deletePstmt.setString(1,english);
            // 実行
            int rows = deletePstmt.executeUpdate(); // もし単語があって、消せたらrowsに値が格納される（ゼロ　＝　単語がないと判断）
            deletePstmt.close(); // ← PreparedStatementだけ閉じる

            if (rows > 0) {
                return true; // 単語があった
            } else {
                return false; // 指定した単語が存在しなかった
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
// 単語を更新する（処理）
    public boolean updateWord(String english, String japanese){
        String updateSQL = "UPDATE words SET japanese = ? WHERE english = ?;";
        try {
            PreparedStatement updatePstmt = dbManager.getConnection().prepareStatement(updateSQL);
            updatePstmt.setString(1, japanese);
            updatePstmt.setString(2,english);
            // 実行し、更新された行数を取得する
            int rowsAffected = updatePstmt.executeUpdate();
            updatePstmt.close(); 
            
            // 1行以上更新されたらtrue、そうでなければfalseを返す
            return rowsAffected > 0;
            
        } catch (SQLException e){
            e.printStackTrace();
            // 例外が発生した場合はfalseを返す
            return false;
        }
    }
}
