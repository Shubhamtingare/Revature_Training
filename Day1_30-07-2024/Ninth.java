import java.util.Scanner;

public class Ninth {

    public static int calSum(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number : ");
        int num = sc.nextInt();

        if (num < 100 && num > 999) {
            System.out.println("Invalid number");
        } else {
            System.out.println("sum is :" + calSum(num));
        }
    }
}
