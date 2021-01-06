// HashMapDemo.java
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits = new HashMap<>();

        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");

        System.out.println(favouriteFruits.get("Alice"));
    }
}


