import java.util.Arrays;
import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("MaxDifference : " + (arr[arr.length - 1] - arr[0]));
        System.out.println("SecondMaxDifference : " + (arr[arr.length - 2] - arr[0]));

    }
}
