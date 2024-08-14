import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Double> mapDemo = new TreeMap<>();
        // Map<String, Double> mapDemo = new HashMap<>();

        mapDemo.put("Shubham", 5000.30);
        mapDemo.put("Advait", 5001.30);
        mapDemo.put("Abhijeet", 5002.30);
        mapDemo.put("Ankit", 5003.30);

        Set<String> keySet = mapDemo.keySet();

        for (String key : keySet) {
            System.out.println(mapDemo.get(key));
        }
    }
}
