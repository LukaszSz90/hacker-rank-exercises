package solved.SyntaxChecker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main_Checker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        while (number > 0) {
            try {
                Pattern.compile(input.nextLine());
                System.out.println("Valid");
            } catch (PatternSyntaxException ex) {
                System.out.println("Invalid");
            }
            number--;
        }
    }
}

