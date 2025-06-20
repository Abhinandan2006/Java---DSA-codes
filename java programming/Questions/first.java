package Questions;
// public class first{
//     public static void main(String[] args) {
//         for (int i = 5; i >= 1 ;i--) {
//             for (int k = 5; k >=i; k--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

public class first {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >=i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// public class first {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int k = 5-i; k >= 1; k--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//  public class first {

//     public static void main(String[] args) {
//         for (int i = 1; i <=4; i++) {
//             for (int k = 1; k <=i; k++) {
//                 System.err.print(" ");
//             }
//             for (int j = 4; j >=i; j--) {
//                 System.out.print(" *");
//             }
//             System.err.println();

//         }
//     }
// }

// public class first {
//     public static void main(String[] args) {
//         for (int i = 1; i <=4; i++) {
//             for (int k = 1; k <i; k++) {
//                 System.err.print(" ");
//             }
//             for (int j = i; j <=4; j++) {
//                 System.out.print(" *");
//             }
//             System.err.println();

//         }
//         for (int i = 4-1; i >= 1; i--) {
//             for (int k = 1; k < i; k++) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j <= 4; j++) {
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

// public class first {

//     public static void main(String[] args) {
//         //for upper half 
//         for (int  i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             //printing spaces
//             for (int j = 1; j <=2*(4-i); j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //for lower part
//         for (int  i = 4; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             for (int j = 1; j <=2*(4-i); j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class first {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class first {

//     public static void main(String[] args) {
//         for (int i = 5; i >= 1; i--) {
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class first {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5 ; i++) {
//             for (int j = 5-i; j >=1; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class first {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class first {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5 ; i++) {
//             for (int j = 5-i; j >=1; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j >=1; j--) {
//                 System.out.print(j);
//             }
//             for (int j = 2; j <=i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class first {
//     public static void main(String[] args) {
//         //upper half
//         for (int i = 1; i <= 4 ; i++) {
//             for (int j = 1; j <=4-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=2*i-1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //lower half
//         for (int i = 4; i >= 1 ; i--) {
//             for (int j = 1; j <=4-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=2*i-1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class first {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 6 - i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }