package solved.UsernameRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_Username {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());

        String regex = "^[aA-zZ]\\w{7,29}$";
                //"^[aA-zZ]+[aA-zZ0-9_]{7,29}$";
                //
        Pattern pattern = Pattern.compile(regex);

        while(number-- > 0) {
            String username = input.nextLine();
            Matcher matcher = pattern.matcher(username);

            if (username.length() >= 8 && username.length() <= 30){
                if(username.charAt(0) == '_'){
                    System.out.println("Invalid");
                }
                if(matcher.find()) {
                    System.out.println("Valid");
                }
                else {
                    System.out.println("Invalid");
                }
            }
            else {
                System.out.println("Invalid");
            }

        }
    }
}
