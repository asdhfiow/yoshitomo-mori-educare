import java.util.Scanner;

public class VocabularyApp {

    private WordManager wordManager;
    private Quiz quiz;
    private FileHandler fileHandler; 
    private Scanner scanner;

    // コンストラクタ
    public VocabularyApp() {
        this.scanner = new Scanner(System.in);
        this.wordManager = new WordManager();
        this.quiz = new Quiz(wordManager);
        this.fileHandler = new FileHandler(); // 自作クラスを使う
    }
    // アプリの動作
    public void start() {
        while (true) {
            System.out.println("=== 英単語管理アプリ ===");
            System.out.println("1: 単語を登録する");
            System.out.println("2: クイズを受ける");
            System.out.println("3: CSVファイルから単語をインポート");
            System.out.println("4: CSVファイルに単語をエクスポート");
            System.out.println("5: 終了する");
            System.out.print("番号を選んでください: ");

            String input = scanner.nextLine();
            while (!input.matches("[1-5]")) {
                System.out.println("1〜5の数字を入力してください。");
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
                    System.out.println("終了します。");
                    scanner.close();
                    return; // while ループを抜けて終了
            }
        }
    }

    // 単語をさせるメソッド
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
        System.out.println("単語を登録しました。");
    }

    // クイズの処理内容
    private void startQuiz() {
        int totalQuestions = wordManager.getWordCount();
    if (wordManager.getWordCount() == 0) {
            System.out.println("登録された単語がありません。");
            return;
    }

    int score = 0;
    System.out.println("=== クイズを開始します ===");

    for (int i = 0; i < totalQuestions; i++){
        Word word = quiz.getRandomWord();
        String english = word.getEnglish();
        String japanese = word.getJapanese();

            System.out.println(english + "の意味は？");
            String answer = scanner.nextLine().trim();

            if (quiz.checkAnswer(word , answer)){
                System.out.println("正解です!");
                score ++;
            }else{
                System.out.println("不正解です。正解は" + japanese + "でした。");
            }
        }
            System.out.println("クイズ終了！");
            System.out.println(totalQuestions + "問中" + quiz.getScore());
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

    // メインメソッド
    public static void main(String[] args) {
        VocabularyApp app = new VocabularyApp();
        app.start();
    }
}
