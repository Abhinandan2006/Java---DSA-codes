package JavaAdvance.Java;
// class InnerMultiThreading extends Thread {
    
//         public void run(){
//             System.out.println("thread is running");
//         }
//     }
// public class MultiThreading {
//     public static void main(String[] args) {
//         InnerMultiThreading t1 = new InnerMultiThreading();
//         t1.start();
//     }
// }
class InnerMultiThreading implements Runnable{
    public void run(){
        System.out.println("thread is running");
    }
    
}
public class MultiThreading {

    public static void main(String[] args) {
        InnerMultiThreading m1 = new InnerMultiThreading();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}