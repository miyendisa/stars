import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineNumber, i, space, star;
        char symbol = '*';

        System.out.print("Enter a number to print the diamond: ");
        lineNumber = scanner.nextInt();

        for (i = 0; i < lineNumber; i++) {
            for (space = 1; space < lineNumber - i; space++) {
                System.out.print(" ");
            }
            for (star = 1; star <= (2 * i) + 1; star++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        for (i = 1; i <= lineNumber - 1; i++) {
            for (space = 1; space <= i; space++) {
                System.out.print(" ");
            }
            for (star = 1; star <= 2 * (lineNumber - i) - 1; star++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }


}
