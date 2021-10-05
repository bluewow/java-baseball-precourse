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


}
