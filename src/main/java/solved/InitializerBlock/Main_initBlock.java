package solved.InitializerBlock;

import java.util.Scanner;

public class Main_initBlock {

    public static void main(String[] args) {
        boolean flag = true;

        Scanner input = new Scanner(System.in);
        int B = input.nextInt();
        int H = input.nextInt();

        if (H <= 0 || B <= 0) {
            flag = false;
        }

        if (flag) {
            int area = B * H;
            System.out.print(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        input.close();
    }
}
