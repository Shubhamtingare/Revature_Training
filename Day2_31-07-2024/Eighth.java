
public class Eighth {
    public static void findArmstrongNos() {

        for (int i = 100; i <= 500; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {

                int lDigit = temp % 10;
                int cube = lDigit * lDigit * lDigit;
                sum += cube;
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        findArmstrongNos();
    }
}
