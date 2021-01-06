import java.util.HashMap;

public class HashMapTask {
    public static void main(String[] args) {
        HashMap<String, Integer> populations = new HashMap<>();

        populations.put("UK", 64100000);
        populations.put("Germany", 80620000);
        populations.put("France", 66030000);
        populations.put("Japan", 127300000);

        System.out.println(populations.get("France"));
        System.out.println(populations.get("Japan"));
        System.out.println(populations.values());
        System.out.println(populations.keySet());
    }
}
