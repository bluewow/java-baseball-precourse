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

    public void play() {
        init();

        do {
            System.out.println(computerPlayer.getNumbers());
            gameDisplay.inputPrint();

            model = baseballGame.play(Console.readLine(), computerPlayer.getNumbers());

            gameDisplay.outputPrint(model);
        } while(isFinish());
    }

    private void init() {
        baseballGame = new BaseballGame();
        computerPlayer = new ComputerPlayer();
        gameDisplay = new GameDisplay();

    }

    private boolean isFinish() {
        if(model.isFinish()) {
            gameDisplay.terminate();
            init();

            String input = Console.readLine();
            if(input.equals("1"))
                return true;

            if(input.equals("2"))
                return false;

            throw new IllegalArgumentException();
        }

        return true;
    }
}
