import java.util.Scanner;

public class quizApp {
    public static void main(String[] args) {

//英語と日本語の文字列を格納する配列を用意
        String[] englishArray = new String[20];
        String[] japaneseArray = new String[20];

//クイズの正解数、単語の数をカウントする変数を定義
        int printCount = 0;
        int wordCount = 0;

// ユーザー入力を受け付ける
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 選択肢を毎回表示
            System.out.println("１：単語を登録する");
            System.out.println("２：クイズを受ける");
            System.out.println("３：終了する");

            int choice = scanner.nextInt();
            scanner.nextLine();  // 改行読み飛ばし

            // 選択肢に応じて処理を分岐
            switch (choice) {
                case 1://単語を登録する
                    while (wordCount < 20) {
                        System.out.println("英単語を入力してください：");
                        String eng = scanner.nextLine();
                        System.out.println("日本語訳を入力してください：");
                        String jap = scanner.nextLine();

                        englishArray[wordCount] = eng;
                        japaneseArray[wordCount] = jap;
                        wordCount++;
                    }
                    if (wordCount >= 20) {
                        System.out.println("これ以上単語を追加できません");
                    }
                    break;

                case 2://クイズ機能
                    if (wordCount == 0) {
                        System.out.println("単語が登録されていません");
                        break;
                    }

                    printCount = 0; // クイズの正解数を初期化
                    for (int i = 0; i < wordCount; i++) {
                        System.out.println(englishArray[i] + " の意味は？");
                        String answer = scanner.nextLine();
                        if (answer.equals(japaneseArray[i])) {
                            System.out.println("正解です！");
                            printCount++;
                        } else {
                            System.out.println("不正解です");
                        }
                    }
                    System.out.println("クイズ終了！");
                    System.out.println(wordCount + "問中" + printCount + "問正解でした！");
                    break;

                case 3://終了する
                    scanner.close();
                    return;//mainメソッド終了
                    default:
            }
        }
    }
}
