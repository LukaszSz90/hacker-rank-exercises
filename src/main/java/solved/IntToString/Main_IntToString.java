package solved.IntToString;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_IntToString {
    public static void main(String[] args) {
        int number;
        String convertedInt;

        try {
            Scanner input = new Scanner(System.in);
            number = input.nextInt();

            if (number >= -100 && number <= 100) {
                convertedInt = number + "";
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        }
        catch(InputMismatchException ex) {
            System.out.println("Wrong answer");
        }

    }
}
