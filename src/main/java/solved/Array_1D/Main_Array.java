package solved.Array_1D;

import java.util.Scanner;
import java.util.Stack;

public class Main_Array {




    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt();
            while (q-- > 0) {
                int n = scan.nextInt();
                int leap = scan.nextInt();

                int[] game = new int[n];
                for (int i = 0; i < n; i++) {
                    game[i] = scan.nextInt();
                }

                System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
            }
            scan.close();
    }

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;

        Stack<Integer> potencialIndexes = new Stack<>();
        potencialIndexes.push(0);

        while (!potencialIndexes.isEmpty()) {
            int i = potencialIndexes.pop();

            if(i >= n) return true;

            if (i < 0 || game[i] == 1) continue;

            game[i] = 1;
            potencialIndexes.push(i+1);
            potencialIndexes.push(i-1);
            potencialIndexes.push(i+leap);
        }

        return false;

    }
}
