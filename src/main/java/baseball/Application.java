package baseball;


public class Application {

    public static void main(String[] args) {
        UserPlayer userPlayer = new UserPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();
        BaseballGame baseballGame = new BaseballGame(userPlayer, computerPlayer);

        do {
            baseballGame.init();
            baseballGame.play();
//            baseballGame.finish();
        } while(baseballGame.getGameStatus() != GameStatus.EXIT);
    }
}
