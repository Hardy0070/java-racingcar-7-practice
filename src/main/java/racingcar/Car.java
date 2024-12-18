package racingcar;

//Car 객체
//역할: 무작위 값에 따라 전진할 수 있어야 한다.
public class Car {

    private String carName;
    private int moveCount;
    private boolean winnerCheck;

    public Car() {
    }

    public Car(String carName, int moveCount, boolean winnerCheck) {
        this.carName = carName;
        this.moveCount = moveCount;
        this.winnerCheck = winnerCheck;
    }

    public String getCarName() {
        return carName;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void getMoveOrStopVoid() {
        int randomNumber = (int) (Math.random() * 10);
        if (randomNumber > 3) {
            moveCount++;
        }
    }

    // carLocation에 moveCount 갯수만큼 -를 추가한다.
    public String convertMoveCount(int moveCount) {
        String carLocation = "";

        for (int i = 0; i < moveCount; i++) {
            carLocation += "-";
        }

        return carLocation;
    }

}
