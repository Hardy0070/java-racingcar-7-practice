package racingcar;

import racingcar.view.OutputView;

public class Race {

    private OutputView outputView = new OutputView();

    public void oneRace() {
        String carName = "popo3";
        int raceNumber = 3;

        // 자동차 생성도 반복문으로 3번 하면 됌.
        Car racingcar = new Car(carName, 0, false);

        for (int i = 0; i < raceNumber; i++) {
            racingcar.getMoveOrStopVoid();
            outputView.printCarLocation(racingcar);
        }

    }
}
