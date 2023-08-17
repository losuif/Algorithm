package codewars8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmashWordsTest {

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SmashWords.smash(new String[] { "Bilal", "Djaghout" }));
        assertEquals("hello world", SmashWords.smash(new String[] {"hello", "world"}));
        assertEquals("hello amazing world", SmashWords.smash(new String[] {"hello", "amazing", "world"}));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SmashWords.smash(new String[] {}));
    }

    @Test
    public void validateOneWord() {
        assertEquals("Bilal", SmashWords.smash(new String[] {"Bilal"}));
        assertEquals("Test", SmashWords.smash(new String[] {"Test"}));
    }
}