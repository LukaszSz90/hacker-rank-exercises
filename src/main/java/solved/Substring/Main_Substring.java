package solved.Substring;

import java.util.Scanner;

public class Main_Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        int start = input.nextInt();
        int end = input.nextInt();

        System.out.println(text.substring(start,end));
    }
}
