package org.example;
import org.junit.Test;
import static org.junit.Assert.*;


public class MyStringTest {

    @Test
    public void testIndexOfString() {
        // These are the initial test cases of method named indexOfString.
        // If either of the strings are blank, the output should be -1.
        assertEquals(-1, MyString.indexOfString("world", "", 0));
        assertEquals(-1, MyString.indexOfString("", "world", 0));
        // This test checks if s2 can be found in s1.
        assertEquals(6, MyString.indexOfString("hello world", "world", 0));
    }

    @Test
    public void testReplace() { // Testing the method replace.

        // These test cases are for checking the output if either of the strings are null.
        assertEquals(null,MyString.replace(null, "hello", "world"));
    }
}