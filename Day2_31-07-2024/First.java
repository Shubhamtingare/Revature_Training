import java.util.Scanner;

public class First {

    public static boolean checkSquare(int len, int bre) {
        return (len == bre) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length");
        int length = sc.nextInt();

        System.out.println("Enter breadth");
        int breadth = sc.nextInt();

        System.out.println(checkSquare(length, breadth));

    }
}