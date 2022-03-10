package solved.Substring_Comparition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_SubCompar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        int number = input.nextInt();


        List<String> textSubstring = new ArrayList<>();

        for (int i = 0; i <= text.length()-number; i++) {
            textSubstring.add(text.substring(i,i+number));
        }

        String smallest = textSubstring.get(0);;
        String largest= textSubstring.get(0);

        for (int i = 0; i < textSubstring.size(); i++) {
            if(i != 0) {
                if (smallest.compareTo(textSubstring.get(i)) > 0) {
                    smallest = textSubstring.get(i);
                }
                if (largest.compareTo(textSubstring.get(i)) < 0) {
                    largest = textSubstring.get(i);
                }
            }
        }
        System.out.println(smallest);
        System.out.println(largest);

    }
}
