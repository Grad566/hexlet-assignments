package exercise;

import static exercise.App.take;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        var actual = take(numbers1, 2);
        var expected = new ArrayList<>(Arrays.asList(1, 2));
        assertEquals(expected, actual);

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        var actual2 = take(numbers2, 8);
        var expected2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(expected2, actual2);
        // END
    }
}
