import java.util.*;
public class typeconversion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();   // int to float not possible
        System.out.println(number);
    }
}


//type casting of float to integer
// import java.util.*;
// public class typecasting{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         float a = 25.7f;
//         int b = (int) a ;
//         System.out.println(b);
//     }
// }

//typecasting of character to integer

// import java.util.*;
// public class typecasting{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         char ch = 'A';
//         int number = ch;
//         System.out.println(number);    
//     }
// }


//FIRST TYPE OF TYPE PROMOTIONS

// import java.util.*;
// public class typecasting{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         char a='a';
//         char b='b';
//         System.out.println((int)(a));
//         System.out.println((int)b);
//         System.out.println(b-a);
//         System.out.println(a);
//     }

    
// }


// import java.util.*;
// public class typecasting{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         short a = 5;
//         byte b = 25;
//         char c = 'c';
//         byte bt= (byte) (a+b+c) ;
//         System.out.println(bt);
//     }
// }


// bada converted to bada value - exmaple---- badi balti mein hee sab aayega choti balti ka
 //second type of type promotions

// public class typeconversion{
//     public static void main(String args[]){
//         int a = 10;
//         float b = 20.3f;
//         long c = 24;
//         double d = 30;
//         double ans = a+b+c+d;
//         System.out.print(ans);
//     }
// }

//TYPE PROMOTON IN EXPRESSIONS
// WRONG ---- byte b=5;
/// b = b* 2
//right --- byte b= 5
// b=(byte)(b*2)

// public class typeconversion{
//     public static void main(String args[]){
//         byte b = 5;
//         // byte a = b*2;    //byte is a choti balti and you are storing into choti balti a big value of integer balti not possible
//         byte a =(byte) (b*2);
//         System.out.println(a);
//     }
// }