package Arraylist;
import java.util.ArrayList;
public class AList {

    public static void main(String[] args) {
        // ArrayList is part of java collection frame work
        // classname objectname= new clasname();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean > list3 = new ArrayList<>();
        // add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4,4);
        System.out.println(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }


        //get
        int element = list.get(2);
        System.out.println(element);

        // remove
        list.remove(3);
        System.out.println(list);

        // set element at index
        list.set(2, 4);
        System.out.println(list);

        // contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}