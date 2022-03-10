package solved.PrimalityTest;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_Primary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger bigInteger = new BigInteger(input.nextLine());
        boolean result = bigInteger.isProbablePrime(1);

        if (result) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
