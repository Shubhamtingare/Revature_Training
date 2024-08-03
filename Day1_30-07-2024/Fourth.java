import java.util.Scanner;;

public class Fourth {
    public static int calMarks(int s1, int s2, int s3) {
        return s1 + s2 + s3;
    }

    public static int calPercentage(int s1, int s2, int s3) {
        return (s1 + s2 + s3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks for three subjects out of 100 : ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        System.out.println("marks are = " + calMarks(s1, s2, s3));
        System.out.println("marks are = " + calPercentage(s1, s2, s3) + "%");
    }
}
