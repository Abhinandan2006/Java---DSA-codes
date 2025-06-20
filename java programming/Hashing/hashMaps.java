package Hashing;

import java.util.*;

public class hashMaps {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();
        //put
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Spain", 200);
        hm.put("Japan", 120);

        // System.out.println(hm);

        // //get
        // int pop = hm.get("India");
        // System.out.println(pop);

        // //ContainsKey
        // System.out.println(hm.containsKey("India"));//true
        // System.out.println(hm.containsKey("Indonatia"));//false

        //remove
        // hm.remove("China");
        // System.out.println(hm);

        //size
        // System.out.println(hm.size());

        // //isEmpty
        // hm.clear();
        // System.out.println(hm.isEmpty());

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key= "+ k + ", value= "+hm.get(k));
        }

    }
}
