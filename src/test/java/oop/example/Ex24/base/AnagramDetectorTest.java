package oop.example.Ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_anagrams_set1() {

        //Given
        AnagramDetector detector = new AnagramDetector();

        //When
        boolean actual = detector.isAnagram("note", "note");
        boolean expected = true;
        assertEquals(expected, actual);

    }
    @Test
    void isAnagram_returns_true_for_anagrams_set2() {

        //Given
        AnagramDetector detector = new AnagramDetector();

        //When
        boolean actual = detector.isAnagram("racecar", "carrace");
        boolean expected = true;
        assertEquals(expected, actual);

    }
    @Test
    void isAngram_returns_false_for_non_angrams_set1(){

        //Given
        AnagramDetector detector = new AnagramDetector();

        //When
        boolean actual = detector.isAnagram("not", "note");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void isAngram_returns_false_for_non_angrams_set2(){

        //Given
        AnagramDetector detector = new AnagramDetector();

        //When
        boolean actual = detector.isAnagram("book", "books");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void isAngram_returns_false_for_non_angrams_set3(){

        //Given
        AnagramDetector detector = new AnagramDetector();

        //When
        boolean actual = detector.isAnagram("string", "sting");
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
