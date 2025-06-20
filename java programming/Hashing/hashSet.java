package Hashing;
import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(4);
        // set.add(2);
        // set.add(1);
        // System.out.println(set);

        // if (set.contains(2)) {
        //     System.out.println("Set contains");
        // }

        // if (set.contains(3)) {
        //     System.out.println("set contains 3");
        // }

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Kanpur");
        cities.add("New York");
        cities.add("LA");

        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
