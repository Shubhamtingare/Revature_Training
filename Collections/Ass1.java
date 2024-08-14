import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ass1 {
    public static void main(String[] args) {
        List<String> movies = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < movies.size(); i++) {
            String movieName = sc.nextLine();
            movies.add(movieName);
        }

        Collections.sort(movies);

        for (String name : movies) {
            System.out.println(name);
        }
    }
}
