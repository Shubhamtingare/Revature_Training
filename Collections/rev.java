import java.util.Scanner;

public class rev {
    public static String revString(String str) {
        char[] charArray = str.toCharArray();
        String reversed = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        System.out.println(revString(str));
    }
}
