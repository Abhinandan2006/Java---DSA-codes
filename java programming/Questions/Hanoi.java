package Questions;
public class Hanoi {

    public static void tower(String source, String helper, String destination, int disk) {
        if (disk == 1) {

            System.out.println("transfer disk " + disk + " from " + source + " to " + destination);

            return;
        }
        tower(source, destination, helper, disk - 1);

        System.out.println("transfer disk " + disk + " from " + source + " to " + destination);

        tower(helper, source, destination, disk - 1);

        System.out.println("transfer disk " + disk + " from " + source + " to " + destination);
    }

    public static void main(String[] args) {

        tower("S", "H", "D", 3);
    }
    
}
