package baseball;

import nextstep.utils.Console;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UserPlayer {

    public String userCommand() {
        String input = null;
        try {
            System.out.print("숫자를 입력해주세요 : ");
            input = Console.readLine();
            checkValid(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            userCommand();
        }

        return input;
    }

    private void checkValid(String input) {
        checkLength(input);
        checkNumber(input);
        checkDuplicate(input);
    }

    private void checkDuplicate(String input) {
        Set<String> set = new HashSet<>(Arrays.asList(input.split("")));
        if(set.size() != 3)
            throw new IllegalArgumentException("[ERROR] 중복된 숫자를 입력하지 말아주세요");
    }

    private void checkNumber(String input) {
        if (!input.matches("[1-9]*"))
            throw new IllegalArgumentException("[ERROR] 1~9까지의 숫자를 입력해 주세요");
    }

    private void checkLength(String input) {
        if(input.length() != 3)
            throw new IllegalArgumentException("[ERROR] 길이를 잘못입력 하셨습니다");
    }


    public GameStatus continueOrTerminate() {
        String input = Console.readLine();
        if(input.equals("1"))
            return GameStatus.PLAY;
        if(input.equals("2"))
            return GameStatus.EXIT;

        throw new IllegalArgumentException("[ERROR] 1 또는 2를 입력해 주세요");
    }
}
