package Arraylist;
import java.util.*; // star mtln all
public class AList2 {
// public static void swap(ArrayList<Integer> list,int idx1, int idx2){
//     int temp = list.get(idx1);
//     list.set(idx1, list.get(idx2));
//     list.set(idx2, temp);
// }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        
        for (int i = 1; i <=5; i++) {
            list.add(1+i);
            list2.add(2+i);
        }
        System.out.println(list);

        mainList.add(list);
        mainList.add(list2);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

        System.out.println(mainList);


        // for (int i = list.size()-1; i >=0; i--) {
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();
        // for (int i = 0; i < list.size(); i++) {
        //     // if (list.get(i)>max) {
        //     //     max = list.get(i);
        //     // }

        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println("maximum element ="+max);

        // int idx1 = 2, idx2=3;
        // swap(list, idx1, idx2);
        // System.out.println(list);

        // Collections.sort(list);
        // System.out.println(list); 

        // Collections.sort(list,Collections.reverseOrder());
        // // reverseOrder--> comparator = jo function ak logic define krta h 
        // System.out.println(list);
        
         
    }
}