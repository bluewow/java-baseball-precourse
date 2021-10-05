package baseball;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerPlayerTest {

    @DisplayName("3자리 서로 다른 난수 생성 테스트")
    @RepeatedTest(10)
    void generateRandomNumbers() {
        //given
        ComputerPlayer computerPlayer = new ComputerPlayer();
        //when
        computerPlayer.generateRandomNumbers();
        //then
        System.out.println(computerPlayer.getNumbers());
    }
}