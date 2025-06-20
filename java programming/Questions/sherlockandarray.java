package Questions;
public class sherlockandarray {
    public static int firstsum(int arr[]){
        int firstsum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j<= i-1; j++) {
                if (j==i) {
                    return 0;
                }
                else{
                    firstsum = firstsum + arr[j];
                }
            }
        }
        return firstsum;
    }

    public static int lastsum(int arr[]){
        int lastsum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j<= arr.length; j++) {
                if (j==i) {
                    return 0;
                }
                else{
                    lastsum = lastsum + arr[j];
                }
            }
        }
        return lastsum;
    }
   

    public static void main(String[] args) {
        int arr[] = { 5, 6, 8, 11 };
        int first = firstsum(arr);
        int last = lastsum(arr);
        if (first == last) {
            
        }
    }
}