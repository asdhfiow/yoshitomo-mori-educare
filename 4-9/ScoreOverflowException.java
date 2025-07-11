// TODO: ScoreOverflowExceptionクラスを作成
public class ScoreOverflowException extends GameScoreException {
    // TODO: コンストラクタを実装
    public ScoreOverflowException(int score){
       super (score ,"エラー: Score cannot exceed 100");
    }
}