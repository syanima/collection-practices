import java.util.ArrayList;

/**
 * Created by syanima on 27/02/16.
 */
public class GetMethodExample {
    public static void main(String[] args) {
        ArrayList<String> store = new ArrayList<>();
        store.add("pen");
        store.add("pencil");
        store.add("ink");
        store.add("notebook");
        store.add("book");
        store.add("books");
        store.add("paper");
        store.add("white board");

        System.out.println("My store contains : "+ store);
        System.out.println("First element of the ArrayList: "+store.get(0));
        System.out.println("Third element of the ArrayList: "+store.get(2));
        System.out.println("Sixth element of the ArrayList: "+store.get(5));
        System.out.println("Fourth element of the ArrayList: "+store.get(3));
    }
}