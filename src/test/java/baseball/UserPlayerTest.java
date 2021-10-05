package baseball;

import nextstep.test.NSTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserPlayerTest extends NSTest {
    UserPlayer userPlayer;

    @BeforeEach
    void beforeEach() {
        userPlayer = new UserPlayer();
        super.setUp();
    }

    @DisplayName("3자리 숫자입력")
    @Test
    void test_case1() {
        InputStream in = new ByteArrayInputStream("123".getBytes());
        System.setIn(in);
        String input = userPlayer.userCommand();

        assertThat(input).isEqualTo("123");
    }

    @DisplayName("3자리 초과시")
    @Test
    void test_case2() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            InputStream in = new ByteArrayInputStream("123123".getBytes());
            System.setIn(in);
            userPlayer.userCommand();
        });
        assertThat(exception.getMessage())
                .isEqualTo(UserPlayer.ERROR_ILLEGAL_LENGTH);
    }


    @DisplayName("중복된 숫자입력시")
    @Test
    void test_case3() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            InputStream in = new ByteArrayInputStream("112".getBytes());
            System.setIn(in);
            userPlayer.userCommand();
        });
        assertThat(exception.getMessage())
                .isEqualTo(UserPlayer.ERROR_DUPLICATE);
    }


    @DisplayName("숫자외 입력시")
    @Test
    void test_case4() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            InputStream in = new ByteArrayInputStream("3ab".getBytes());
            System.setIn(in);
            userPlayer.userCommand();
        });
        assertThat(exception.getMessage())
                .isEqualTo(UserPlayer.ERROR_NOT_NUMBER);
    }

    @DisplayName("정답후 잘못된 유저 입력시")
    @Test
    void test_case5() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            InputStream in = new ByteArrayInputStream("3".getBytes());
            System.setIn(in);
            userPlayer.continueOrTerminate();
        });
        assertThat(exception.getMessage())
                .isEqualTo(UserPlayer.ERROR_FAIL_INPUT);
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
    @AfterEach
    void tearDown() {
        outputStandard();
    }
}