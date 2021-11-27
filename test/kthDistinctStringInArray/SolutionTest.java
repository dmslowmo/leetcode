package kthDistinctStringInArray;

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
                Arguments.of(new String[]{"d","b","c","b","c","a"}, 2, "a"),
                Arguments.of(new String[]{"aaa","aa","a"}, 1, "aaa")
        );
    }
    @ParameterizedTest
    @DisplayName("Test on kth distinct string in an array")
    @MethodSource("kthDistinctStringInArray.SolutionTest#happyPathParams")
    public void test(String[] arr, int k, String expected) {
        Assert.assertEquals(expected, solution.kthDistinct(arr, k));
    }
}
