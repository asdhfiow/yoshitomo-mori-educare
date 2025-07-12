public class InvalidScoreException extends GameScoreException {
    // TODO: コンストラクタを実装
   public InvalidScoreException(int score){
    super(score, "Score cannot be negative");
   }
}
