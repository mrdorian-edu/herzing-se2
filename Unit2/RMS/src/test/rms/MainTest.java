package rms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    // basic common test
    @Test
    void testNumber() {
        Main tester = new Main();
        int result = tester.addNumber(5, 7);
        assertEquals(7, result);
    }

    // nudge edge case
    @Test
    void NullTest() {
        assertNull("Verify that object is null");
    }

    // edge case of input
    @Test
    void breakLongWords_EdgeCase() {
        boolean safeString = rms.Main.StringProcessor.stringLengthIsSafe("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        assertTrue(safeString);
    }


}