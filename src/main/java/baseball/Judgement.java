package baseball;

public class Judgement {
    private int strikeCount;
    private int ballCount;

    public Judgement(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public GameStatus execute() {
        if(strikeCount == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return GameStatus.STOP;
        }

        return GameStatus.PLAY;
    }

    public void display() {
        String s = "";

        if(strikeCount > 0)
            s += strikeCount + "스트라이크 ";

        if(ballCount > 0)
            s += ballCount + "볼";

        if(strikeCount == 0 && ballCount == 0)
            s += "낫싱";

        System.out.println(s);
    }
}
