package queriesOnPermutationWithKey;

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
    void setup() {
        solution = new Solution();
    }

    public static Stream<Arguments> happyPathParams() {
        return Stream.of(
                Arguments.of(new int[]{3,1,2,1}, 5, new int[]{2,1,2,1}),
                Arguments.of(new int[]{4,1,2,2}, 4, new int[]{3,1,2,0}),
                Arguments.of(new int[]{7,5,5,8,3}, 8, new int[]{6,5,0,7,5})
        );
    }
    @ParameterizedTest
    @DisplayName("Queries on Permutation with Key happy path")
    @MethodSource("queriesOnPermutationWithKey.SolutionTest#happyPathParams")
    void test(int[] queries, int m, int[] expected) {
        var result = solution.processQueries(queries,m);
        Assert.assertArrayEquals(expected, result);
    }
}
