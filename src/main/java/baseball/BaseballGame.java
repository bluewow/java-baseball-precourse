package baseball;

public class BaseballGame {
    private UserPlayer userPlayer;
    private ComputerPlayer computerPlayer;
    private GameStatus gameStatus;

    public BaseballGame(UserPlayer userPlayer, ComputerPlayer computerPlayer) {
    }

    public void init() {
        computerPlayer.generateRandomNumbers();
    }

    public void play() {
        while(gameStatus == GameStatus.PLAY) {

        }
    }

    public void finish() {

    }

    private void chekcStrike() {

    }

    private void chekcBall() {

    }

    private void judgement() {

    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }


}
