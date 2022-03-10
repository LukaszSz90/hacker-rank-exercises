package solved.Java_Array2D;

import java.util.Scanner;

public class Main_SubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countOfNumber = input.nextInt();
        int[] number = new int[countOfNumber];

        for (int i = 0; i < countOfNumber; i++) {
            number[i] = input.nextInt();
        }

        System.out.println(countingMinus(countOfNumber, number));

    }


    public static int countingMinus(int number, int[] value) {
        int countMinusValue = 0;

        for (int i = 0; i < number; i++) {
            int sum = value[i];
            if (value[i] < 0) {
                countMinusValue++;
            }

            for (int j = i+1; j < number; j++) {
                sum += value[j];
                if(sum < 0){
                    countMinusValue++;
                }
            }

        }
        return countMinusValue;
    }
}
