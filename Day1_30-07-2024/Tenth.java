
import java.util.Scanner;

public class Tenth {

    public static int revNum(int num) {
        int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            revNum = revNum * 10 + rem;
            num = num / 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number : ");
        int num = sc.nextInt();

        if (num < 100 && num > 999) {
            System.out.println("Invalid number");
        } else {
            System.out.println("Reverse number is :" + revNum(num));
        }
    }
}
