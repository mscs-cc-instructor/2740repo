import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValuesTest {
    Values values = null;

    @BeforeEach
    void setUp() {
        this.values = new Values();
    }

    @Test
    void sumCountWhile() {
        assertEquals(55, values.sumCountWhile());
    }

    @Test
    void sumCountDoWhile() {
        assertEquals(55, values.sumCountDoWhile());
    }

    @Test
    void sumCountFor() {
        assertEquals(55, values.sumCountFor());
    }

    @Test
    void sumValuesWhile() {
        assertEquals(815, values.sumCountValuesWhile());
    }

    @Test
    void sumValuesDoWhile() {
        assertEquals(815, values.sumCountValuesDoWhile());
    }

    @Test
    void sumValuesFor() {
        assertEquals(815, values.sumCountValuesFor());
    }

    @Test
    void sumValuesWhileB() {
        assertEquals(658, values.sumFilteredValuesWhile());
    }

    @Test
    void sumValuesDoWhileB() {
        assertEquals(658, values.sumFilteredValuesDoWhile());
    }

    @Test
    void sumValuesForB() {
        assertEquals(658, values.sumFilteredValuesFor());
    }
}