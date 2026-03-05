package JavaAdvance.Java;

public class TestThrow {
    public static void main(String[] args) {
        // Throwing an exception explicitly
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
