package baseball;

import nextstep.utils.Randoms;

public class ComputerPlayer {

    private String numbers = "";

    public void generateRandomNumbers() {
        numbers = "";
        while (numbers.length() != 3) {
            updateNumbers();
        }
    }

    private void updateNumbers() {
        String randomNum = Integer.toString(Randoms.pickNumberInRange(1, 9));
        if(!numbers.contains(randomNum))
            numbers += randomNum;
    }

    public String getNumbers() {
        return numbers;
    }
}
