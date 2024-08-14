import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> teamA = new LinkedList<String>();

        teamA.add("Shubham");
        teamA.add("Vilas");
        teamA.add("Advait");
        teamA.add("Shashank");
        teamA.add("Shravan");

        teamA.add(1, "Aashlesha");
        teamA.remove(5);

        teamA.addFirst("ABC");

        Iterator itr = teamA.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
