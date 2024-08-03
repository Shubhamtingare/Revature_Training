import java.util.Scanner;

public class Fourth {

    public static void reverseArray(int numbers[]) {
        int newArray[] = new int[10];

        for (int i = newArray.length - 1; i >= 0; i--) {
            newArray[i] = numbers[numbers.length - 1 - i];
        }
        for (int i : newArray) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        reverseArray(numbers);

    }
}
