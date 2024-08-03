public class Third {
    public static int calculate(int number, int numToAdd, int numToDivide, int numToMultiply, int modulus) {
        int temp = number + numToAdd;
        temp = temp / modulus;
        temp = temp / numToDivide;
        temp = temp * numToMultiply;

        return temp;

    }

    public static void main(String[] args) {
        int number = 2345, numToAdd = 8, numToDivide = 3, modulus = 5, numToMultiply = 5, res;

        System.out.println(calculate(number, numToAdd, numToDivide, numToMultiply, modulus));
    }
}
