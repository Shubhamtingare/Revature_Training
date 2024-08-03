import java.util.Scanner;

public class Second {
    public static String calculateGrade(int marks) {
        if (marks <= 25) {
            return "F";
        } else if (marks > 25 && marks <= 45) {
            return "E";
        } else if (marks > 45 && marks <= 50) {
            return "D";
        } else if (marks > 50 && marks <= 60) {
            return "C";
        } else if (marks > 60 && marks <= 80) {
            return "B";
        } else if (marks > 80 && marks <= 100) {
            return "A";
        }
        return "Invalid marks";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of subject : ");
        int marks = sc.nextInt();

        System.out.println("Grade : " + calculateGrade(marks));
    }
}
