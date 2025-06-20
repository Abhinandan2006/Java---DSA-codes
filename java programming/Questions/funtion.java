package Questions;
// import java.util.Scanner;
// public class funtion{
//      public static void myname(String name){
//         System.out.println(name);
//         return;
//      }
//      public static void main(String[] args) {
//         System.out.print("enter the name: ");
//         @SuppressWarnings("resource")
//         Scanner sc= new Scanner(System.in);
//         String name = sc.next();
//         myname(name);
//      }
//  }

// import java.util.*;
// public class funtion {

//    public static int calculate(int a,int b){
//       int sum=a+b;
//       return sum;
//    }
//    public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
//       System.out.print("enter number a: ");
//       int a= sc.nextInt();
//       System.out.print("enter number b: ");
//       int b= sc.nextInt();

//       int sum =calculate(a, b);
//       System.out.println(sum);
//    }
// }

// import java.util.*;
// public class funtion {

//    public static int calculate(int a,int b){
//       int pro=a*b;;
//       return pro;
//    }
//    public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
//       System.out.print("enter number a: ");
//       int a= sc.nextInt();
//       System.out.print("enter number b: ");
//       int b= sc.nextInt();

//       int pro =calculate(a, b);
//       System.out.println(pro);
//    }
// }

import java.util.*;

public class funtion {

   public static int fact(int n) {
      int f = 1;
      for (int i = 1; i <= n; i++) {
         f = f * i;
      }
      return f;
   }

   public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner sc = new Scanner(System.in);
      System.out.print("enter number n: ");
      int n = sc.nextInt();
      int fac = fact(n);
      System.out.println("the factorial of num is: " + fac);
   }
}