import java.util.Scanner;

public class Seventh {

    public static int calGrade(int totalBoysGradeA, int totalStudents) {
        int GradeAStudents = totalStudents / 2;

        int GradeAGirls = GradeAStudents - totalBoysGradeA;
        return GradeAGirls;
    }

    public static void main(String[] args) {
        int totalStudents, totalBoys, totalBoysGradeA;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total students : ");
        totalStudents = sc.nextInt();
        System.out.println("Enter total Boys : ");
        totalBoys = sc.nextInt();
        System.out.println("Enter total Boys of Grade A : ");
        totalBoysGradeA = sc.nextInt();

        int totalGirls = totalStudents - totalBoys;

        System.out.println("A grade girls count is : " + calGrade(totalBoysGradeA, totalStudents));

    }
}
