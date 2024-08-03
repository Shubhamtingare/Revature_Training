
import java.util.Scanner;

class Op {

    public static void add(int num1, int num2) {
        System.out.println("Addition : " + (num1 + num2));
    }

    public static void sub(int num1, int num2) {
        System.out.println("Subtraction : " + (num1 - num2));
    }

    public static void mul(int num1, int num2) {
        System.out.println("Multiplication : " + (num1 * num2));
    }

    public static void div(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("Division : " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

}

public class Operations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter operation which you want to perform (+, -, *, /): ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                Op.add(num1, num2);
                break;
            case '-':
                Op.sub(num1, num2);
                break;
            case '*':
                Op.mul(num1, num2);
                break;
            case '/':
                Op.div(num1, num2);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }

}
