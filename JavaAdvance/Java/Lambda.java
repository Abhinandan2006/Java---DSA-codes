package JavaAdvance.Java;

import java.util.Base64;

@FunctionalInterface
interface Calculator{

    int sum(int a, int b);
}
public class Lambda {

    public static void main(String[] args) {
        String str = "Abhinandan";
        byte[] b = str.getBytes();
        String base = Base64.getEncoder().encodeToString(b);
        System.out.println(base);
        byte[] decode = Base64.getDecoder().decode(base);
        String s = new String(decode);
        System.out.println(s);
    }
}
