import java.util.*;

public class Sixth {
    public static void converToCelsius(int temp) {
        int celsius = (temp - 32) * 5 / 9;
        System.out.println("Temperature in celsius : " + celsius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Fahrenheit = ");
        int temp = sc.nextInt();

        converToCelsius(temp);

    }
}
