package Assignments.AssistedPractice;
import java.util.Map;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a map using the HashMap
        Map<String, Integer> num = new HashMap<>();

        // Insert elements to the map
        num.put("One", 1);
        num.put("Two", 2);
        System.out.println("Map: " + num);

        // Access keys of the map
        System.out.println("Keys: " + num.keySet());

        // Access values of the map
        System.out.println("Values: " + num.values());

        // Access entries of the map
        System.out.println("Entries: " + num.entrySet());

        // Remove Elements from the map
        int value = num.remove("Two");
        System.out.println("Removed Value: " + value);
	}

}
