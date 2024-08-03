import java.util.*;

public class GreatestFromThree {

    class greatest {
        public static int greaterNumber(int num1, int num2, int num3) {
            int greater = num3;

            if (num1 > num2 && num1 > num3)
                greater = num1;
            else if (num2 > num1 && num2 > num3)
                greater = num2;

            return greater;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();

        System.out.println(greaterNumber(num1, num2, num3));

    }
}
