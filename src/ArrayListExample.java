import java.util.ArrayList;

/**
 * Created by syanima on 27/02/16.
 */
public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("syani");
        obj.add("akku");
        obj.add("deepthy");
        obj.add("shini");
        obj.add("kittu");

        System.out.println("Currently the array list has following elements:"+obj);

        obj.add(0, "preeti");
        obj.add(1, "thathamma");

        System.out.println("Currently the array list has following elements:"+obj);

        obj.remove("shini");
        obj.remove("preeti");

        System.out.println("Current array list is:"+obj);

        obj.remove(3);

        System.out.println("Current array list is:"+obj);

    }
}
