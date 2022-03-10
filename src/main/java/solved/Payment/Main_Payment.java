package solved.Payment;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main_Payment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

    }
}

//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        String userInput = input.nextLine();
//
//        double value = Double.parseDouble(userInput);
//
//        double value_100 = value * 100;
//        double value_round = Math.round(value_100);
//        double payment = value_round / 100;
//
//        String[][] countryLocale = {
//                {"en", "US", "US: $%s%n"},
//                {"en", "IN","India: %c%s%n"},
//                {"zh", "CN","China: %c%s%n"},
//                {"fr", "FR","France: %s %c%n"}};
//
//        char euro = 8364;
//        char yengi = 0x00A5;
//        char rupee = 0x20B9;
//
//        for (String[] strings : countryLocale) {
//            String paymentFormatted = formattedPayment(strings[0], strings[1], payment);
//            if (!checkDot(paymentFormatted, strings[0])) {
//                paymentFormatted += ".00";
//            }
//
//            if(strings[1].equals("CN")) {
//                System.out.printf(strings[2],yengi, paymentFormatted);
//            }
//            else if(strings[1].equals("FR")){
//                System.out.printf(strings[2], paymentFormatted, euro);
//            }
//            else if(strings[1].equals("IN")){
//                System.out.printf(strings[2],rupee, paymentFormatted);
//            }
//            else {
//                System.out.printf(strings[2], paymentFormatted);
//            }
//        }
//    }
//
//
//    private static boolean checkDot(String paymentFormatted, String s) {
//
//        String[] checkSingleSign = paymentFormatted.split("");
//        for (String value : checkSingleSign) {
//            if (!s.equals("fr")) {
//                if (value.equals(".")) {
//                    return true;
//                }
//            } else {
//                if (value.equals(",")) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    private static String formattedPayment(String s, String s1, double payment) {
//        Locale usLocale = new Locale(s, s1);
//        NumberFormat nf = NumberFormat.getInstance(usLocale);
//
//        return nf.format(payment);
//    }





