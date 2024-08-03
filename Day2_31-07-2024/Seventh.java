import java.util.Scanner;

public class Seventh {

    public static int findGcd(int num1, int num2) {
        int temp = num2;
        if (num1 < num2)
            temp = num1;

        for (int i = temp; i > 0; i--) {
            if (num1 % i == 0) {
                if (num2 % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = sc.nextInt();

        System.out.println(findGcd(num1, num2));
    }
}
