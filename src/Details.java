import java.util.ArrayList;

/**
 * Created by syanima on 29/02/16.
 */
public class Details {
    public static void main(String a[]){
        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        System.out.println("ArrayList: "+al);

        ArrayList<String> al2 = (ArrayList<String>)al.clone();
        System.out.println("Shallow copy of ArrayList: "+ al2);

        al.add("Fig");
        al.remove("Orange");

        System.out.println("Original ArrayList:"+al);
        System.out.println("Cloned ArrayList:"+al2);
    }
}


