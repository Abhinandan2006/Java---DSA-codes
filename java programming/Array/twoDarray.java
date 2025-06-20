package Array;
public class twoDarray {
   public static void main(String[] args) {
    int arr[][] = {{1,2,3,4},{9,8,7,4},{6,1,2,3},{7,1,8,1}};
        System.out.print(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
   }
