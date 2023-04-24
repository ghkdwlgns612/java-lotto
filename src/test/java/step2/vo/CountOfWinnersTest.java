package step2.vo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class CountOfWinnersTest {

    private static final int DEFAULT_NUM_OF_TICKET = 10;

    @ParameterizedTest()
    @MethodSource("provideMatchingCounts")
    void calculateRateOfReturn_수익율_계산(CountOfWinners countOfWinners, double expected) {
        double result = countOfWinners.calculateRateOfReturn(DEFAULT_NUM_OF_TICKET);
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> provideMatchingCounts() {
        return Stream.of(
                Arguments.arguments(CountOfWinnersFixture._3개_일치_4장(), 2.0),
                Arguments.arguments(CountOfWinnersFixture._4개_일치_4장(), 20.0),
                Arguments.arguments(CountOfWinnersFixture._3개_일치_1장_4개_일치_1장(), 5.0)
        );
    }
}
