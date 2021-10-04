package baseball.controller;

import baseball.model.PlayModel;
import baseball.service.BaseballGame;
import baseball.service.ComputerPlayer;
import baseball.view.GameDisplay;
import nextstep.utils.Console;

/**
 * baseball game의 control 역활
 */
public class GameController {
    private BaseballGame baseballGame;
    private ComputerPlayer computerPlayer;
    private GameDisplay gameDisplay;
    private PlayModel model;

    public void init() {
        baseballGame = new BaseballGame();
        computerPlayer = new ComputerPlayer();
        gameDisplay = new GameDisplay();
    }

    public void play() {
        do {
            gameDisplay.inputPrint();
            model = baseballGame.play(Console.readLine(), computerPlayer.getNumbers());
            gameDisplay.outputPrint(model);
        } while(terminate());
    }

    public void end() {
    }


    private boolean terminate() {
        boolean isNotFinish = model.isNotFinish();
        if(!isNotFinish)
            gameDisplay.terminate();

        return isNotFinish;

    }
}
