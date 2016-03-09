/**
 * Created by syanima on 29/02/16.
 */
import java.lang.String;
import java.util.HashSet;
import java.util.*;
public class SetExample {
    public static void main(String args[]) {
        Set mySet1 = new HashSet();
        mySet1.add("A");
        mySet1.add("C");
        mySet1.add("A");
        mySet1.add("B");
        System.out.println("mySet1: " + mySet1);
        List list = new ArrayList();
        list.add("A");
        list.add("C");
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        Set mySet2 = new HashSet(list);
        System.out.println("list: " + list);
        System.out.println("mySet2: " + mySet2);
        System.out.println("MySet1 matches mySet2: " + mySet1.equals(mySet2));
        mySet2.remove("A");
        System.out.println("mySet2: " + mySet2);
        System.out.println("MySet1 matches mySet2: " + mySet1.equals(mySet2));
        System.out.println("MySet1 contains all the elements: " + mySet1.containsAll(list));
        System.out.println("MySet2 contains all the elements: " + mySet2.containsAll(list));
        Iterator iterator = mySet1.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator loop: " + iterator.next());
        }
        for (Object str : mySet1) {
            System.out.println("for-each loop: " + str);
        }
        mySet1.clear();
        System.out.println("mySet1 is Empty: " + mySet1.isEmpty());
        System.out.println("mySet1 has: " + mySet1.size() + " Elements");
        System.out.println("mySet2 has: " + mySet2.size() + " Elements");
        Object[] array = mySet2.toArray(new String[mySet2.size()]);
        System.out.println("The array:" + Arrays.toString(array));
    }
}

