package Stack;

public class Stack2array {
    static class Stack1 {
    
        int data;

        Stack1(int data){
            this.data = data;
        }
    }
    static class Stack2 {
    
        int data;

        Stack2(int data){
            this.data = data;
        }
    }
    static int[] arr;
    public static int top1 = -1;
    public static int top2 = arr.length;
    public static boolean isEmpty(int[] arr){
        if(top1 == -1 && top2 == arr.length){
            return true;
        }
        return false;
    }

    public static boolean isFull(int[] arr){
        if(top2 + 1 == top1 || top1 + 1 == top2){
            return true;
        }
        return false; 
    }
    public static void push(int[] arr, int data){
        if(isFull(arr)){
            return;
        }

    }
    public static void main(String[] args) {
        arr = new int[8];
    }
}
