import java.io.*;
import java.net.*;

public class Main2 {
    public static void main(String[] args) {
        try {
            // 検索キーワードをCQL形式で設定
            String query = "title = Java"; // CQLフォーマット
            String encodedQuery = URLEncoder.encode(query, "UTF-8");

            // 国立国会図書館APIのエンドポイント
            String endpoint = "https://ndlsearch.ndl.go.jp/api/sru";

            // APIリクエストのURLを構築
            String requestUrl = endpoint + "?operation=searchRetrieve"
                + "&version=1.2"
                + "&query=" + encodedQuery
                + "&maximumRecords=10"
                + "&recordSchema=dc";

            // URLオブジェクトを生成
            URI uri = new URI(requestUrl);
            URL url = uri.toURL();

            // HTTP接続を確立
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET"); // GETメソッドを指定

            // 接続とレスポンスの読み込み
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), "UTF-8"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
