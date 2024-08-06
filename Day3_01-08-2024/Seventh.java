import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seventh {
    public static int findSmallest(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findLargest(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("Smallest :" + findSmallest(numbers));
        System.out.println("Largest :" + findLargest(numbers));
    }
}
