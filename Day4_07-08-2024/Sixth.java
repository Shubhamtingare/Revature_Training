public class Sixth {
    public static void sortArray(String str[]) {
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    public static void main(String[] args) {
        String str[] = { "Shubham", "Akshay", "Prathamesh", "Santosh", "Abhijit", "Ankit", "Advait", "Puja", "Priti",
                "Swadesh" };

        sortArray(str);
    }
}