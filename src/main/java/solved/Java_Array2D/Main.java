package solved.Java_Array2D;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        final int x_row = 6;
        final int y_column = 6;
        int[][] table = new int[x_row][y_column];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < x_row; i++) {
            for (int j = 0; j < y_column; j++) {
                table[i][j] = input.nextInt();
            }
        }

        int max_value = getSum(1,1, table);;
        int temp;

        for (int i = 1; i < x_row-1; i++) {
            for (int j = 1; j < y_column-1; j++) {
                temp = getSum(i,j, table);
                if(temp > max_value){
                    max_value = temp;
                }
            }
        }
        System.out.println(max_value);
    }

    private static int getSum(int i, int j, int[][] table) {
        int sum = 0;

        //top
        sum += table[i-1][j-1];
        sum += table[i-1][j];
        sum += table[i-1][j+1];

        //middle
        sum += table[i][j];

        //botton
        sum += table[i+1][j-1];
        sum += table[i+1][j];
        sum += table[i+1][j+1];
        return sum;
    }
}
