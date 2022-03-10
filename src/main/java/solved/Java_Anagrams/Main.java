package solved.Java_Anagrams;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input - textA and textB
        String textA = input.nextLine();
        String textB = input.nextLine();
        input.close();

        //Output - is entered texts ia anagram
        AnagramChecker anagramChecker = new AnagramChecker(textA,textB);
        System.out.println(anagramChecker.checkTextIsAnagram());
    }
}
