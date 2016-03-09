import java.util.HashMap;
import java.util.Map;
import java.lang.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map vehicles = new HashMap();
        vehicles.put("BMW", 5);
        vehicles.put("Ferrari", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        System.out.println("Total vehicles: " + vehicles.size());

        for (Object key : vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();

        String searchKey = "Audi";
        if (vehicles.containsKey(searchKey))
            System.out.println("Found total " + vehicles.get(searchKey) + " "
                    + searchKey + " cars!\n");

        vehicles.clear();
        System.out.println("After clear operation, size: " + vehicles.size());
    }
}

