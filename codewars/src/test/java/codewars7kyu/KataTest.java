package codewars7kyu;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", Kata.reverseWords("apple"));
        assertEquals("a b c d", Kata.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", Kata.reverseWords("double  spaced  words"));
    }

    @Test
    public void allSpaces(){
        assertEquals("   ", Kata.reverseWords("   "));
    }

    @Test
    public void singleLetter(){
        assertEquals("a", Kata.reverseWords("a"));
    }

    @Test
    public void emptyString(){
        assertEquals("", Kata.reverseWords(""));
    }

    @Test
    public void multipleSentences(){
        assertEquals("sihT si eht tsrif .ecnetnes  sihT si eht .dnoces", Kata.reverseWords("This is the first sentence.  This is the second."));
    }

    private static final String[] originals = new String[]{"Kata", "should", "always", "have", "random", "tests", "case", "to", "avoid", "hardocoded", "solution.", "This", "is", "a", "rule!"};
    private static final String[] reversed = new String[]{"ataK", "dluohs", "syawla", "evah", "modnar", "stset", "esac", "ot", "diova", "dedocodrah", ".noitulos", "sihT", "si", "a", "!elur"};

    @Test
    public void randomTest(){
        final StringBuilder input = new StringBuilder();
        final StringBuilder output = new StringBuilder();

        final Random generator = new Random();
        final int numberOfTests = 50;
        final int wordsPerTest = 25;

        for (int x = 0; x < numberOfTests; x++)
        {
            runSingleRandomTest(input, output, wordsPerTest, generator);
        }
    }

    private void runSingleRandomTest(final StringBuilder input, final StringBuilder output,
                                     final int wordsPerTest, final Random generator)
    {
        input.setLength(0);
        output.setLength(0);

        for (int y = 0; y < wordsPerTest; y++)
        {
            if (y != 0)
            {
                addSpaces(input, output, generator);
            }

            final int wordIndex = generator.nextInt(originals.length);

            input.append(originals[wordIndex]);
            output.append(reversed[wordIndex]);
        }

        assertEquals(output.toString(), Kata.reverseWords(input.toString()));
    }

    private void addSpaces(final StringBuilder input, final StringBuilder output, final Random generator)
    {
        final int numberSpaces = generator.nextInt(3) + 1;

        for (int z = 0; z < numberSpaces; z++)
        {
            input.append(' ');
            output.append(' ');
        }
    }
}