import java.util.*;
public class Quiz {
    private WordManager wordManager;
    private int score;
    private int totalQuestions;

    public Quiz(WordManager wordManager){
        this.wordManager = wordManager;
        this.totalQuestions = wordManager.getWordCount();
        this.score =0;
    }

    // 答え合わせメソッド
public boolean checkAnswer(Word word, String answer){ // Wordの中の処理を使えるようにしている
        if (word == null) return false;
        boolean correct = word.getJapanese().equals(answer.trim());
        if (correct) score++;
        return correct;
}

// ランダムな単語を返す
public Word getRandomWord(){
    int count = wordManager.getWordCount();
        if (count == 0) {
            return null; // 単語がない場合は null を返す
        }
        Random random = new Random();
        int index = random.nextInt(count); // count >= 1 なので安全
        return wordManager.getWords().get(index);
}

// スコアを取得
public int getScore(){
    return score;
}

// トータルスコアを取得
public int totalQuestions(){
    return totalQuestions;
}
}