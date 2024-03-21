package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedSequenceTest {

    @Test
    public void reverseTest() {
        var text = "abcdef";
        var expected = 'a';
        var actual = new ReversedSequence(text);

        assertEquals(expected, actual.charAt(actual.length() - 1));
    }
}