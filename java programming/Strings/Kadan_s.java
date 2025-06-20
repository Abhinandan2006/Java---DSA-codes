package Strings;
public class Kadan_s {
    public static void kadans(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms); // ye math function h it means cs or ms me jo bhi maximum hoga wo ms me jake
                                   // store ho jyega
        }
        System.out.println(ms);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadans(arr);
    }
}

// // Kandan's algorithum is used when given array also consists of negative numbers
