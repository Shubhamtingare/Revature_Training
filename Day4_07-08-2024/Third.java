import java.util.Scanner;

public class Third {
    public static int noOfVowels(String str) {

        int vowels = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i' | str.charAt(i) == 'o' | str.charAt(i) == 'u') {
                vowels++;
            }
        }
        return vowels;
    }

    public static int noOfConsonants(String str) {
        int consonants = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') && !(str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i' | str.charAt(i) == 'o' | str.charAt(i) == 'u')) {
                consonants++;
            }
        }

        return consonants;
    }

    public static int noOfDigits(String str) {
        int digits = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits++;
            }
        }
        return digits;

    }

    public static int noOfWhiteSpaces(String str) {
        int whiteSpaceCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                whiteSpaceCount++;
            }
        }
        return whiteSpaceCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();

        System.out.println("No of Vowels : " + noOfVowels(str));
        System.out.println("No of Consonants : " + noOfConsonants(str));
        System.out.println("No of Digits : " + noOfDigits(str));
        System.out.println("No of Whitespaces : " + noOfWhiteSpaces(str));
    }
}
