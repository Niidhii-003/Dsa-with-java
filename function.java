// //SYNTAX withou parameter
// /* returnType name(){
//     //body
//     return statement;   
// }*

// // public class function{
// //     public static void printHelloWorld(){
// //         System.out.println("Hello World");
// //         System.out.println("Hello World");
// //         System.out.println("Hello World");
// //     }
// //     public static void main(String args[]){
// //         printHelloWorld();

// //     }
// // }


// /* SYNTAX WITH PARAMETERS
//    returnType name(type param1 , type param2){
//    //body
//    return statement;
   
//    }
//           */

// // import java.util.*;
// // public class function{
// //     public static int CalculateSum(int num1 , int num2){  ///parameter or formal parameter
// //         int sum = num1 + num2;
// //         return sum;
// //     }
// //     public static void main(String args[]){
// //         Scanner sc=new Scanner(System.in);
// //         int a = sc.nextInt();
// //         int b = sc.nextInt();
// //         int sum = CalculateSum(a , b);  //argument or actual parameters
// //         System.out.println("sum is " + sum);


// //     }
// // }



// //SWAPPING OF VARIABLE

// // public class function{

// //     public static void swap(int a , int b){
// //         int temp=a;
// //         a=b;
// //         b=temp;
// //         System.out.println("a="+ a);
// //         System.out.println("b="+ b);
// //     }
// //     public static void main(String args[]){

// //         int a = 5;
// //         int b = 10;
// //         swap(a,b);

// //     }
// // }


// //find product of a and b

// // public class function{
// //     public static int multiplication(int a , int b){
// //         int product = a * b;
// //         return product;
// //     }
// //     public static void main(String args[]){
// //         int a = 10;
// //         int b = 23;
// //         int prod = multiplication(a, b );
// //         System.out.println(prod); 
// //     }
// // }

// //FACTORIAL OF Number
// // public class function{
// //     public static int factorial(int number){

// //         ///FACTORIAL BY LOOP

// //         int f=1;
// //         for(int i=1 ; i<=number; i++){
// //             f=f*i;
// //         }
// //         return f;

// //         // /FACTORIAL BY RECURSION

// //         // if (number==0 || number==1){
// //         //     return 1;
// //         // }else {
// //         //     return number * factorial(number-1);
// //         // }
        
// //     }
// //     public static void main(String args[]){
// //         int number = 5;
// //         int fact=factorial(number);
// //         System.out.println(fact);
// //     }
// // }


// //BINOMIAL 
// ///ncr=n! /(r!*(n-r)!)
// // public class function{
// //     public static int factorial(int n){
// //         int fact =1;
// //         for (int i=1; i<=n;i++){
// //             fact=fact*i;
// //         }
// //         return fact;
// //     }

// //     public static int binCoeff(int n , int r){
// //         int fact_n=factorial(n);
// //         int fact_r=factorial(r);
// //         int fact_rn=factorial(n-r);
// //         int binCoeff=fact_n/(fact_r * fact_rn);
// //         return binCoeff;
// //     }
// //     public static void main(String args[]){
// //         System.out.println(binCoeff(5,2));


// //     }

// // }
 


// // public class function{
// //     public static boolean isPrime(int n){
// //         boolean isPrime=true; 
// //         for (int i = 2; i<=n-1; i++){
// //             if (n%i==0){
// //                 isPrime=false;
// //                 break;
// //             }
// //         }
// //         return isPrime;
// //     }
// //     public static void main(String args[]){
// //         System.out.println(isPrime(7));
// //     }
// // }


// //OPTIMIISED WAY TO CHECK NUMBER IS PRIME OR NOT
// // public class function{
// //     public static boolean isPrime(int n){
// //         if (n%i==0){
// //             return false;
// //         }
// //         return true;
// //     }
// //     public static void main(String args[]){
// //         System.out.println(isPrime(7));
// //     }
// // }

// //print all primes in range

// // public class function{
// //     public static boolean isPrime(int n){
// //         boolean isPrime=true; 
// //         for (int i = 2; i<=n-1; i++){
// //             if (n%i==0){
// //                 isPrime=false;
// //                 break;
// //             }
// //         }
// //         return isPrime;
// //     }
// //     public static void PrimeInRange(int n){
// //         for (int i=2;i<=n ; i++){
// //             if (isPrime(i)){
// //                 System.out.print(i+" ");
// //             }
// //         }
// //         System.out.println();

// //     }
        


    
// //     public static void main(String args[]){
// //         PrimeInRange(12);
        
// //     }
// // }


// ///CONVERT  FROM BINARY TO DECIMAL

//n=101
//2^2(1)+2^1(0)+2^0(1)=5 

    
// public class function{
//     public static void binToDec(int binNum){
//         int mynum=binNum;
//         int pow =0;
//         int decNum=0;
//         while(binNum>0){
//             int lastDigit=binNum%10;
//             decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
//             pow++;
//             binNum=binNum/10;   
//         }
//         System.out.println("decimal of " + mynum + " = " + decNum);
//     }
//     public static void main(String args[]){
//         binToDec(101);
//     }
// }


//CONVERT FROM DECIMAL TO BINARY;

// public class function{
//     public static void decToBin(int decNum){
//         int mynum=decNum;
//         int pow =0;
//         int binNum=0;
//         while(decNum>0){
//             int lastDigit=decNum%2;
//             binNum= binNum + (lastDigit * (int)Math.pow(10 ,pow));
//             pow++;
//             decNum=decNum/2;   
//         }
//         System.out.println("decimal of " + mynum + " = " + binNum);
//     }
//     public static void main(String args[]){
//         decToBin(5);
//     }
// }