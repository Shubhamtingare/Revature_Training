import java.util.Scanner;

public class Fourth {
    public static void checkPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        int temp = 0;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                temp = -1;
            }
            i++;
            j--;
        }
        if (temp == -1) {
            System.out.println("Given string is not palindrome");
        } else
            System.out.println("Given string is palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();

        checkPalindrome(str);
    }
}
