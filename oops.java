// public class oops{
//     public static void main(String args[]){
//         Pen p1=new Pen();   //created a pen object p1
//         p1.setColor("BLUE");
//         p1.setTip(6);
//         System.out.println(p1.color);
//         System.out.println(p1.tip);

//     }

// }

// class Pen{
//     String color;
//     int tip;

//     void setColor(String newColor) {
//         color = newColor;
//     }

//     void setTip(int newTip){
//         tip = newTip;
//     }

// }


// class Student{
//     String name;
//     int age;
//     float percentage; //cgpa


//     void calcPercentage(int phy , int chem , int math){
//         percentage=(phy + math + chem )/3.0f;

//     }

// }





///ACCESS MODIFIER
// public class oops{
//     public static void main(String args[]){
//         BankAccount myAcc=new BankAccount();
//         myAcc.username="Shraddha";
//         // myAcc.password="abcgfjjk";   ----> we cant see password as it is private
//         myAcc.setPassword("abcdfkk");
//     }

// }
 
// class BankAccount {
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password=pwd;
//     }
    
// }



///GETTERS AND SETTERS

// public class oops{
//     public static void main(String args[]){
//         Pen p1 = new Pen(); //created a pen object called p1
//         p1.setColor("Blue");
//         System.out.println(p1.getColor());
//         p1.setTip(5);
//         System.out.println(p1.getTip());
        
//     }
// }

// class Pen {
//     private String color;
//     private int tip;
//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }

//     void setColor(String newColor){
//         this.color=newColor;
//     }

//     void setTip(int tip){
//         this.tip=tip;
//     }

// }


//CONSTRUCTOR
// public class oops{
//     public static void main(String args[]){
//         Student s1

//     }
// }

// class Student {
//     String name;
//     int roll;

//     Student(){     
//         System.out.println("constructor is called.....");                           //constructor
        
//     }
    
// }




///TYPES OF CONSTRUCTORS
//NON-PARAMATERIZED 
//PARAMATERIZED
//COPY CONSTRUCTOR



// public class oops{
//     public static void main(String args[]){
//         Student s1=new Student();
//         Student s2=new Student("Shraddha");
//         Student s3=new Student(123);

//         // Student s4=new Student("aman" , 567);      THIS WILL GIVE ERROR
//     }
// }

// class Student {
//     String name;
//     int roll;
//     Student(){
//         System.out.println("CONSTRUCTOR IS CALLED....!!");
//     }
//     Student(String name){
//         this.name = name;
//     }
//     Student(int roll){
//         this.roll=roll;
//     }
// }




//COPY CONSTRUCTOR

// public class oops{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name="Shraddha";
//         s1.roll=456;
//         s1.password="abcd";
//         s1.marks[0]=100;
//         s1.marks[1]=90;
//         s1.marks[2]=80;


//        ///copy constructor
//         Student s2= new Student(s1);
//         s2.password="xyz";
//         //change s1 marks
//         s1.marks[2]=100;
//         ///print s2 marks
//         for(int i=0 ; i<3; i++){
//             System.out.println(s2.marks[i]);
//         }
//     }
        

        
// }

// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

//    ///copy constructor

//    ///shallow copy constructor
//     Student(Student s1){
//         marks= new int[3];
//         this.name = s1.name;
//         this.roll=s1.roll;
//         this.marks=s1.marks;
//     }

    
//     Student(){
//         marks= new int[3];
//         System.out.println("CONSTRUCTOR IS CALLED....!!");
//     }
//     Student(String name){
//         marks= new int[3];
//         this.name = name;
//     }
//     Student(int roll){
//         marks= new int[3];
//         this.roll=roll;
//     }
   

// }



/// INHERITANCE
///SINGLE LEVEL INHERITANCE

// public class oops{
//     public static void main(String args[]){
//         Fish shark = new Fish();
//         shark.eat();
//     }
// }


///base class

// class Animal{
//     String color;
//     void eat() {
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("Breathes");

//     }
// }


///DERIVED CLASS///subclass
 

// class Fish extends Animal {
//     int fins;
//     void swim() {
//         System.out.println("Swis in water");
//     }
// }





/// MULTI-LEVEL INHERITANCE



