package baseball.service;

import baseball.model.PlayModel;

import java.util.List;

/**
 * 게임에 필요한 시스템을 관리한다
 */
public class BaseballGame {

    /**
     * 
     * @param playerInput 사용자 숫자입력 값
     * @param computerPlayer 컴퓨터 플레이어 숫자입력 값
     * @return
     */
    public PlayModel play(String playerInput, List<String> computerPlayer) {
        checkStrike();
        checkBall();
        checkOut();

        return new PlayModel(null, null, null);
    }

    private int checkOut() {
        return 0;
    }

    private int checkBall() {
        return 0;
    }

    private int checkStrike() {
        return 0;
    }

}
