package racingcar.view;

import racingcar.Car;

//역할: Input객체와 Output객체의 협력을 잇는다.
//책임:
//- Input 객체를 통해 입력값 수집
//- 필요한 로직 실행
//- 결과를 Output 객체에 전달
public class ViewController {

    private final InputView input = new InputView();
    private final OutputView output = new OutputView();

    public ViewController() {
    }

    public String getCarNames() {
        output.printMessage("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        return input.readCarNames();
    }

    public int getRaceNumber() {
        output.printMessage("시도할 횟수는 몇 회인가요?");
        return input.readRaceNumber();
    }

}
