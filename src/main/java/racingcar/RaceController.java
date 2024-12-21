package racingcar;

import java.util.ArrayList;
import java.util.List;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.ViewController;

public class RaceController {

    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private ViewController viewController = new ViewController();

    public void racingStart() {
        String initialCarNames = viewController.initialCarNames();
        List<String> carNames = viewController.separatedCarNames(initialCarNames);
        List<Car> racingCars = getRacingCar(carNames);

        int raceNumber = viewController.getRaceNumber();

        outputView.printRacingResult(raceNumber, racingCars);

        int maxNumber = getMaxNumber(racingCars);

        String winnerCars = getWinnerCars(racingCars, maxNumber);

        outputView.printWinnerCars(winnerCars);
    }


    public String getWinnerCars(List<Car> racingCars, int maxNumber) {
        String winnerCars = "";

        for (Car racingCar : racingCars) {
            if (racingCar.getMoveCount() == maxNumber) {
                winnerCars += racingCar.getCarName() + ", ";
            }
        }
        return winnerCars;
    }

    public int getMaxNumber(List<Car> racingCars) {
        int maxNumber = 0;

        for (Car racingCar : racingCars) {
            if (racingCar.getMoveCount() > maxNumber) {
                maxNumber = racingCar.getMoveCount();
            }
        }
        return maxNumber;
    }

    public List<Car> getRacingCar(List<String> carNames) {
        List<Car> racingCars = new ArrayList<>();

        for (String name : carNames) {
            Car car = new Car(name, 0, false);
            racingCars.add(car);
        }

        return racingCars;
    }
}
