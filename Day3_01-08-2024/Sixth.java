import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[][] = new int[3][3];

        System.out.println("Enter a 2D array elements:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println("Enter a number");
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
}
