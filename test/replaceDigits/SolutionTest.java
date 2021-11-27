package replaceDigits;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest {
    Solution solution;

    @BeforeEach
    private void setup() {
        solution = new Solution();
    }

    public static Stream<Arguments> happyPathParams() {
        return Stream.of(
                Arguments.of("a1c1e1", "abcdef"),
                Arguments.of("a1b2c3d4e", "abbdcfdhe")
        );
    }
    @ParameterizedTest
    @DisplayName("Test on replaceDigits")
    @MethodSource("replaceDigits.SolutionTest#happyPathParams")
    public void test(String s, String expected) {
        Assert.assertEquals(expected, solution.replaceDigits(s));
    }
}
