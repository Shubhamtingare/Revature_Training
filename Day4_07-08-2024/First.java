
public class First {
    public static void main(String[] args) {
        String word = "Umbrella";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("present");

        } else
            System.out.println("Not present");
    }
}
