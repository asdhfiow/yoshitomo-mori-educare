import java.io.*;

public class Main1{
    public static void main(String[] args){
        try {
            FileWriter writer = new FileWriter("exercise.txt");
            writer.write("Hello, World!");
            writer.flush();
            writer.close();
            System.out.println("ファイルへの書き込みが完了しました。");
        } catch(IOException e) {
            System.out.println("ファイルの書き込み中にエラーが発生しました。");
        }
    }
}
