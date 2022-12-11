import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber, i, star, space;
        char symbol = '*';

        System.out.print("How many lines to print the stars?: ");
        lineNumber = scanner.nextInt();

        /*
                  *
                 ***
                *****
               *******
              *********
         */

        for (i = 0; i < lineNumber; i++) {
            for (space = 1; space < lineNumber - i; space++) {
                System.out.print(" ");
            }
            for (star = 1; star <= 1 + (2 * i); star++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}


