package solved.IPRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_IPChecker {
    public static void main(String[] args) {
        Scanner inputIp = new Scanner(System.in);

        while(inputIp.hasNext()){
        String myIp = inputIp.nextLine();

        Pattern pattern = Pattern.compile("(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\." +
                "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\." +
                "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\." +
                "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])");


        Matcher matcher = pattern.matcher(myIp);
        if (matcher.matches()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    }
}

//        000.12.12.034
//        121.234.12.12
//        23.45.12.56