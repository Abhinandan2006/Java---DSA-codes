package Strings;
// import java.util.*;

// public class strings {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String first =sc.nextLine();
//         String second =sc.nextLine();
//         String name = first+" "+second;
//         System.out.println(name);
//         System.out.println(name.length());
//         // for (int i = 0; i < name.length(); i++) {
//         //     System.out.println(name.charAt(i));
//         // }
//         if (first.compareTo(second)==0) {  //we can also use == but it fails in some cases
//             System.out.println("strings are equal");
//         }
//         else{
//             System.out.println("strings are not equal");
//         }
//     }
// }// in java strings are objects

// public class strings {

//     public static void main(String[] args) {
//         String fullname= "my name is Abhinandan";
//         String name= fullname.substring(5,fullname.length());
//         System.out.println(name);
//     }
//}

// public class strings {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Nandan");
//         System.out.println(sb.charAt(0));
//         sb.setCharAt(0, 'a');
//         sb.insert(0, 'p');
//         sb.delete(1, 2);
//         sb.append('d');
//         System.out.print(sb);
//     }
// }

// public class strings {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Adrika");
//         for (int i = 0; i < sb.length()/2; i++) {
//             int f=i;
//             int b=sb.length()-1-i;

//             char fc= sb.charAt(f);
//             char bc= sb.charAt(b);

//             sb.setCharAt(i, bc);
//             sb.setCharAt(b, fc);
//         }
//         System.out.print(sb);
//     }
// }

public class strings {

    public static void reverseString(char s[]) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(java.util.Arrays.toString(s));

    }

    public static void main(String[] args) {
        char s[] = { 'a', 'b', 'c', 'd' };
        reverseString(s);

    }
}