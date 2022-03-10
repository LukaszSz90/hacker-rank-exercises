package solved.Token;

import java.util.Scanner;

public class Main_Token {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        input.close();

        String reg = "(\\.+\\s*)|(\\?+\\s*)|('\\s*)|(,+\\s*)|(!+\\s*)|(\\s+)|(\\$\\s*)|(@\\s*)|(_\\s*)";

        String[] tokenText = text.split(reg);

        if(tokenText.length == 0) {
            System.out.println(0);
        }
        else {
            if (tokenText[0].equals("")) {

                String[] newText = new String[tokenText.length - 1];
                for (int i = 1; i < tokenText.length; i++) {
                    newText[i - 1] = tokenText[i];
                }
                System.out.println(newText.length);
                for (int i = 0; i < newText.length; i++) {
                    System.out.println(newText[i]);
                }
            } else {
                System.out.println(tokenText.length);
                for (int i = 0; i < tokenText.length; i++) {
                    System.out.println(tokenText[i]);
                }
            }
        }
    }
}
