package racingcar.view;

import java.util.List;
import racingcar.Car;

//Output 객체
//역할: 사용자에게 결과를 출력하는 역할만 수행
//책임: 프로그램이 처리한 결과나 메시지를 화면 또는 다른 출력 장치에 출력한다.
public class OutputView {

    public OutputView() {
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printCarLocation(Car car) {
        printMessage(car.getCarName() + " : " + convertMoveCount(car.getMoveCount()));
    }

    public String convertMoveCount(int moveCount) {
        String carLocation = "";

        for (int i = 0; i < moveCount; i++) {
            carLocation += "-";
        }

        return carLocation;
    }

    public void printWinnerCars(String winnerCars) {
        printMessage("최종 우승자 : " + winnerCars.substring(0, winnerCars.length() - 2));
    }

    public void printRacingResult(int raceNumber, List<Car> racingCars) {
        System.out.println("실행 결과");
        for (int i = 0; i < raceNumber; i++) {
            for (Car racingCar : racingCars) {
                racingCar.getMoveOrStopVoid();
                printCarLocation(racingCar);
            }
            System.out.println();
        }
    }
}
