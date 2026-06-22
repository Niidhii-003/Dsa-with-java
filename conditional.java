// import java.util.*;
// public class conditional{
//     public static void main(String args[]){
//         int age = 22;
//         if (age>=18){
//             System.out.println("Adult: DRIVE, VOTE");
//         }
//         else {
//             System.out.println("NOT ADULT");
//         }
//     }
// }



// public class conditional{
//     public static void main(String args[]){
//         int a = 1 , b= 3;
//         if (a>b){
//             System.out.println("a is largest");
//         }
//         else{
//             System.out.println("b is largest");
//         }
//     }
// }


// import java.util.*;
// public class conditional{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num= sc.nextInt();
//         if (num%2==0){
//             System.out.println("NUMBER IS EVEN");
//         }
//         else{
//             System.out.println("NUMBER IS ODD");
//         }
        

//     }
        
// }




//INCOME TAX CALCULATOR

// import java.util.*;
// public class conditional{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;

//         if (income<500000) {
//             tax=0;
//         }
//         else if (income>=500000 && income<1000000){
//             tax= (int) (income * 0.2);
//         }
//         else {
//             tax  = (int) (income * 0.3);
//         } 
//         System.out.println("YOUR TAX IS:"+ tax);

//     }
// }


// public class conditional{
//     public static void main(String args[]){
//         int A=1 , B = 3 , C=6;
//         if ((A>=B) && (A>=C)){
//             System.out.println("A is largest");
//         }

//         else if (B>=C){
//             System.out.println("B is largest");

//         }

//         else {
//             System.out.println("C is largest");
//         }

//     }
// }



//TERNARY OPERATOR 

// variable=condition? statement1:statement2;

// boolean larger=(5>3)?5:3;

// string type =(5%2==0)?"even":"odd"

// public class conditional{
//     public static void main(String args[]){
//         int num=4;
//         String type=((num%2)==0)? "even":"odd";
//         System.out.println(type);
//     }
// }


// CHECKS IF STUDENT WILL PASS OR FAIL

// public class condiitonal{
//     public static void main(String args[]){
//         int marks=89;
//         String type = (marks>=33)? "pass": "fail" ; 
//         System.out.println(type);                              
//     }
// }





//SWITCH STATEMENT

// public class condiitonal{
//     public static void main(String args[]){
//         int number=3;
//         switch(number){
//             case 1 : System.out.println("SAMOSA");
//                         break;
//             case 2 : System.out.println("BURGER");
//                         break;
//             case 3 : System.out.println("MANGO SHAKE");
//                         break;
//             default : System.out.println("We Wake Up");
//                         break;
//         }
//     }
// }



//BASIC SIMPLE CALCULATOR USING SWITCH STATEMENT

import java.util.*;
public class conditional{
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A :");
        int a = sc.nextInt();
        System.out.println("ENter b:");
        int b = sc.nextInt();
        System.out.println("Enter operator:");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
                          break;
            case '-'  : System.out.println(a - b);
                           break;
            case '*'  : System.out.println(a*b);
                           break;
            case '/'  : System.out.println(a/b);
                           break;
            case '%'  : System.out.println(a % b);
                           break;
            default   : System.out.println("WRONG OPERATORS");
        }
    }
}


