package Recurssion;
// public class recurssion {

//     public static void numb(int n){
//         if (n==0) {
//             return;
//         }
//         System.out.println(n);
//         numb(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         numb(n);
//     }
// }


// public class recurssion {

//     public static void numb(int n){
//         if (n==6) {
//             return;
//         }
//         System.out.println(n);
//         numb(n+1);
//     }
//     public static void main(String[] args) {
//         int n=1;
//         numb(n);
//     }
// }


// public class recurssion {

//     public static void fac(int i, int n, int f){
//         if (n==1) {
//             f=f*i;
//             System.out.println(f);
//             return;
//         }
//         f=f*i;
//         fac(i-1, n-1, f);

//     }
//     public static void main(String[] args) {
//         fac(5,5,1);
//     }
// }

// public class recurssion {

//     public static int fact(int n){
//         if (n==1 || n==0) {
//             return 1;
//         }
//         //int f1= fact(n-1);
//         int f= n*fact(n-1);
//         return f;

//     }
//     public static void main(String[] args) {
//         int n=5;
//         int ans=fact(n);
//         System.out.println(ans);
//     }
// }    


// import java.util.*;
// public class recurssion {

//     public static void fibo(int a, int b, int n){
//         if (n==0) {
//             return;
//         }
//         int c=a+b;
//         System.out.print(c+"  ");
//         fibo(b, c, n-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=0, b=1;
//         System.out.print("enter the n: ");
//         int n = sc.nextInt();
//         System.out.print(a+" ");
//         System.out.print(b+" ");
//         fibo(a, b, n-2);
//     }
// }

// public class recurssion {

//     public static int printx(int n,int x){
//          if (n==0) {
//             return 1;
//          }
//          if (x==0) {
//             return 0;
//          }
//          int xp= x*printx(n-1, x);
//          return xp;
        
//     }
//     public static void main(String[] args) {
//         int x=2;
//         int n=5;
//         int ans = printx(n, x);
//         System.out.println(ans);
//     }
// }  

// public class recurssion {

//     public static int printx(int n,int x){
//          if (n==0) {
//             return 1;
//          }
//          if (x==0) {
//             return 0;
//          }
//          int xp= x*printx(n-1, x);
//          return xp;
        
//     }
//     public static void main(String[] args) {
//         int x=2;
//         int n=5;
//         int ans = printx(n, x);
//         System.out.println(ans);
//     }
// }  

public class recurssion {

    public static int printx(int x,int n){
         if (n==0) {// base case 1
            return 1;
         }
         if (x==0) {// base case 2
            return 0;
         }
        if (n%2==0) {
            return printx(x, n/2) * printx(x, n/2);
        }
        else{
            return printx(x, n/2) * printx(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans = printx(x, n);
        System.out.println(ans);
    }
}  