// public class oops{
//     public static void main(String args[]){
//         Dog dobby = new Dog();
//         dobby.eat();   //from animals
//         dobby.legs=4;    //from mammals
//         System.out.println(dobby.legs);

//     }
// }

// class Animal {
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("Breathes");
//     }
// }

// class Mammals extends Animal {
//     int legs;
// }

// class Dog extends Mammals{
//     String breed;
// }





//HIERARCHIAL INHERITANCE

// public class oops{
//     public static void main(String args[]){
//         Mammals dog= new Mammals();
//         dog.eat();
//         dog.walk();
//         Fish shark = new Fish();
//         shark.breathe();
//         shark.color="blue";
//         shark.swim();



//     }
// }
// class Animal {
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("Breathes");
//     }
// }

// class Mammals extends Animal {
//     void walk(){
//         System.out.println("WALKS");
//     }
// }


// class Fish extends Animal{
//     void swim(){
//         System.out.println("SWIM");
//     }
// }

// class Bird extends Animal{
//     void fly(){
//         System.out.println("FLY");
//     }
// }



////METHOD OVERLOADING
// public class oops{
//     public static void main(String args[]){
//         Calculator calc = new Calculator();
//         System.out.println(calc.sum(1,2));
//         System.out.println(calc.sum(1.5f, 2.5f));
//         System.out.println(calc.sum(1,2,3));

//     }
// }

// class Calculator{
//     int sum(int a , int b){
//         return a + b;
//     }
//     float sum(float a , float b){
//         return a + b;
//     }
//     int sum(int a , int b, int c){
//         return a + b + c;
//     }
// }



//METHOD OVERRIDING

// public class oops{
//     public static void main(String args[]){
//         Animal a= new Animal();
//         a.eat();
//         Deer d= new Deer();
//         d.eat();
       
//     }
// }

// class Animal{
//     void eat(){
//         System.out.println("eats anything");
//     }
// }

// class Deer extends Animal {
//     void eat(){
//         System.out.println("eats grasss");
//     }
// }




////ABSTRACTION

// public class oops{
//     public static void main(String args[]){
//         Horse h= new Horse();
//         h.eat();
//         h.walk();
//         System.out.println(h.color);
//         Chicken c= new Chicken();
//         c.eat();
//         c.walk();

//         // Animal a= new Animal();   THIS CANT BE EXECUTED


//     }
// }

// abstract class Animal {
//     String color;
//     Animal(){
//         color="brown";
//     }


//     void eat(){
//         System.out.println("Animal eats");
//     }

//     abstract void walk();
// }


// class Horse extends Animal{
//     Horse(){
//         System.out.println("horse is called");
//     }
//     void changeColor(){
//     color="dark brown";
//     }
//     void walk(){
//         System.out.println("WALKS on 4 legs");
//     }
// }


// class Chicken extends Animal {
//     void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }



////INTERFACE

// public class oops{
//     public static void main(String args[]){
//         Queen q = new Queen();
//         q.moves();


//         ///mutilple inheritance using interface 
//         Bear b = new Bear();
//         b.eats();

        

//     }
// }


// interface Herbivore{
//     void eatPlants();


// }

// interface Carnivore{
//     void eatMeat();

// }

// class Bear implements Herbivore , Carnivore{
//     public void eatPlants(){
//         System.out.println("Bear eats plants");
//     }
//     public void eatMeat(){
//         System.out.println("Bear eats meat");
//     }
//     void eats(){
//         eatPlants();
//         eatMeat();
//     }

// }




///STATIC KEYWORD

// public class oops{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.SchoolName="JMV";

//         Student s2=new Student();
//         System.out.println(s2.SchoolName);

//     }
// }

// class Student {
//     static int returnPercentage(int math , int phy , int chem){
//         return (math + phy + chem)/3;
//     }
//     String name;
//     int rollNo;

//     static String SchoolName;
//     void getName(String name){
//         this.name=name;

//     }
//     String getName(){
//         return this.name;
//     }
// }
// interface ChessPlayer {
//     void moves();
// }

// class Queen implements ChessPlayer{
//     public void moves() {
//         System.out.println("up, Down , left , right , diagonal(in all 4 direction)");
//     }
// }

// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right");
//     }
// }

// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diagonal--(by 1 step)");
//     }
// }



