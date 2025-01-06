package racingcar;

public class Car {

    private String carName;
    private int moveCount;

    public Car(String carName, int moveCount) {
        this.carName = validate(carName);
        this.moveCount = moveCount;
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

    private String validate(String carName) {
        if (carName == "" || carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하로 입력해주세요.");
        }
        return carName;
    }

}
