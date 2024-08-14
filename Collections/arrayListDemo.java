import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayListDemo {
    public static void main(String[] args) {
        List<String> teamA = new ArrayList<>();

        teamA.add("Shubham");
        teamA.add("Advait");
        teamA.add("Shravan");
        teamA.add("Vilas");
        teamA.add("Shashank");

        // for (int i = 0; i < teamA.size(); i++) {
        // System.out.println(teamA.get(i));
        // }

        // for (String name : teamA) {
        // System.out.println(name);
        // }

        Iterator iterator = teamA.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}