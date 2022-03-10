package solved.CanYouAccess;


import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        DoNotTerminate.forbidExit();

        try {
            Scanner input = new Scanner(System.in);
            int number = Integer.parseInt(input.nextLine().trim());

            Object o;

            Inner inner = new Inner();
            o = inner.new Private();
            Inner.Private innerPrivate = (Inner.Private) o;
            String response = innerPrivate.powerof2(number);
            System.out.println(number + " is " + response);
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
        } catch (DoNotTerminate.ExitTrappException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

    static class Inner {
        private class Private {
            private String powerof2(int number) {
                return ((number&number-1) == 0) ? "power of 2":"not a power of 2";
            }
        }
    }
}

