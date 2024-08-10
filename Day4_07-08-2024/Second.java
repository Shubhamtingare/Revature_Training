import java.util.Scanner;

public class Second {
    public static String makeAbbr(String name) {
        String nameArr[] = name.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nameArr.length - 1; i++) {
            sb.append(nameArr[i].charAt(0)).append(".");
        }
        sb.append(nameArr[nameArr.length - 1]);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String name = sc.nextLine();

        System.out.println(makeAbbr(name));
    }
}
