import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;


public class Main3 {
    public static void main(String[] args){
        try {
            // XMLファイルオブジェクトの作成
            File xmlFile = new File("excersise.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            // 各要素を取得
            String title = doc.getElementsByTagName("title").item(0).getTextContent();
            String author = doc.getElementsByTagName("author").item(0).getTextContent();
            int price = Integer.parseInt(doc.getElementsByTagName("price").item(0).getTextContent());

            // Bookオブジェクトを作成
            Book book = new Book(title, author, price);

            // 出力
            System.out.println("タイトル : " + book.getTitle());
            System.out.println("著者 : " + book.getAuthor());
            System.out.println("価格 : " + book.getPrice());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
