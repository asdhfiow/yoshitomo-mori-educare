import java.util.Scanner;

public class VocabularyApp {

    private WordManager wordManager;
    private Quiz quiz;
    private FileHandler fileHandler; 
    private Scanner scanner;
    private DBManager dbManager;

    // コンストラクタ
    public VocabularyApp() {
    this.scanner = new Scanner(System.in);

    this.dbManager = new DBManager();        // 先に dbManager を作る
    this.dbManager.initializeDatabase();    // DB接続も先にする
    this.wordManager = new WordManager(dbManager); // その後 WordManager に渡す
    this.quiz = new Quiz(wordManager);
    this.fileHandler = new FileHandler();
}
    // アプリの動作
    public void start() {
        while (true) {
            System.out.println("=== 英単語管理アプリ ===");
            System.out.println("1: 単語を登録する");
            System.out.println("2: クイズを受ける");
            System.out.println("3: CSVファイルから単語をインポート");
            System.out.println("4: CSVファイルに単語をエクスポート");
            System.out.println("5: 単語を削除する");
            System.out.println("6: 単語を更新する");
            System.out.println("7: 終了する");
            System.out.print("番号を選んでください: ");

            String input = scanner.nextLine();
            while (!input.matches("[1-7]")) {
                System.out.println("1〜7の数字を入力してください。");
                input = scanner.nextLine();
            }

            int choice = Integer.parseInt(input);
            switch (choice) {
                case 1:
                    registerWord();
                    break;
                case 2:
                    startQuiz();
                    break;
                case 3:
                    importWords();
                    break;
                case 4:
                    exportWords();
                    break;
                case 5:
                    deleteWord();
                    break;
                case 6:
                    updateWord();;
                    break;
                case 7:
                    System.out.println("終了します。");
                    cleanup();
                    return; // while ループを抜けて終了
            }
        }
    }

    // 単語を入力させてデータベースに保存するメソッド
    private void registerWord() {
        System.out.print("英単語を入力してください: ");
        String english = scanner.nextLine().trim();
        System.out.print("日本語を入力してください: ");
        String japanese = scanner.nextLine().trim();

        if (english.isEmpty() || japanese.isEmpty()) {
            System.out.println("英単語と日本語の両方を入力してください。");
            return;
        }
        wordManager.addWord(new Word(english, japanese));
    }

    // クイズの処理内容
    private void startQuiz() {
        int totalQuestions = wordManager.getWordCount();

        if (wordManager.getWordCount() == 0) {
            System.out.println("登録された単語がありません。");
            return;
    }

    System.out.println("=== クイズを開始します ===");

    for (int i = 0; i < totalQuestions; i++){
        Word word = quiz.getRandomWord();
        String english = word.getEnglish();
        String japanese = word.getJapanese();

            System.out.println(english + "の意味は？");
            String answer = scanner.nextLine().trim();

            if (quiz.checkAnswer(word , answer)){
                System.out.println("正解です!");
            }else{
                System.out.println("不正解です。正解は" + japanese + "でした。");
            }
        }
            System.out.println("クイズ終了！");
            System.out.println(quiz.getTotalQuestions() + "問中" + quiz.getScore() + "問正解でした！");
    }

    // インポートした時の処理
    private void importWords() {
        System.out.print("インポートするCSVファイル名を入力してください: ");
        String fileName = scanner.nextLine().trim();
        fileHandler.importFromCSV(fileName, wordManager);
    }

    // エクスポートした時の処理
    private void exportWords() {
        System.out.print("エクスポートするCSVファイル名を入力してください: ");
        String fileName = scanner.nextLine().trim();
        fileHandler.exportToCSV(wordManager.getWords(), fileName);
    }
    
    // 登録した単語を消す処理
    private void deleteWord() {
        System.out.println("削除する英単語を入力してください。");
        String inputEnglish = scanner.nextLine().trim();

        if (inputEnglish.isEmpty()){
            System.out.println("英単語を入力してください");
            return;
        }

        boolean deleted = wordManager.deleteWord(inputEnglish); // trueかfalseを返す
        if (deleted) {
            System.out.println("単語 : " + inputEnglish + "を削除しました");
        } else {
            System.out.println("単語 : " + inputEnglish + "は存在しません");
            }
        }
        
    // 単語を更新する
    private void updateWord(){
        System.out.println("更新する英語を入力してください。");
        String updateEnglish = scanner.nextLine().trim();
        System.out.println("新しい日本語訳を入力してください。");
        String newJapanese = scanner.nextLine().trim();

        // WordManagerに更新を依頼する
        boolean updated = wordManager.updateWord(updateEnglish, newJapanese);

        if (updated) {
            System.out.println("単語を更新しました。");
        } else {
            System.out.println("指定された英単語は見つかりませんでした。");
        }
    }

    // 後始末
    private void cleanup(){
        // データベースを閉じる
        dbManager.close();
        // scanner閉じる
        scanner.close();
    }

    // メインメソッド
    public static void main(String[] args) {
        VocabularyApp app = new VocabularyApp();
        app.start();
    }
}
