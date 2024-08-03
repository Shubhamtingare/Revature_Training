import java.util.Scanner;

public class First {
    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers :");

        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        printArray(numbers);
    }
}