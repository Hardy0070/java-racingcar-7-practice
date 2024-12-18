package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    Car car = new Car();

    @DisplayName("문자열에 moveCount수만큼 -를 추가한다.")
    @Test
    void convertMoveCountTest() {
        int moveCount = 4;

        String carMove = car.convertMoveCount(moveCount);

        Assertions.assertThat(carMove).isEqualTo("----");
        System.out.println("carMove = " + carMove);
    }

}
