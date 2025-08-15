import java.util.*;

// 単語を追加して配列に入れる
class WordManager {

    // メンバ変数 arraylistクラスでwordsという箱を作る
    ArrayList<Word> words = new ArrayList<>();
    
    // デフォルトコンストラクタ
    public WordManager(){

    }
    // wordsという箱に入れる
    public void addWord(Word word) {
        words.add(word);
    }

    // ArrayListで作った単語を取ってくる
    public ArrayList<Word> getWords(){
        return words;
    }

    // 単語数をカウントする
    public int getWordCount(){
        return words.size();
    }
}
