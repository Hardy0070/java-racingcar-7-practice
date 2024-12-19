package racingcar;

//Car 객체
//역할: 무작위 값에 따라 전진할 수 있어야 한다.
public class Car {

    private String carName;
    private int moveCount;
    private boolean winnerCheck;

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

}
