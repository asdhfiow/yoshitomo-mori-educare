import java.io.*;

public class Main3 {
    public static void main(String[] args){

        // exercise_folderを作成
        File folder = new File("exercise_folder");
            if (!folder.exists()) {
                if (folder.mkdir()){
                    System.out.println("フォルダを作成しました。");
                } else {
                    System.out.println("フォルダの作成に失敗しました。");
                }
            } else {
                System.out.println("フォルダはすでに存在します。");
            }
            

            // exercise_file.txt.ファイルを作成
            File file = new File(folder, "exercise_file.txt");
            if (!file.exists()){
                try {
                    if (file.createNewFile()) {
                        System.out.println("ファイルを作成しました。");
                    } else {
                        System.out.println("ファイルの作成に失敗しました。");
                    }
                } catch (IOException e) {
                    System.out.println("ファイルの作成中にエラーが発生しました。");
                } 
             } else {
                    System.out.println("ファイルはすでに存在します。");
                }
            }
        }
