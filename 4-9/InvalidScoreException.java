public class InvalidScoreException extends GameScoreException {
    // TODO: コンストラクタを実装
   public InvalidScoreException(int score){
    super(score, "エラー: Score cannot be negative");
   }
}