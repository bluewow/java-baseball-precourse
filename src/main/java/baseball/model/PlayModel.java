package baseball.model;

/**
 * 상대방과 게임한 결과를 담고 있는 model
 */
public class PlayModel {
    private int strike;
    private int ball;

    public PlayModel(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isFinish() {
        if(strike == 3)
            return true;

        return false;
    }
}
