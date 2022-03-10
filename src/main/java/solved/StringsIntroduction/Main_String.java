package solved.StringsIntroduction;

import java.util.Scanner;

public class Main_String {
    public static void main(String[] args) {
        String a;
        String b;

        Scanner input = new Scanner(System.in);

        a = input.nextLine();
        b = input.nextLine();

        int sumOfString = a.length() + b.length();
        System.out.println(sumOfString);
        //-----------------------------------------------------------------
        if(a.compareTo(b) > 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        //-----------------------------------------------------------------
        String[] aTab = a.split("");
        String[] bTab = b.split("");
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < aTab.length; i++) {
            if(i != 0) {
                text.append(aTab[i]);
            }
            else {
                text.append(aTab[i].toUpperCase());
            }
        }
        text.append(" ");
        for (int i = 0; i < bTab.length; i++) {
            if(i != 0) {
                text.append(bTab[i]);
            }
            else {
                text.append(bTab[i].toUpperCase());
            }
        }

        System.out.println(text.toString());
    }
}
