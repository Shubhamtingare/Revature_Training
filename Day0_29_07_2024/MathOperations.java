import java.util.*;

public class MathOperations{

    public static int add(int num1, int num2){
            return num1+num2;
        }
        public static int sub(int num1, int num2){
            return num1-num2;
        }
        public static int multiply(int num1, int num2){
            return num1*num2;
        }
        public static int div(int num1, int num2){
            if(num2 == 0){
                return -1;
            }
            return num1/num2;
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        System.out.println("Enter the operation you want to perform(+,-,*,/)");
        char ch = sc.next().charAt(0);

        switch(ch){
            case '+':
            System.out.println(add(num1,num2));
            break;
            case '-':
            System.out.println(sub(num1,num2));
            break;
            case '*':
            System.out.println(multiply(num1,num2));
            break;
            case '/':
            System.out.println(div(num1,num2));
            break;
            default:
            System.out.println("Invalid operation");
            break;
        }


        
    }
}