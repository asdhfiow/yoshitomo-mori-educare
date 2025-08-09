import java.io.*;
import java.net.*;

public class Main1 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        // 検索キーワードを設定
        String keyword = "Java";
        
        // Googleの検索URLに検索キーワードを付けてURLを作成
        String searchURL = "https://www.google.com/search?q=" + URLEncoder.encode(keyword, "UTF-8");
        
        // URI → URL に変換
        URI uri = new URI(searchURL);
        URL url = uri.toURL();
        
        // openStream() で接続し、HTMLを読み込み
        try (InputStream inputStream = url.openStream();
             Reader reader = new InputStreamReader(inputStream, "UTF-8")) {
            
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        }
    }
}
