public class ScoreManager {
    // スコアを検証するメソッド
    public int validateScore(int score) throws GameScoreException {

    // 1. 負の値の場合はInvalidScoreExceptionをスロー
    // 2. 100点超過の場合はScoreOverflowExceptionをスロー
    // 3. それ以外の場合は正常終了

        if (score < 0) {
            throw new InvalidScoreException(score);
        } else if (score > 100) {
            throw new ScoreOverflowException(score);
        }
        return score; // 正常なスコアの場合
    }
}

