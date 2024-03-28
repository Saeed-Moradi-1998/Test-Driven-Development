package org.example;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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

//    @Test
//    public void testReplace() { // Testing the method replace.
//
//        // These test cases are for checking the output if either of the strings are null.
//        assertEquals(null,MyString.replace(null, "hello", "world"));
//        assertEquals(null,MyString.replace("hello world", null, "world"));
//        assertEquals(null,MyString.replace("hello world", "hello", null));
//
//        // This test case checks the output when s1 is empty.
//        assertEquals("world",MyString.replace("hello world", "", "world"));
//
//        // This test cae checks s2 can be replaced with s1 in s.
//        assertEquals("Hello Saeed",MyString.replace("Hello world", "world", "Saeed"));
//    }

    @Test
    public void testReplaceWithMocking(){
        // This test method creates an instance of the mocked class MyString and pass the index to the method replace.

        MyString myString = mock(MyString.class); // Instantiate an object by mocking the class MyString
        int index = myString.indexOfString("Life is Great", "hello", 3); // Finding the index of occurrence of s2 in s1.

        Assert.assertEquals("Life is Great", myString.replace("Life is Great", "is", "was", index));
        // Testing if the expected output of the method replace is correct given the index found by the method indexOfString
    }

}