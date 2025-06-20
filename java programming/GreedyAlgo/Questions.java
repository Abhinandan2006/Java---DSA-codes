package GreedyAlgo;

// import java.util.*;

// public class Questions {
//     public static void main(String[] args) {
//         int[] st = { 1, 3, 0, 5, 8, 5 };
//         int[] et = { 2, 4, 6, 7, 9, 9 };

//         // for sorting
//         int[][] activity = new int[st.length][3];
//         for (int i = 0; i < st.length; i++) {
//             activity[i][0] = i;
//             activity[i][1] = st[i];
//             activity[i][2] = et[i];
//         }

//         // lambda function -> shortform
//         Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));// for sorting 2d array

//         //end time based sorting
//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         // 1st activity
//         maxAct = 1;
//         ans.add(0);
//         int lastEnd = et[0];
//         for (int i = 1; i < et.length; i++) {
//             if (st[i] >= lastEnd) {
//                 maxAct++;
//                 ans.add(i);
//                 lastEnd = et[i];

//             }
//         }

//         System.out.println("Max activity = " + maxAct);
//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print("A" + ans.get(i) + " ");
//         }
//         System.out.println();
//     }
// }

// import java.util.*;

// public class Questions {

//     public static void main(String[] args) {
//         int val[] = { 60, 100, 120 };
//         int wt[] = { 10, 20, 30 };
//         int w = 50;

//         double ratio[][] = new double[val.length][2];
//         for (int i = 0; i < val.length; i++) {
//             ratio[i][0] = i;
//             ratio[i][1] = val[i] / (double) wt[i];
//         }

//         Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

//         int capacity = w;
//         int finalval = 0;
//         for (int i = ratio.length - 1; i >= 0; i--) {
//             int idx = (int) ratio[i][0];
//             if (capacity >= wt[idx]) {
//                 finalval += val[idx];
//                 capacity -= wt[idx];
//             } else {
//                 finalval += (ratio[i][1] * capacity);
//                 capacity = 0;
//                 break;
//             }
//         }
//         System.out.println("Final value = " + finalval);
//     }
// }

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        if (!input.matches("[ab]+")) {
            System.out.println("false");
            return;
        }

       
        int index = input.indexOf("bab");
        if (index == -1 || input.lastIndexOf("bab") != index) {
            System.out.println("false");
            return;
        }

       
        String before = input.substring(0, index);
        String after = input.substring(index + 3); 

        int countA_before = countChar(before, 'a');
        int countA_after = countChar(after, 'a');

        System.out.println(countA_before == countA_after);
    }
    public static int countChar(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        return count;
    }
}
