package oop.example.Ex24.base;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        } else {
            char[] string1CharArray = string1.toCharArray();
            char[] string2CharArray = string1.toCharArray();
            Arrays.sort(string1CharArray);
            Arrays.sort(string2CharArray);
            return Arrays.equals(string1CharArray,string2CharArray);
        }

    }
}
