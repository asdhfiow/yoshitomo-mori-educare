import java.io.*;
public class Main1{
    public static void main(String[] args){
        String fileName = "execrsise.csv";

        // CSVファイルを作成
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("名前, 年齢, 職業");
            writer.println("山田, 28, プログラマー");
            System.out.println("CSVファイルを作成しました : " + fileName);
        } catch (IOException e){
            e.printStackTrace();
        }

        // CSVファイルを読み込む
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            br.readLine(); // ヘッダー行をスキップ

            String line = br.readLine();
             if (line != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.println(value.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
