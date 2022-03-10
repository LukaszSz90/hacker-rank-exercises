package solvedTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solved.Java_Anagrams.AnagramChecker;




public class AnagramCheckerTest {

    @Test
    void should_textA_and_textB_is_anagram() {
        String textA = "anagram";
        String textB = "margana";

        AnagramChecker anagramChecker = new AnagramChecker(textA,textB);

        boolean result = anagramChecker.isAnagram(textA.toLowerCase(),textB.toLowerCase());

        Assertions.assertTrue(result);
    }

    @Test
    void should_textA_and_textB_is_not_anagram(){
        String textA = "hello";
        String textB = "welcome";

        AnagramChecker anagramChecker = new AnagramChecker(textA,textB);

        boolean result = anagramChecker.isAnagram(textA.toLowerCase(),textB.toLowerCase());

        Assertions.assertFalse(result);
    }

    @Test
    void should_textA_is_null() {
        String textA = null;
        String textB = "anagram";

        AnagramChecker anagramChecker = new AnagramChecker(textA,textB);

        boolean result = anagramChecker.isAnagram(textA,textB);

        Assertions.assertFalse(result);
    }
}
