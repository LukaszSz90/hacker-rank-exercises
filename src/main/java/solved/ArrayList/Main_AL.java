package solved.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_AL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testNumber = input.nextInt();

        ArrayList<ArrayList<Integer>> mainTable = new ArrayList<>();
        for (int i = 0; i < testNumber; i++) {
            int numberOfValue = input.nextInt();

            ArrayList<Integer> subTable = new ArrayList<>();

            for (int j = 0; j < numberOfValue; j++) {
                subTable.add(input.nextInt());
            }
            mainTable.add(subTable);
        }

        int checkNumber = input.nextInt();

        for (int i = 0; i < checkNumber; i++) {
            try {
                int row = input.nextInt();
                int col = input.nextInt();

                System.out.println(mainTable.get(row-1).get(col-1));

            } catch (IndexOutOfBoundsException iboe) {
                System.out.println("ERROR!");
            }
        }
        input.close();

    }
}
