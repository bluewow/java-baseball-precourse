package baseball;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 상대방 플레이어 (computer player)
 */
public class ComputerPlayer {

    /**
     * 1~9 까지 서로 다른 임의의 수 3개를 선택(생성)한다
     * @return 3개의 서로다른 수
     */
    public List<String> generateNumber() {
        List<String> numbers = new ArrayList<>();

        while(numbers.size() != 3) {
            int randomNum = Randoms.pickNumberInRange(1, 9);
            checkDuplicated(numbers, Integer.toString(randomNum));
        }

        return numbers;
    }

    private void checkDuplicated(List<String> numbers, String randomNum) {
        for (String number : numbers) {
            if(number.equals(randomNum)) {
                return;
            }
        }
        numbers.add(randomNum);
    }
}
