public class First {

    public static int calArea(int len, int bre) {
        return len * bre;
    }

    public static int calPerimeter(int len, int bre) {
        return 2 * (len + bre);
    }

    public static void main(String[] args) {
        int length, breadth;
        try {
            System.out.println("First number:" + args[0]);
            System.out.println("Second number:" + args[1]);

            length = Integer.parseInt(args[0]);
            breadth = Integer.parseInt(args[1]);

            System.out.println("Area is :" + calArea(length, breadth));
            System.out.println("Perimeter is :" + calPerimeter(length, breadth));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
