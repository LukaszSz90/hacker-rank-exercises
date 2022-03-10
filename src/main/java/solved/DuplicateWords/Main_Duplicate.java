package solved.DuplicateWords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_Duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int round = Integer.parseInt(input.nextLine());

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        String[] tableText = new String[round];
        int count = 0;

        while (count < round) {
            String text = input.nextLine();
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                text = text.replaceAll(matcher.group(), matcher.group(1));
            }
            tableText[count] = text;
            count++;
        }

        for (int i = 0; i < round; i++) {
            System.out.println(tableText[i]);
        }

    }

// -----------------------result by HackerRank----------------------
//    public static void main(String[] args) {
//
//        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
//        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//
//        Scanner in = new Scanner(System.in);
//        int numSentences = Integer.parseInt(in.nextLine());
//
//        while (numSentences-- > 0) {
//            String input = in.nextLine();
//
//            Matcher m = p.matcher(input);
//
//            // Check for subsequences of input that match the compiled pattern
//            while (m.find()) {
//                input = input.replaceAll(m.group(), m.group(1));
//            }
//
//            // Prints the modified sentence.
//            System.out.println(input);
//        }
//
//        in.close();
//    }

}
