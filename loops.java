// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         int counter = 0;
//         while ( counter < 10){
//             System.out.println("HELLO WORLD");
//             counter++;  
//         }
//         System.out.println("PRINTER PRINTS HELLO WORLD 10 TIMES");
//     }
// }


//print number from 1 to10;
// public class loops{
//     public static void main(String args[]){
//         int counter=1;
//         while (counter<=100){
//             System.out.print(counter + " ");
//             counter++;
//         }
//         System.out.println();
//     }
// }



// import java.util.*;

// public class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         int counter =1 ;
//         while (counter<=number){
//             System.out.println(counter);
//             counter++;
//         }
//         System.out.println();
//     }

// }





//SUM OF FIRST N NATURAL NUMBER

// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int i =1;
//         while (i<=n){
//             sum+=i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }



//FOR LOOPS

// public class loops{
//     public static void main(String args[]){
//         for (int i=1 ; i<=10 ; i++){
//             System.out.println("HELLO WORLD");
//         }
//     }
// }





//PRINT THE REVERSE OF A NUMBER

//   n=108999  its reverse=999801

// public class loops{
//     public static void main(String args[]){
//         int n =108999;
//         while(n>0){
//             int lastDigit = n%10;
//             System.out.print(lastDigit + " ");
//             n=n/10;
//         }
//         System.out.println();
//     }
// }
  

//REVERSE THE GIVEN NUMBER
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number=sc.nextInt();
//         int rev=0;
//         while(number>0){
//             int lastdigit=number%10;
//             rev = (rev*10)+lastdigit;
//             number=number/10;
   
//         }
//         System.out.println(rev);
//     }
// }

//do while loop

// public class loops{
//     public static void main(String args[]){
//         int counter = 1;
//         do {
//             System.out.println("hello world");
//             counter++;
//         }while(counter<=10);
//     }
// }


//BREAK statement
//TO EXIT FROM LOOP

// public class loops{
//     public static void main(String args[]){
//         for (int i=1 ; i<=5 ; i++){
//             if (i==3){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I'm out of the loop");
//     }
// }

//KEEP ENTERING NUMBER TILL IT COMES MULTIPLE OF 10

// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.println("Enter Your Number");
//             int n = sc.nextInt();
//             if (n%10==0){
//                 break;
//             }
//             System.out.println(n);
//         }while(true);

//     }
// }


// CONTINUE STATEMENT

// public class loops{
//     public static void main(String args[]){
//         for(int i=1 ; i<=10 ; i++){
//             if (i==3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

//DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT MULTIPLES OF 10
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.print("Enter your Number:");
//             int n = sc.nextInt();
//             if (n % 10==0){
//                 continue;

//             }
//             System.out.println("number was:"+n);
//         }while(true);
        
//     }
            
// }


//PRIME NUMBER CODE
import java.util.*;
public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==2){
            System.out.println("n is prime number");
        }
        else{
            boolean isPrime = true;
            for (int i = 2 ; i<=n-1 ; i++){
                if (n %i==0){ //n is a multiple of i(i is not qual to 1 or n)
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("n is prime number");
            }
            else{
                System.out.println("n is not prime");
            }
        }
    }
}



        