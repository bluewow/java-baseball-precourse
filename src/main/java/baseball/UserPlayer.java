package baseball;

import nextstep.utils.Console;

public class UserPlayer {

    public String userCommand() {
        String input = Console.readLine();
        checkValid(input);

        return input;
    }

    private void checkValid(String input) {
        //TODO
    }


    public GameStatus continueOrTerminate() {
        String input =  Console.readLine();
        if(input.equals("1"))
            return GameStatus.PLAY;
        if(input.equals("2"))
            return GameStatus.EXIT;

        throw new IllegalArgumentException("잘못된 입력");
    }
}
