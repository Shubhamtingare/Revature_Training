import java.util.Scanner;

public class Fifth {

    public static int sumArray(int numbers[]) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    public static int productArray(int numbers[]) {
        int product = 1;
        for (int i : numbers) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println(sumArray(numbers));
        System.out.println(productArray(numbers));
    }
}
