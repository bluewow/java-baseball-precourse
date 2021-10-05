package baseball;

import nextstep.utils.Console;

import java.util.NoSuchElementException;

public class BaseballGame {
    private UserPlayer userPlayer;
    private ComputerPlayer computerPlayer;
    private Judgement judgement;
    private GameStatus gameStatus;

    public BaseballGame(UserPlayer userPlayer, ComputerPlayer computerPlayer) {
        this.userPlayer = userPlayer;
        this.computerPlayer = computerPlayer;
    }

    public void init() {
        gameStatus = GameStatus.PLAY;
        computerPlayer.generateRandomNumbers();
    }

    public void play() {
        while(gameStatus == GameStatus.PLAY) {
            String userInput = userPlayer.userCommand();
            String computerInput = computerPlayer.getNumbers();

            playball(userInput, computerInput);

            judgement.display();
            gameStatus = judgement.execute();
        }
    }

    public void finish() {
        gameStatus = userPlayer.continueOrTerminate();
    }

    private int checkBall(String userInput, String computerInput, int index) {
        if(userInput.charAt(index) != computerInput.charAt(index)
                && computerInput.indexOf(userInput.charAt(index)) != -1)
            return 1;

        return 0;
    }

    private int checkStrike(String userInput, String computerInput, int index) {
        if(userInput.charAt(index) == computerInput.charAt(index))
            return 1;

        return 0;
    }

    private void playball(String userInput, String computerInput) {
        int strikeCount = 0;
        int ballCount = 0;

        for (int i = 0; i < 3; i++) {
            strikeCount += checkStrike(userInput, computerInput, i);
            ballCount += checkBall(userInput, computerInput, i);
        }

        judgement = new Judgement(strikeCount, ballCount);
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }


}
