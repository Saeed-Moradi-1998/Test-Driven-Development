package org.example;
import org.junit.Test;
import static org.junit.Assert.*;


public class MyStringTest {

    @Test
    public void testIndexOfString() {
        // These are the initial test cases of method named indexOfString.
        // If either of the strings are blank, the output should be -1.
        assertEquals(-1, MyString.indexOfString("world", "", 0));
    }
}