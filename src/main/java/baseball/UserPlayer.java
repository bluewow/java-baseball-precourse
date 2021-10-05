package baseball;

import nextstep.utils.Console;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UserPlayer {
    public static String ERROR_DUPLICATE = "[ERROR] 중복된 숫자를 입력하지 말아주세요";
    public static String ERROR_NOT_NUMBER = "[ERROR] 1~9까지의 숫자를 입력해 주세요";
    public static String ERROR_ILLEGAL_LENGTH = "[ERROR] 길이를 잘못입력 하셨습니다";
    public static String ERROR_FAIL_INPUT = "[ERROR] 1 또는 2를 입력해 주세요";

    public String userCommand() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        checkValid(input);

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
            throw new IllegalArgumentException(ERROR_DUPLICATE);
    }

    private void checkNumber(String input) {
        if (!input.matches("[1-9]*"))
            throw new IllegalArgumentException(ERROR_NOT_NUMBER);
    }

    private void checkLength(String input) {
        if(input.length() != 3)
            throw new IllegalArgumentException(ERROR_ILLEGAL_LENGTH);
    }


    public GameStatus continueOrTerminate() {
        String input = Console.readLine();
        if(input.equals("1"))
            return GameStatus.PLAY;
        if(input.equals("2"))
            return GameStatus.EXIT;

        throw new IllegalArgumentException(ERROR_FAIL_INPUT);
    }
}
