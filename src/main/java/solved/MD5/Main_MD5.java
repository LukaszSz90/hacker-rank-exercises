package solved.MD5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main_MD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        String plaintext = input.nextLine();

        MessageDigest message = MessageDigest.getInstance("MD5");
        message.reset();
        message.update(plaintext.getBytes());
        byte[] digest = message.digest();
        BigInteger bigInt = new BigInteger(1,digest);

        StringBuilder hashText = new StringBuilder(bigInt.toString(16));

        while(hashText.length() < 32 ){
            hashText.insert(0, "0");
        }

        System.out.println(hashText);
    }
}
