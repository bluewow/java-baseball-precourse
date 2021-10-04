package baseball.view;

import baseball.model.PlayModel;

public class GameDisplay {
    public void inputPrint() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void outputPrint(PlayModel model) {
        String s = "";

        if(model.getStrike() > 0)
            s += model.getStrike() + "스트라이크 ";

        if(model.getBall() > 0)
            s += model.getBall() + "볼 ";

        if(model.getStrike() == 0 && model.getBall() == 0)
            s += "낫싱";

        System.out.println(s);
    }

    public void terminate() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
