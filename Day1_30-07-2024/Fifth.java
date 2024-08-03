import java.util.*;

public class Fifth {
    public static void swapWithVar(int a, int b) {
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("swapped values of a and b respectively : " + a + " " + b);
    }

    public static void swapWithoutVar(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("swapped values of a and b respectively : " + a + " " + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        swapWithVar(a, b);
        swapWithoutVar(a, b);
    }
}
