import java.util.Scanner;

public class Second {
    public static String searchNumbersFromArray(int[] numbers, int num) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                return "Number is present in array";
            }
        }
        return "Not found in array";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers :");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter number to search in array:");
        int num = sc.nextInt();

        System.out.println(searchNumbersFromArray(numbers, num));
    }
}