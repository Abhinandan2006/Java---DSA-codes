package Arraylist;
import java.lang.reflect.Array;
import java.util.*;

//public class AList3 {
// public static int storeWater(ArrayList<Integer> height){
//     int maxwater = 0;
//     // brute force --> O(n^2)
//     for (int i = 0; i < height.size(); i++) {
//         for (int j = i+1; j < height.size(); j++) {
//             int ht= Math.min(height.get(i), height.get(j));
//             int width = j-i;
//             int currWater = ht*width;
//             maxwater = Math.max(maxwater, currWater);
//         }
//     }
//     return maxwater;
// }

//Approach2--> two pointer method -->O(n)
// public static int storeWater(ArrayList<Integer> height){
//     int maxwater =0;
//     int lp = 0;
//     int rp = height.size()-1;
//     while (lp<rp) {
//         int ht=Math.min(height.get(lp),height.get(rp));
//         int width = rp - lp;
//         int currWater = ht* width;
//         maxwater = Math.max(maxwater, currWater);
//         if (height.get(lp)<height.get(rp)) {
//             lp++;
//         }else{
//             rp--;
//         }
//     }
//     return maxwater;
// }
//      public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         //1,8,6,2,5,4,8,3,7
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println(storeWater(height));
//      }
// }

//public class AList3 {
// public static boolean pairSum1(ArrayList<Integer> list, int target){
// for (int i = 0; i < list.size(); i++) {
// for (int j = i+1; j < list.size(); j++) {
// if (list.get(i)+list.get(j)==target) {
// return true;
// }
// }
// }
// return false;
// }

//     public static boolean pairSum1(ArrayList<Integer> list, int target) {
//         int lp = 0;
//         int rp = list.size() - 1;
//         while (lp != rp) {
//             if (list.get(lp) + list.get(rp) == target) {
//                 return true;
//             }
//             if (list.get(lp) + list.get(rp) < target) {
//                 lp++;
//             } else {
//                 rp--;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         // 1,8,6,2,5,4,8,3,7
//         list.add(1);
//         list.add(8);
//         list.add(6);
//         list.add(2);
//         list.add(5);
//         list.add(4);
//         list.add(8);
//         list.add(3);
//         list.add(7);

//         Collections.sort(list);
//         System.out.println(pairSum1(list, 5));
//     }
// }

public class AList3 {
    public static boolean pairsum2(ArrayList<Integer> list, int target) {
        int breakingPoint = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakingPoint = i;
                break;
            }
        }
        int lp = breakingPoint + 1; // smallest
        int rp = breakingPoint;// largest

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 11,15,6,8,9,10 --> sorted and roatated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairsum2(list, target));
    }
}