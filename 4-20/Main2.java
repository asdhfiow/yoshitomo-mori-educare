import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException{
        // ここにコードを書いてください


        try (FileReader reader = new FileReader("exercise.txt")){
            int data;
            while((data = reader.read()) != -1){
                System.out.print((char) data);
        }
        } catch (IOException e){
            System.out.print("ファイルの読み込み中にエラーが発生しました。");
        } 
    }
}
