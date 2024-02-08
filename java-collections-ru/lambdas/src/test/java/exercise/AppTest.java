package exercise;

import org.junit.jupiter.api.Test;

import static exercise.App.enlargeArrayImage;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;

// BEGIN
class AppTest {
    private String[][] image = {
            {"*", "*", "*", "*"},
            {"*", " ", " ", "*"},
            {"*", " ", " ", "*"},
            {"*", "*", "*", "*"},
    };

    private String [][] image2 = {};

    @Test
    public void right() {
        String[][] actual = enlargeArrayImage(image);
        String[][] expected = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        assertThat(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void wrong1() {
        String[][] actual = enlargeArrayImage(image2);
        String[][] expected = {};
        assertThat(Arrays.deepEquals(expected, actual));
    }
}
// END
