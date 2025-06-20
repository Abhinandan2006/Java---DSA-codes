package Questions;
// import java.util.HashSet;
// import java.util.Set;

// public class UinonIntersection {

//     public static int[] intersection(int arr1[], int arr2[]) {
//         int n = arr1.length + arr2.length;
//         int temp[] = new int[n];
        
//         // Merging arr1 and arr2 into temp
//         for (int i = 0; i < arr1.length; i++) {
//             temp[i] = arr1[i];
//         }
//         for (int i = 0; i < arr2.length; i++) {
//             temp[arr1.length + i] = arr2[i];
//         }
        
//         // Removing duplicates using a HashSet
//         Set<Integer> uniqueElements = new HashSet<>();
//         for (int num : temp) {
//             uniqueElements.add(num);
//         }
        
//         // Converting the set back to an array
//         int[] result = new int[uniqueElements.size()];
//         int index = 0;
//         for (int num : uniqueElements) {
//             result[index++] = num;
//         }
        
//         return result;
//     }

//     public static void main(String[] args) {
//         int arr1[] = {1, 2, 3, 4, 5};
//         int arr2[] = {1, 2, 3};

//         int[] resultArray = intersection(arr1, arr2);
        
//         System.out.println("Merged array without duplicates:");
//         for (int num : resultArray) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//         System.out.println("the union is "+resultArray.length);
//     }
// }


import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {

    public static int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>(); // these two are sets
        Set<Integer> resultSet = new HashSet<>();//set provides flexibility and do not store duplicate value

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};

        int[] resultArray = intersection(arr1, arr2);

        System.out.println("Intersection of arr1 and arr2:");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
}

