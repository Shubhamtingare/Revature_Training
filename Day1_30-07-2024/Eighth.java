import java.util.Scanner;

public class Eighth {

    public static int calSum(int num) {
        int lastDigit = num % 10;
        num = num / 10;

        int secondLast = num % 10;
        num = num / 1000;

        int firstDigit = num;

        return secondLast + firstDigit;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a five digit number : ");
        int num = sc.nextInt();

        if (num >= 10000 && num <= 99999) {
            System.out.println("Sum of the first and second last digits is: " + calSum(num));
        } else {
            System.out.println("The number entered is not a five-digit number.");
        }
    }
}
