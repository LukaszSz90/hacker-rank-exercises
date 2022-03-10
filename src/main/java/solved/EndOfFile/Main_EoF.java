package solved.EndOfFile;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_EoF {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
        List<String> text = new ArrayList<>();


      while (input.hasNext()) {
          String s = input.nextLine();
          text.add(s);
          int size = s.length()-1;
          if (s.charAt(size) == '.'){
              break;
          }
      }

        for (int i = 0; i < text.size(); i++) {
            System.out.println((i+1) + " " + text.get(i));
        }
    }
}
