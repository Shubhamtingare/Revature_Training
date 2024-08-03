public class Op {
    
    public static void add(int num1, int num2) {
        System.out.println("Addition : " + (num1 + num2));
    }
    public static void sub(int num1, int num2) {
        System.out.println("Subtraction : " + (num1 - num2));
    }
    public static void mul(int num1, int num2) {
        System.out.println("Multiplication : " + (num1 * num2));
    }
    public static void div(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("Division : " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

}
