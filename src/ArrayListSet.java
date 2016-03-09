/**
 * Created by syanima on 27/02/16.
 */
import java.util.ArrayList;
public class ArrayListSet {
    public static void main(String args[]) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(7);
        System.out.println("ArrayList before update: "+arraylist);
        arraylist.set(0, 11);
        arraylist.set(1, 22);
        arraylist.set(2, 33);
        arraylist.set(3, 44);
        arraylist.set(4, 55);
        System.out.println("ArrayList after Update: "+arraylist);
    }
}
