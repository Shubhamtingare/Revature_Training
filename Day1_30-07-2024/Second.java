public class Second {
    public static int calPerimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {

        try {
            int side1, side2, side3;

            // System.out.println("Enter the first side of a traingle"+args[0]);
            // System.out.println("Enter the second side of a traingle"+args[1]);
            // System.out.println("Enter the third side of a traingle"+args[2]);

            side1 = Integer.parseInt(args[0]);
            side2 = Integer.parseInt(args[1]);
            side3 = Integer.parseInt(args[2]);

            System.out.println(calPerimeter(side1, side2, side3));
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
