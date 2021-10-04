package baseball.model;

/**
 * 상대방과 게임한 결과를 담고 있는 model
 */
public class PlayModel {
    private String strike;
    private String ball;
    private String out;

    public PlayModel(String strike, String ball, String out) {
        this.strike = strike;
        this.ball = ball;
        this.out = out;
    }

    public String getStrike() {
        return strike;
    }

    public String getBall() {
        return ball;
    }

    public String getOut() {
        return out;
    }
}
