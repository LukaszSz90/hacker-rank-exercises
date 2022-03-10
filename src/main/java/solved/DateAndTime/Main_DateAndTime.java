package solved.DateAndTime;

import solved.DateAndTime.Result;

import java.util.Scanner;

public class Main_DateAndTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userData = input.nextLine();

        String[] firstMultipleInput = userData.split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        System.out.println(res);
    }
}

