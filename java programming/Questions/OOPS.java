package Questions;
// public class OOPS {
//     public static void main(String[] args) {
//         pen p1 = new pen(); // created a pen object name p1
//         p1.setcolor("Blue");
//         System.out.println(p1.getcolor());
//         p1.serTip(5);
//         System.out.println(p1.getTip());
//         p1.setcolor("yelow");
//         System.out.println(p1.getcolor());
//         BankAccount Myacc = new BankAccount();
//         Myacc.Username = "Abhinandan";
//         Myacc.setPassword("Abhinandan@2006");

//         student std1 = new student("Adrika");
//         System.out.println(std1.name);

//     }
// }

// class BankAccount {
//     public String Username;
//     private String Password;

//     public void setPassword(String pwd) {
//         Password = pwd;
//     }
// }

// class pen {
//     private String color;
//     private int tip;

//     String getcolor() {
//         return this.color;
//     }

//     int getTip() {
//         return this.tip;
//     }

//     void setcolor(String newColor) {
//         this.color = newColor;
//     }

//     void serTip(int newTip) {
//         this.tip = newTip;
//     }

//     pen() { // its a constructor.

//     }
// }

// class student {
//     String name;
//     int age;
//     float percentage;

//     void calpercentage(int phy, int chem, int maths) {
//         percentage = (phy + chem + maths) / 3;

//     }

//     student(String name){ //--> constructor
//         this.name = name;
//     }
// }

// Inheritance
public class OOPS {

    public static void main(String[] args) {
        Dog dobb = new Dog();
        dobb.bread="lebara";
        dobb.eat();
        dobb.legs=4;
        System.out.println(dobb.legs);
    } 
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

class Mamals extends Animal{
    int legs;
}

class Dog extends Mamals{
    String bread;
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swim in water");
    }

class ranveer extends Animal{
    void isWasTatti(){
        System.out.println("chapri movie");
    }
}
}