package solved.ContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_Extractor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());
        String regex = "<(.+?)>([^<>]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        while (number-- > 0) {
            String context = input.nextLine();

            Matcher matcher = pattern.matcher(context);
            boolean matchFound = false;

            while(matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if(!matchFound) {
                System.out.println("None");
            }

        }
    }
}
