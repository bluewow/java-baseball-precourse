package baseball;

import baseball.service.ComputerPlayer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerPlayerTest {

    @DisplayName("1~9 까지 임의의 수 3개 생성(중복 x)")
    @RepeatedTest(10)
    void generateNumber() {
        //given
        ComputerPlayer computerPlayer = new ComputerPlayer();
        //when
        List<String> generateNumber = computerPlayer.generateNumber();
        //then
        assertThat(generateNumber.size()).isEqualTo(3);
        assertThat(generateNumber.stream().distinct().count()).isEqualTo(3);
    }
}