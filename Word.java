class Word {

    // フィールドを宣言しただけ。外からはいじれない→ 値はnull
    private String english;
    private String japanese;

    // コンストラクタで初期化（フィールドに値をセットすること）
    public Word(String english, String japanese) { // コンストラクタ引数で、外部からの値を持ってくる
        this.english = english; // 持ってきた値をenglishという箱に代入
        this.japanese = japanese;
    }

    // 値を取り出すための一つの処理
    public String getEnglish() {
        return english;
    } 

    public String getJapanese() {
        return japanese;
    }

    // フィールドに値をセットする一つの処理 = メソッドを呼び出すときに引数の値を指定する
    public void setEnglish(String english) { // 引数名を指定
        this.english = english; // englishフィールドに、メソッドの引数名englishを入れる
    }

    public void setJapanese(String japanese) { // 引数名を指定
        this.japanese = japanese; // japaneseフィールドに、メソッドの引数名japanseを入れる
    }
}