import java.util.*;
import java.io.*;

public class FileHandler {

    // CSVエクスポート
    public void exportToCSV(List<Word> words, String fileName) {
        if (words == null || words.isEmpty()) {
            System.out.println("エラー: 登録された単語がありません。");
            return;
        }

        File file = new File(fileName);

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (Word word : words) {
                writer.println(word.getEnglish() + "," + word.getJapanese());
            }
            System.out.println(words.size() + "個の単語を保存しました。");
        } catch (IOException e) {
            System.out.println("エラー: ファイルへの書き込みに失敗しました。");
        }
    }

    // CSVインポート
    public void importFromCSV(String fileName, WordManager wordManager) {
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("エラー: ファイルが存在しません。");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 2) {
                    System.out.println("エラー: CSVの形式が不正です。");
                    return; // 異常系テスト
                }
                Word word = new Word(parts[0].trim(), parts[1].trim());
                wordManager.addWord(word);
                count++;
            }

            System.out.println(count + "個の単語を読み込みました。");
        } catch (IOException e) {
            System.out.println("エラー: ファイルの読み込みに失敗しました。");
        }
    }
}
