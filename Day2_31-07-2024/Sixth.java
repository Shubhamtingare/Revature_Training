import java.util.ArrayList;
import java.util.Scanner;

public class Sixth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String input;
        int sum = 0;
        int product = 1;

        while (true) {
            System.out.print("Enter a number(press 'q' to quit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
                sum += number;
                product *= number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }

        if (numbers.size() > 0) {
            double average = (double) sum / numbers.size();
            System.out.println("Average of entered numbers: " + average);
            System.out.println("Product of entered numbers: " + product);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}
