import java.io.IOException;
import java.nio.file.*;

public class Main4 {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("source.txt");
        Path backupDir = Paths.get("backup");
        Path archiveDir = Paths.get("archive");
        Path backupFile = backupDir.resolve("source.txt");
        Path archiveFile = archiveDir.resolve("source.txt");

        try {
            // source.txt が無ければ作成
            if (!Files.exists(sourceFile)) {
                Files.writeString(sourceFile, "This is source file.\n");
                System.out.println("source.txt を自動作成しました。");
            }


            // フォルダが存在しなければ作成
            if (!Files.exists(backupDir)) {
                Files.createDirectories(backupDir);
            }
            if (!Files.exists(archiveDir)) {
                Files.createDirectories(archiveDir);
            }

            // ファイルをバックアップ先にコピー
            Files.copy(sourceFile, backupFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("ファイルが 'backup/' にコピーされました。");

            // コピー確認
            if (Files.exists(backupFile)) {
                System.out.println("コピーの確認: 成功");
            } else {
                System.out.println("コピーの確認: 失敗");
            }

            // バックアップファイルをアーカイブ先に移動
            Files.move(backupFile, archiveFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("ファイルが 'archive/' に移動されました。");

            // 移動確認
            if (Files.exists(archiveFile)) {
                System.out.println("移動の確認: 成功");
            } else {
                System.out.println("移動の確認: 失敗");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
