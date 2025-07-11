// TODO: GameScoreExceptionクラスを作成（抽象クラス）
public abstract class GameScoreException extends Exception {
    private int score;

    public GameScoreException(int score, String message){
        super(message);
        this.score = score;
    }
   public int getScore(){
    return score;
   }
    
    // TODO: コンストラクタを実装
    // TODO: getScoreメソッドを実装
}
