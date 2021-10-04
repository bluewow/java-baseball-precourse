package baseball;

import baseball.controller.GameController;
import baseball.service.BaseballGame;
import baseball.service.ComputerPlayer;
import baseball.view.GameDisplay;
import nextstep.utils.Console;

public class Application {

    public static void main(String[] args) {
        GameController gameController = new GameController();

        gameController.init();
        gameController.play();
        gameController.end();

    }
}
