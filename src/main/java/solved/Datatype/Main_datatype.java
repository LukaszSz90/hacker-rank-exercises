package solved.Datatype;

import java.util.Scanner;

public class Main_datatype {
//    public static void main(String[] args) {
//        datatype_checker();
//    }
//
//    private static void datatype_checker() {
//        Scanner input = new Scanner(System.in);
//        int numberAmount = input.nextInt();
//
//        String[] tableOfNumbers = new String[numberAmount];
//        tableOfNumbers = fillTable(numberAmount);
//        check(numberAmount, tableOfNumbers);
//    }
//
//    private static String[] fillTable(int loopNumber) {
//        Scanner input = new Scanner(System.in);
//        String[] table = new String[loopNumber];
//
//        for (int i = 0; i < loopNumber; i++) {
//            table[i] = input.nextLine();
//        }
//
//        return table;
//    }
//
//    private static void check(int numberAmount, String[] table) {
//        for (int i = 0; i < numberAmount; i++) {
//
//            switch (dataType(table[i])) {
//                case 1:
//                    System.out.println("*short");
//                case 2:
//                    System.out.println("*int");
//                case 3: {
//                    System.out.println("*long");
//                }
//                break;
//                default:
//                    System.out.println(table[i] + " can't be fitted anywhere.");
//            }
//        }
//
//    }
//
//    private static int dataType(String number) {
//
//        try {
//            long numberToCheck = Long.parseLong(number);
//            System.out.println(number + " can be fitted in:");
//            if (numberToCheck >= -32768 && numberToCheck <= 32767) {
//                return 1;
//            }
//            if (numberToCheck >= -2147483648 && numberToCheck <= 2147483647) {
//                return 2;
//            }
//            if (numberToCheck >= -Math.pow(2, 63) && numberToCheck <= Math.pow(2, 63) - 1) {
//                return 3;
//            }
//        } catch (NumberFormatException e) {
//            return 0;
//        }
//        return 0;
//    }
//
//}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());

        String[] tableOfNumbers = new String[numberAmount];

        for (int i = 0; i < numberAmount; i++) {
            tableOfNumbers[i] = input.nextLine();
        }

        for (int i = 0; i < numberAmount; i++) {

            try {
                long numberToCheck = Long.parseLong(tableOfNumbers[i]);
                System.out.println(tableOfNumbers[i] + " can be fitted in:");
                if (numberToCheck >= -128 && numberToCheck <= 127) {
                    System.out.println("* byte");
                }
                if (numberToCheck >= -32768 && numberToCheck <= 32767) {
                    System.out.println("* short");
                }
                if (numberToCheck >= -2147483648 && numberToCheck <= 2147483647) {
                    System.out.println("* int");
                }
                if (numberToCheck >= -Math.pow(2, 63) && numberToCheck <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }
            }
            catch (NumberFormatException e) {
                System.out.println(tableOfNumbers[i] + " can't be fitted anywhere.");
            }
        }
    }

}
