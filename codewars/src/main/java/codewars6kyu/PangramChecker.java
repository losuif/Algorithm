package codewars6kyu;

// https://www.codewars.com/kata/545cedaa9943f7fe7b000048/java
// Detect Pangram

/*  A pangram is a sentence that contains every single letter of the alphabet at least once.
    For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
    because it uses the letters A-Z at least once (case is irrelevant).
    Given a string, detect whether or not it is a pangram.
    Return True if it is, False if not. Ignore numbers and punctuation. */

public class PangramChecker {

    public boolean check(String sentence) {

        boolean answer = false;
        String temp = "";

        sentence = sentence.toUpperCase();

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) >= 65 && sentence.charAt(i) <= 90) {
                if (i == sentence.indexOf(sentence.charAt(i))) {
                    temp += sentence.charAt(i);
                } else continue;
            }
        }

        if (temp.length() == 26) answer = true;

        return answer;
    }
}
