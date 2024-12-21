package racingcar;

import java.util.ArrayList;
import java.util.List;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.ViewController;

// Race객체가 controller 역할을 하려나?
public class Race {

    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private ViewController viewController = new ViewController();

    public void start() {
        String carName = viewController.getCarNames();
        int raceNumber = viewController.getRaceNumber();

        List<String> carNames = inputView.separatedCarNames(carName);

        List<Car> racingCars = new ArrayList<>();

        for (String name : carNames) {
            Car car = new Car(name, 0, false);
            racingCars.add(car);
        }

        for (int i = 0; i < raceNumber; i++) {
            for (Car racingCar : racingCars) {
                racingCar.getMoveOrStopVoid();
                outputView.printCarLocation(racingCar);
            }
            System.out.println();
        }

    }
}
