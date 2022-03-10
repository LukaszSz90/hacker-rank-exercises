package solved.Java_Anagrams;

import java.util.Arrays;

public class AnagramChecker {

    private String textA;
    private String textB;

    public AnagramChecker(String textA, String textB) {
        this.textA = textA;
        this.textB = textB;
    }

    public String checkTextIsAnagram() {
        if (isAnagram(textA.toLowerCase(), textB.toLowerCase())) {
            return "Anagrams";
        }

        return "Not Anagrams";
    }


    public boolean isAnagram(String value1, String value2) {

        try {
            String[] splitA = value1.split("");
            String[] splitB = value2.split("");

            Arrays.sort(splitA);
            Arrays.sort(splitB);

            if (value1.length() != value2.length()) {
                return false;
            }

            for (int i = 0; i < splitA.length; i++) {
                if (!splitA[i].equals(splitB[i])) {
                    return false;
                }
            }
            return true;
        }
        catch (NullPointerException npe) {
            return false;
        }

    }
}
