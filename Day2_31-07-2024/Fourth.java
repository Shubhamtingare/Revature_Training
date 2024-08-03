import java.util.Scanner;

public class Fourth {
    public static double calAverage(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = (double) sum / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers :");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(calAverage(numbers));
    }
}
