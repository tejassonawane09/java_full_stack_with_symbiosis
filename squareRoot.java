import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate the square root
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of " + number + " is: " + squareRoot);
    }
}
