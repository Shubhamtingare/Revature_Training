import java.util.Scanner;

public class Third {
    public static String calResult(int noOfClassesAttended, int noOfClassesHeld, char medCause) {
        double percOfAttend = ((double) noOfClassesAttended / noOfClassesHeld) * 100;
        System.out.println(percOfAttend);

        if ((percOfAttend >= 75)) {
            if (medCause == 'N' || medCause == 'Y')
                return "Yes allowed";
        } else if ((percOfAttend < 75)) {
            if (medCause == 'Y')
                return "Yes allowed";
        }
        return "Not allowed";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of classes held :");
        int noOfClassesHeld = sc.nextInt();

        System.out.println("Enter number of classes attended : ");
        int noOfClassesAttended = sc.nextInt();

        System.out.println("Have you a meadical cause(Y/N)");
        char medCause = sc.next().charAt(0);

        if (noOfClassesAttended > noOfClassesHeld)
            System.out.println("Invalid numbers");
        else
            System.out.println(calResult(noOfClassesAttended, noOfClassesHeld, medCause));
    }
}
