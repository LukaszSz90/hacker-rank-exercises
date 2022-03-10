package solved.StringReverse;

import java.util.Scanner;

public class Main_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        if (isPalinfrom(text.toLowerCase())) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    private static boolean isPalinfrom(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
