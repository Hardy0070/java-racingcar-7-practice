package racingcar;

import java.util.ArrayList;
import java.util.List;

//Car 객체
//역할: 무작위 값에 따라 전진할 수 있어야 한다.
public class Car {

    private String carName;
    private int moveCount;
    private boolean winnerCheck;

    public Car(String carName, int moveCount, boolean winnerCheck) {
        this.carName = validate(carName);
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

    private String validate(String carName) {
        if (carName == "" || carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하로 입력해주세요.");
        }
        return carName;
    }

}
