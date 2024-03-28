package org.example;

public class MyString {

    public static int indexOfString(String s1, String s2, int pos) {
        // Check if either s1 or s2 is null or empty
        if (s1.isEmpty() || s2.isEmpty()) {
            return -1;
        }

        // Iterate through s1 starting from pos
        for (int i = pos; i <= s1.length() - s2.length(); i++) {
            // Check if s2 matches the substring of s1 starting at i
            boolean found = true;
            for (int j = 0; j < s2.length(); j++) { // Iterating through all the characters of s2
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    found = false; // If there is a mismatch between any of the characters of s1 and s2,
                    // we can jump to the next set of characters.
                    break;
                }
            }
            // If s2 is found starting at index i, return i
            if (found) {
                return i;
            }
        }

        // If s2 is not found in s1, return -1
        return -1;
    }

    public static String replace(String s, String s1, String s2) {

        if (s == null){ // Checking if s in null
            return null;
        }
        if (s1 == null){ // Checking if s1 in null
            return null;
        }
        if (s2 == null){ // Checking if s2 in null
            return null;
        }

        return ""; // This is the initial implementation of the method which returns empty string.
    }

}