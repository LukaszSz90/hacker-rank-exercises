package solved.BigDecimalExercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main_BigDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfTest = Integer.parseInt(input.nextLine());
        String[] table = new String[numberOfTest];

        for (int i = 0; i < numberOfTest; i++) {
            table[i] = input.nextLine();
        }
        input.close();

        for (int i = 0; i < numberOfTest; i++) {
            for (int j = i; j > 0 ; j--) {
                if(new BigDecimal(table[j]).compareTo(new BigDecimal(table[j-1])) > 0){
                    String temp = table[j];
                    table[j] = table[j-1];
                    table[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }

        for (int i = 0; i < numberOfTest; i++) {
            System.out.println(table[i]);
        }
    }
}
