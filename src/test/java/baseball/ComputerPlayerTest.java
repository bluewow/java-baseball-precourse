package baseball;

import nextstep.utils.Randoms;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ComputerPlayerTest {

    @DisplayName("3자리 서로 다른 난수 생성 테스트")
    @RepeatedTest(10)
    void generateRandomNumbers() {
        //given
        ComputerPlayer computerPlayer = new ComputerPlayer();
        //when
        computerPlayer.generateRandomNumbers();
        String numbers = computerPlayer.getNumbers();
        //then
        Set<String> set = new HashSet<>(Arrays.asList(numbers.split("")));
        assertThat(numbers.length()).isEqualTo(3);
        assertThat(set.size()).isEqualTo(3);
    }
}