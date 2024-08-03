import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Third {
    public static List<Integer> positiveNumbersFromArray(int[] numbers) {
        List<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                l1.add(numbers[i]);
            }
        }
        return l1;
    }

    public static List<Integer> NegativeNumbersFromArray(int[] numbers) {
        List<Integer> l2 = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                l2.add(numbers[i]);
            }
        }
        return l2;
    }

    public static List<Integer> oddNumbersFromArray(int[] numbers) {
        List<Integer> l3 = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                l3.add(numbers[i]);
            }
        }
        return l3;
    }

    public static List<Integer> evenNumbersFromArray(int[] numbers) {
        List<Integer> l4 = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                l4.add(numbers[i]);
            }
        }
        return l4;
    }

    public static List<Integer> zeroNumbersFromArray(int[] numbers) {
        List<Integer> l5 = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                l5.add(numbers[i]);
            }
        }
        return l5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[20];

        System.out.println("Enter 20 numbers :");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(positiveNumbersFromArray(numbers));
        System.out.println(NegativeNumbersFromArray(numbers));
        System.out.println(oddNumbersFromArray(numbers));
        System.out.println(evenNumbersFromArray(numbers));
        System.out.println(zeroNumbersFromArray(numbers));
    }
}