import java.util.*;
public class Quiz {
    private WordManager wordManager;
    private int score;
    private int totalQuestions;

    public Quiz(WordManager wordManager){
        this.wordManager = wordManager;
        this.score =0;
    }

    // 答え合わせメソッド
public boolean checkAnswer(Word word, String answer){ // Wordクラスの中の処理を使えるようにしている
        if (word == null){
            return false;
        }
        boolean correct = word.getJapanese().equals(answer.trim());
        if (correct){
            score++;
        }
        totalQuestions++;
        return correct;
}

// ランダムな単語を1つ返す
public Word getRandomWord() { 
    List<Word> words = wordManager.getWords();
    if (words.size() == 0) {
        return null;
    }
    Random random = new Random();
    int index = random.nextInt(words.size());
    return words.get(index); // 単一のWordオブジェクトを返す
}


// スコアを取得
public int getScore(){
    return score;
}

// トータルスコアを取得
public int getTotalQuestions(){
    return totalQuestions;
}
}