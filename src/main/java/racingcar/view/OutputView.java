package racingcar.view;

//Output 객체
//역할: 사용자에게 결과를 출력하는 역할만 수행
//책임: 프로그램이 처리한 결과나 메시지를 화면 또는 다른 출력 장치에 출력한다.
public class OutputView {

    public void printMessage(String message) {
        System.out.println(message);
    }
}
