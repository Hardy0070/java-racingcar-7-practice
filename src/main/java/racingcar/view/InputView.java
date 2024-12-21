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

}
