package racingcar.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Input 객체
//역할: 사용자로부터 입력을 받는 역할만 수행
//책임: 입력값을 받아 처리하고, 필요한 형식으로 변환하거나 검증한다.
//메서드: 사용자로부터 입력을 받을 수 있는 인터페이스 제공
public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    public String readCarNames() {
        return scanner.nextLine();
    }

    public int readRaceNumber() {
        return scanner.nextInt();
    }

    private String[] spiltCarNames(String carNames) {
        return carNames.split(",");
    }

    private String removeSpaceLetter(String carName) {
        String carNameAfterTrim = carName.trim();
        if (carNameAfterTrim.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하로 입력해주세요.");
        }
        return carNameAfterTrim;
    }

    public List<String> validateCarNames(String carNames) {
        List<String> validatedCarNames = new ArrayList<>();

        String[] splitCarNames = spiltCarNames(carNames);
        for (String splitCarName : splitCarNames) {
            validatedCarNames.add(removeSpaceLetter(splitCarName));
        }

        return validatedCarNames;
    }

}
