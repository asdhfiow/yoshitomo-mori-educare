import java.util.Scanner;

public class quizApp {
    public static void main(String[] args) {

        String[] englishArray = new String[20];  //英単語を格納する配列
        String[] japaneseArray = new String[20]; //日本語役を格納する配列

        int printCount = 0; // クイズの正解数をカウントする変数
        int wordCount = 0; // 登録された単語の数をカウントする変数

        Scanner scanner = new Scanner(System.in);  // ユーザー入力を受け付ける

//メインループ
        while (true) {
            // 選択肢を毎回表示
            System.out.println("１：単語を登録する");
            System.out.println("２：クイズを受ける");
            System.out.println("３：終了する");

            String input = scanner.nextLine();

            // 入力が1〜3でなければ再入力
            while (!(input.equals("1") || input.equals("2") || input.equals("3"))) {
                System.out.println("1〜3の数字を入力してください");
                input = scanner.nextLine();
            }
            int choice = Integer.parseInt(input); // 入力を整数に変換
        
        // 選択肢に応じて処理を分岐
            switch (choice) {
                //機能①：単語を登録する
                case 1:
                    while (wordCount < 20) {
                        System.out.println("英単語を入力してください：");
                        String eng = scanner.nextLine();
                        System.out.println("日本語訳を入力してください：");
                        String jap = scanner.nextLine();

                        englishArray[wordCount] = eng;  //登録した英単語の配列の数を、変数に代入
                        japaneseArray[wordCount] = jap; //登録した日本語訳の配列の数を、変数に代入
                        wordCount++;
                    }
                    if (wordCount >= 20) {
                        System.out.println("これ以上単語を追加できません");
                    }
                    break;

                //機能②：クイズ機能
                case 2:
                    //登録された単語数が０だった時
                    if (wordCount == 0) {
                        System.out.println("単語が登録されていません");
                        break;
                    }
                    //正誤判定
                    printCount = 0;     // クイズの正解数を初期化
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

                //機能③：終了する
                case 3:
                    scanner.close();
                    return;//mainメソッド終了
                    
                //無効な選択    
                case 4:
                    System.out.println("1-3の数字を選択してください");
                    break;
                    default:
            }
        }
    }
}
