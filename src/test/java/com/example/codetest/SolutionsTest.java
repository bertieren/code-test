package com.example.codetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionsTest {

    private Solutions solutions;

    @BeforeEach
    public void beforeEach() {
        solutions = new Solutions();
    }

    @Test
    void testRemoveDuplicateCharactersOnHappyFlow() {
        String character = solutions.removeDuplicateCharacters("aabcccbbad");
        Assertions.assertEquals("d", character);

        String character1 = solutions.removeDuplicateCharacters("aabcccbbadd");
        Assertions.assertEquals("dd", character1);

        String character2 = solutions.removeDuplicateCharacters("aabcccbbaddd");
        Assertions.assertEquals("", character2);


        String character3 = solutions.removeDuplicateCharacters("a");
        Assertions.assertEquals("a", character3);

        String character4 = solutions.removeDuplicateCharacters("aa");
        Assertions.assertEquals("aa", character4);

        String character5 = solutions.removeDuplicateCharacters("aaa");
        Assertions.assertEquals("", character5);
    }

    @Test
    void testRemoveDuplicateCharactersWhenInputIsNullOrBlank() {
        String character = solutions.removeDuplicateCharacters(null);
        Assertions.assertNull(character);

        String character1 = solutions.removeDuplicateCharacters("");
        Assertions.assertNull(character1);

        String character2 = solutions.removeDuplicateCharacters("  ");
        Assertions.assertNull(character2);
    }

    @Test
    void testReplaceDuplicateCharactersOnHappyFlow() {
        String character = solutions.replaceDuplicateCharacters("abcccbad");
        Assertions.assertEquals("d", character);

        String character1 = solutions.replaceDuplicateCharacters("abcccbadd");
        Assertions.assertEquals("dd", character1);

        String character2 = solutions.replaceDuplicateCharacters("abcccbaddd");
        Assertions.assertEquals("c", character2);

        String character3 = solutions.replaceDuplicateCharacters("abcccbadddc");
        Assertions.assertEquals("cc", character3);


        String character4 = solutions.replaceDuplicateCharacters("a");
        Assertions.assertEquals("a", character4);

        String character5 = solutions.replaceDuplicateCharacters("aa");
        Assertions.assertEquals("aa", character5);

        String character6 = solutions.replaceDuplicateCharacters("bbb");
        Assertions.assertEquals("a", character6);
    }

    @Test
    void testReplaceDuplicateCharactersWhenInputIsNullOrBlank() {
        String nullStr = null;
        String character = solutions.replaceDuplicateCharacters(nullStr);
        Assertions.assertNull(character);

        String character1 = solutions.replaceDuplicateCharacters("");
        Assertions.assertNull(character1);

        String character2 = solutions.replaceDuplicateCharacters("  ");
        Assertions.assertNull(character2);
    }
}
