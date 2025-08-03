import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        // ここにコードを書いてください
            FileReader reader = null;

        try {
            reader = new FileReader("exercise.txt");
            int data;
            while((data = reader.read()) != 1){
                System.out.print((char) data);
        }
        } catch (IOException e){
            System.out.print("ファイルの読み込み中にエラーが発生しました。");
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e){
                    System.out.println("ファイルを閉じる際にエラーが発生しました。");
                }
            }
        }
    }
}