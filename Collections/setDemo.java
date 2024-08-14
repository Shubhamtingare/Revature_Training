import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setDemo {
    public static void main(String[] args) {

        Set<String> teamA = new HashSet<>();
        teamA.add("Shubham");
        teamA.add("Shashank");
        teamA.add("Advait");
        teamA.add("Shravan");
        teamA.add("Shubham");

        System.out.println(teamA.size());

        System.out.println(teamA.contains("Shubham"));

        System.out.println(teamA.isEmpty());

        Iterator itr = teamA.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
