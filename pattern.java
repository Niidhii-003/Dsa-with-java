// public class pattern{
//     public static void main(String args[]){
//         System.out.println("* * * *");
//         System.out.println("* * * ");
//         System.out.println("* * ");
//         System.out.println("* ");


//     }
// }


/*  ****
    ****
    ****
    ****
    
    */

// public class pattern{
//     public static void main(String args[]){
//         for(int line = 1; line<=4; line++){
//             System.out.println("****");
//         }
//     }
// }



/* 

    *
    * *
    * * *
    * *  * *
    
    
    *  */


// public class pattern{
//     public static void main(String args[]){
//         for(int line=1 ; line<=4 ; line++){
//             for(int star=1; star<=line; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
            
//         }
//     }
// }


//print INVERTED -STAR PATTERN

// public class pattern{
//     public static void main(String args[]){
//         for(int line=1; line<=4 ; line++){
//             for(int star=1 ; star<=4-line+1; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//PRINT HALF-PYRAMID PATTERN
// public class pattern{
//     public static void main(String args[]){
//         int n=4;
//         for(int line=1; line<=n; line++){
//             for(int number=1 ; number<=line ; number++){
//                 System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern{
//     public static void main(String args[]){
//         int n=4;
//         char ch='A';
//         for(int line=1; line<=n ; line++){
//             for(int column=1; column<=line ; column++){
//                 System.out.print(ch++);
//             }
//             System.out.println();
//         }
//     }
// }


/// PRINT HOLLOW RECTANGLE PATTERN
// public class pattern{
//     public static void Hollow_Pattern(int rows ,  int cols){
//         //outer loop
//         for(int i=1; i<=rows; i++){
//             //inner loop
//             for(int j=1 ; j<=cols ; j++){
//                 if(i==1 || i==rows|| j==1 || j==cols ){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Hollow_Pattern(4,5);
//     }
// }

// public class pattern{
//     public static void Inverted_Pattern(int n ){
//         for(int i = 1 ; i<=n ; i++){
//             for(int j=1 ; j<=n; j++){
//                 System.out.print(" " * (n-i) + "*" * i );
//             }
//             System.out.println();
            
//         }
//     }
//     public static void main(String args[]){
//         Inverted_Pattern(4);
//     }
// } //cant write like this because it works only in python 


// public class pattern{
//     public static void Inverted_prism(int n ){
//         for (int i=1 ; i<=n; i++){
//             //spaces
//             for (int j=1 ; j<=n-i ; j++){
//                 System.out.print(" ");
//             }
//             //stars prinitng
//             for (int j=1 ; j<=i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
            
//         }
//     }    
//     public static void main(String args[]){
//         Inverted_prism(4);
//     }
// }

//inverted  half pyramid with numbbers

// public class pattern{
//     public static void inverted_half_pyramid_with_numbers(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1 ; j<=n-i+1 ; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();

//         }
//     }
//     public static void main(String args[]){
//         inverted_half_pyramid_with_numbers(5);
//     }
// }

//flyods triangle
/*
  1
  2 3
  4 5 6
  7 8 9 10
 11 12 13 14 15

*/

//algorithm
// int n=5; int counter=1
//for(int i=1 ; i<=n;i++){
// for (int j=1 ; j<=i ; j++)}
//counter-print 
// counter++

// public class pattern{
//     public static void Flyods(int n){
//         int counter=1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i ; j++){
//                 System.out.print(counter + " ");
//                 counter++;
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         Flyods(6);
//     }
// }

/*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

// public class pattern{
//     public static void zero_one_triangle(int n){
//         for (int i=1 ; i<=n ; i++){
//             for (int j=1 ; j<=i ; j++){
//                 if ((i+j)%2==0){
//                     System.out.print("1");
//                 } else {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
            
//         }
//     }
//     public static void main(String args[]){
//         zero_one_triangle(7);
//     }
// }

//BUTTERFLY PATTERN

// public class pattern{
//     public static void butterfly(int n){
//         //upper half
//         for(int i=1 ; i<=n ; i++){
//             //stars
//             for (int j=1; j<=i ; j++){
//                 System.out.print("*");
//             }
//             //spaces
//             for (int j=1 ; j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for (int j=1 ; j<=i ; j++){
//                 System.out.print("*");

//             }    
//             System.out.println();

//         }
//         //lower half
//         for (int i=n ; i>=1 ; i--){
//             //stars
//             for (int j=1; j<=i ; j++){
//                 System.out.print("*");
//             }
//             //spaces
//             for (int j=1 ; j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for (int j=1 ; j<=i ; j++){
//                 System.out.print("*");

//             } 
//             System.out.println();   
//         }
//     }

//     public static void main(String args[]){
//         butterfly(5);
    

//     }
// }


//SOLID RHOMBUS
// public class pattern{
//     public static void Solid_Rhombus(int n){
//         for(int i=1 ; i<=n;i++){
//             //spaces 
//             for(int j=1; j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         Solid_Rhombus(5);
//     }
// }

//HOLLOW RHOMBUS
/* 
n=5 outer loop for (int i=1 to 5)

line 
spaces + boundary rectangle

spcaes=n=i + hollow rectangle

*/
// public class pattern{
//     public static void hollow_rhombus(int n){
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1; j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             // hollow rectangle-stars
//             for (int j=1;j<=n;j++){
//                 if(i==1 || i==n|| j==1 || j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();

//         }
//     }
//     public static void main(String args[]){
//         hollow_rhombus(5);
//     }
// }

//diamond pattern
/*
      *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      * 






algorithm

outer 1 to n
what to print innerly
spaces + stars
i=1  ;  spaces = 3  ; star = 1
i=2  ; spaces = 2   ;  star = 3
i=3  ; spaces = 1   ; star=5
i=4  ; spaces = 0   ;  star= 7


SPACES = n-i
STARS= 2i-1;



*/


// public class pattern{
//     public static void diamond(int n){
//         //first half
//         for(int i=1 ; i<=n ; i++){
//             //spaces 
//             for(int j=1; j<=(n-i) ; j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for (int j=1 ; j<=((2*i)-1) ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         //second half
//         for(int i=n ; i>=1 ; i--){
//             //spaces 
//             for(int j=1; j<=(n-i) ; j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for (int j=1 ; j<=((2*i)-1) ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         diamond(5);
//     }
// }



//PALINDROMIC PATTERN

// public class pattern{
//     public static void PALINDROMIC(int n){
//         //outer loop
//         for(int i=1; i<=n ; i++){
//             //for spaces
//             for(int j=1 ; j<=n-i ;j++){
//                 System.out.print(" ");

//             }
//             //first half
//             for (int j=1; j<=i ; j++){
//                 System.out.print(j);

//             }
//             //second half
//             for (int j=i-1; j>=1 ; j--){
//                 System.out.print(j);

//             }
//             System.out.println();
//         }   
//     }
//     public static void main(String args[]){
//         PALINDROMIC(5);
//     }
// }

