//question1- write a java program to get a number from user and print whether it is positive or  negative

// import java.util.*;
// public class assignment2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number:");
//         int number=sc.nextInt();
        
//         if (number>0){
//             System.out.println("NUMBER IS POSITIVE");

//         }
//         else {
//             System.out.println("NUMBER IS NEGATIVE");
//         }
//     }
// }




//QUESTION-2 FINISH CODE PRINTIF YOUH HAVE FEVER OR NOT HAVE FEVER

// public class assignment2{
//     public static void main(String args[]){
//         double temp = 103.5;
//         if (temp>100){
//             System.out.println("YOU HAVE A FEVER");
//         }
//         else {
//             System.out.println("YOU DONT HAVE FEVER");
//         }
//     }
// }




//QUESTION-3 : WRITE A JAVA PROGRAM TO INPUT WEEK NUMBER(1-7) AND PRINT DAY OF WEEK NAME USING SWITCJ CASE
   

// import java.util.*;
// public class assignment2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         switch(number){
//             case 1 : System.out.println("DAY IS---MONDAY");
//             case 2 : System.out.println("DAY IS ---TUESDAY");
//             case 3 : System.out.println("DAY IS ---WEDNESDAY");
//             case 4 : System.out.println("DAY IS ---THURSDAY");
//             case 5 : System.out.println("DAYY IS ---FRIDAY");
//             case 6 : System.out.println("DAY IS ---SATURDAY");
//             case 7 : System.out.println("Day is -- SUNDAY");
//             default : System.out.println("DAY DOES NOT EXIST");

//         }
//     }
// }



//QUESTION4
// public class assignment2{
//     public static void main(String args[]){
//         int a =63 , b = 36;
//         boolean x =(a<b)? true: false;
//         int y =(a>b) ? a : b;
//         System.out.println(x);
//         System.out.println(y);


//     }
// }



// import java.util.*;
// public class assignment2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int year= sc.nextInt();
//         if ((year%400)==0 || ( (year%4)==0 && (year%100)!=0)){
//             System.out.println("LEAP YEAR");        
//         }
//         else{
//             System.out.println("NOT A LEAP YEAR");
//         }

//     }
// }

//WRITE A PROGRAM THAT READS A SET OF INTEGERS AND THEN PRINTS THE SUM OF THE EVEN AND ODD INTEGERS
// import java.util.*;
// public class assignment2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num=sc.nextInt();
//         int choice=sc.nextInt();
//         int evenSum=0;
//         int oddSum=0;

//         if (num%2==0){
//             evenSum+=num;
//         }
//         else{
//             oddSum+=num;
//         }
    
//         if(choice==1){
//             System.out.println("sum of even number is :"+ evenSum);
//             System.out.println("Sum of odd number is :"+ oddSum );
//         }

        
//     }

import java.util.*;
public class assignment2{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        
        int number=sc.nextInt();
        int oddSum=0;
        int evenSum=0;
        for (int i=1; i<=number ; i++){
            int n = sc.nextInt();
            if (n%2==0){
                evenSum+=n;
            }else{
                oddSum+=n;
            }
        }
        System.out.println("EVEN SUM IS"+ evenSum);
        System.out.println("ODD SUM IS"+ oddSum);
        
       
}
}


// WRITE A PROGRAM TO FIND THE FACTORIAL OF ANY NUMBER ENTERED BY THE USER
// import java.util.*;
// public class assignment2{
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int fact=1;
//     int num=sc.nextInt();
//     for(int i =1 ; i<=num ; i++){
//         fact=fact*i;
//     }
//     System.out.println(fact);

//     }
// }

//WRITE A PROGRAM TO PRINT THE MULTIPLICATION TABLE OF A NUMBER N, ENTERED BY THE USER.

// import java.util.*;
// public class assignment2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i = 1 ; i<=10; i++){
//             System.out.println(n +  " X "  + i +  " = "  + (n*i));
//         }
//     }
// }



// public class assignment2{
//     public static void main(String args[]){
//     for(int i=0; i<=5; i++ ){
//         System.out.println("i = "+i);
//     }
//     // System.out.println("i after the loop = "+ i );
// }
// }



///WRITE A FUNCTION METHOD TO COMPUTE THE AVERAGE OF THREE NUMBERS
// public class assignment2{
//     public static void average(int a , int b , int c){
//         int sum = a+b+c;
//         int avg=sum/3;
//         System.out.println(avg);
//     }
//     public static void main(String args[]){
//         average(12,34,21);
        


//     }
    

// }


// import java.util.*;
// public class assignment2{
//     public static double average(double a , double b , double c){
//         return (a+b+c)/3;
//     }
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter value of a:");
//         double a = sc.nextDouble();
//         System.out.print("Enter value of b:");
//         double b = sc.nextDouble();
//         System.out.print("Enter value of c:");
//         double c = sc.nextDouble();

//         System.out.println(average(a,b,c));
//     }

// }

///WRITE A METHOD NAMED IsEven that accepts an int argument. the method shoulld return true if the algoritm is even , or false otherwise. also write a program to test your method;
// import java.util.*;
// public class assignment2{
//     public static void isEven(int num){
//         if (num %2==0){
//             System.out.println("NUMBER IS EVEN");
//         }else{
//             System.out.println("NUMBER IS NOT EVEN");
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num;
//         System.out.println("enter number");
//         num = sc.nextInt();
//         isEven(num);
        
//     }
// }

// public class assignment2{
//     public static void palindrome(int num){
//         int original=num;
//         int reverse=0;
        
        
//         while(num!=0){
            
//             int lastDigit=num%10;
//             reverse=reverse*10+ lastDigit;
//             num=num/10;
            
//         }
//         if (original==reverse){
//             System.out.println("NUMBER IS PALINDROME");      
//         }else{
//             System.out.println("NUMBER IS NOT PALINDROME");
//         }
        
       

//     }
//     public static void main(String args[]){
//         palindrome(121);
//     }


// }

// write a java method to  compute the sum of the digits in an integer

// public class assignment2{
//     public static void Sum(int num){
//         int sum=0;
//         while(num>0){
//             int lastDigit=num%10;
//             sum=sum+lastDigit;
//             num=num/10;
//         }
//         System.out.println(sum);
//     }
//     public static void main(String args[]){
//         Sum(1234);
//     }
// }