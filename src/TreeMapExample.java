import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap vehicles = new TreeMap();

        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        System.out.println("Total vehicles: " + vehicles.size());

        for (Object key : vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();

        System.out.println("Highest key: " + vehicles.lastKey());
        System.out.println("Lowest key: " + vehicles.firstKey());
        System.out.println("\nPrinting all values:");

        for (Object val : vehicles.values())
            System.out.println(val);
        System.out.println();
        vehicles.clear();
        System.out.println("After clear operation, size: " + vehicles.size());
    }
}

