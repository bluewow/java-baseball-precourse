package baseball.service;

import baseball.model.PlayModel;
import com.sun.deploy.util.StringUtils;

import java.util.List;

/**
 * 게임에 필요한 시스템을 관리한다
 */
public class BaseballGame {

    private static final int MAX_BALL = 3;
    /**
     * 
     * @param playerInput 사용자 숫자입력 값
     * @param computerPlayer 컴퓨터 플레이어 숫자입력 값
     * @return
     */
    public PlayModel play(String playerInput, String computerPlayer) {
        int strikeCount = 0;
        int ballCount = 0;

        for (int i = 0; i < MAX_BALL; i++) {
            strikeCount += checkStrike(playerInput, computerPlayer, i);
            ballCount += checkBall(playerInput, computerPlayer, i);
        }

        return new PlayModel(strikeCount, ballCount);
    }

    private int checkBall(String playerInput, String computerPlayer, int index) {
        if(playerInput.charAt(index) != computerPlayer.charAt(index)
                && computerPlayer.indexOf(playerInput.charAt(index)) != -1)
            return 1;

        return 0;
    }

    private int checkStrike(String playerInput, String computerPlayer, int index) {
        if(playerInput.charAt(index) == computerPlayer.charAt(index))
            return 1;

        return 0;
    }

}