///SUPER CONSTRUCTOR

// public class oops{
//     public static void main(String args[]){
//         Horse h = new Horse();
//         System.out.println(h.color);
        
//     }
// // }

// class Animal{
//     String color;
//     Animal(){
//         System.out.println("Animal constructor is called....!!");
//     }
// }

// class Horse extends Animal{
//     Horse(){
//         super();
//         super.color="Brown";       
//         System.out.println("Horse constructor is called");
//     }
// }




// ---------------------------------------------------------------------------------------------------------------------


///EXTRALECTURE OOPS


// What is Encapsulation?
// Encapsulation is a concept of binding data (variables) and function(methods)
// into a single unit ---- a class----
// and restricting direct access to some at the objects componnets

// Its like putting data in a capsule and only exposing what's safe to the outside world

// Why use Encapsulation-->
// * To protect data from unauthorised access
// * To maintains control over how values are set/ changed
// * To improve code modularity

// HOW IMPLEMNETED-->
// make data members private or protected
// provide public getter/setter methods to access/modify them



 
// public class oops{
//        static class Student{
//         ///private variables(data hiding)
//         private String name;
//         private int age;

//         //Public setter method to set values
//         public void setName(String name){
//             this.name=name;
//         }
//         public void setAge(int age){
//             if(age>0){
//                 this.age=age;
//             }else{
//                 System.out.println("invalid age");
//             }
//         }

//         ///public getter methods(to get values)

//         public String getName(){
//             return name;
//         }

//         public int getAge(){
//             return age;
//         }
//     }
//     public static void main(String args[]){
//         Student s1= new Student();
//         //setting values using setter
//         s1.setName("Nidhi");
//         s1.setAge(20);
//         //getting values using getter 
//         System.out.println("Name: " + s1.getName());
//         System.out.println("Age: " + s1.getAge());
//     }
// }




///----------------------------------------------------------------------------------------------------------------------------------


// POLYMORPHISM
// poly--> means many and morphism means many forms
// when anyone do the same task with different techniques in java we are called as POLYMORPHISM

// Types of POLYMORPHISM
// 1)Function overloading--> Compile Time POlymorphism -->Its check two function are same at compile Time
// 2) Function overriding--> Run Time polymorphism --> Its check which function we have to choose at run time

// 1)Function overloading--->
// in a class we have many function having same name but having different paramters those working is different but

// RULES OF FUNCTION OVERLOADING-:
// 1) if we want to make different function having same name in that case we have to make a change in number of paramters are different
// 2)if the number of paramters are same then its paramters are of different Types
// 3)if both the points are same then its return type should be different->
// =>in first function we are returning --> int
// =>in second function we are returning--> String or void type


    
// public class oops{
//     static class Student{
//         String name;
//         int age;

//         public void printInfo(String name){
//             System.out.println(name);
//         }
//         public void printInfo(int age){
//             System.out.println(age);
//         }
//         public void printInfo(String name, int age){
//             System.out.println(name+" "+age);
//         }
//     }

//     public static void main(String args[]){
//         Student s1=new Student();
//         s1.name="Nitin";
//         s1.age=25;

//         s1.printInfo(s1.name);
//         s1.printInfo(s1.age);
//         s1.printInfo(s1.name, s1.age);

//     }
    

// }




///------------------------------------------------------------------------------------------------------------------------------------------------------------------

//ABSTRACTION in Java is one of the core Object Oriented Programming (OOP) principles. It means:

// Hiding internal implementation details and showing only the essential features of an object.

// Real-life Analogy

// Think of a car:
// You use the steering wheel , brakes , and accelerator.

// You dont need to know how the engine or brake system works internally

// Java lets you do this using abstract classes and interfaces.
// 1) Abstract class
// Declared using the abstract keyword.

// can have abstract methods (no body) and concrete methods (with body).

// Cannot be instantiated (you cant create and object directly from it)


public class oops{
    static abstract  class Animal{
        abstract void makeSound();    //abstract method

        void eat(){
            System.out.println("Eating.....");
        }
    }

    static class Dog extends Animal{
        void makeSound(){
            System.out.println("Bark");
        }
    }

    public static void main(String args[]){
        Animal a= new Dog();
        a.makeSound();
        a.eat();
    }
    
}







