package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RaceTest {

    @DisplayName("자동차 이름 출력해보기")
    @Test
    void printCarName() {
        Race race = new Race();

        race.oneRace();
    }

}
