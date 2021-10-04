package baseball.controller;

import baseball.service.BaseballGame;
import baseball.service.ComputerPlayer;
import baseball.view.GameDisplay;

/**
 * baseball game의 control 역활
 */
public class GameController {
    private BaseballGame baseballGame = new BaseballGame();
    private ComputerPlayer computerPlayer = new ComputerPlayer();
    private GameDisplay gameDisplay = new GameDisplay();

    public void init() {
    }

    public void play() {
    }

    public void end() {
    }
}
