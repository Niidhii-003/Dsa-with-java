import java.util.*;
// public class bitmanipulation{
//     public static void main(String args[]){
//         System.out.println((5 & 6));
//         System.out.println((5|6));
//         System.out.println((5^6));
//         System.out.println(~5);
//         System.out.println(5<<2);
//         System.out.println(6>>1);
//     }
// }

//CHECK IF A NUMBER IS ODD OR EVEN IN BITMANIPULATION

public class bitmanipulation{
    public static void OddOrEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[]){
        OddOrEven(3);
        OddOrEven(11);
        OddOrEven(6);
    }
}


//GET ith ELEMENT OF BITMANIPULATION
// public class bitmanipulation{
//     public static int getIthBit(int n, int i){
//         int bitMask=1<<i;
//         if((n & bitMask)==0){
//             return 0;
//         }else {
//             return 1;
//         }
//     }
//     public static void main(String args[]){
//         System.out.println(getIthBit(10 , 2));

//     }
// }


//SET ith ELEMENT IN MANIPULATION

// public class bitmanipulation{
//     public static int setIthBit(int n , int i){
//         int bitMask=1<<i;
//         return n | bitMask;
//     }
//     public static void main(String args[]){
//         System.out.println(setIthBit(10,2));
//     }
// }


// public class bitmanipulation{
//     public static int clearIthBit(int n , int i){
//         int bitMask=~(1<<i);
//         return n & bitMask;
//     }
//     public static void main(String args[]){
//         System.out.println(clearIthBit(10,2));
//     }
// }




// public class bitmanipulation{
    
//     public static int clearIthBit(int n , int i){
//         int bitMask=~(1<<i);
//         return n & bitMask;
//     }
//      public static int setIthBit(int n , int i){
//         int bitMask=1<<i;
//         return n | bitMask;
//     }
    
//     public static int updateIthBit(int n , int i , int newbit){
//         // if(newbit==0){
//         //     return clearIthBit(n, i);
//         // }else{
//         //     return setIthBit(n , i);
//         // }

//         ///or
//         n=clearIthBit(n,i);
//         int bitMask=newbit<<i;
//         return n | bitMask;

//     }
//     public static void main(String args[]){
//         System.out.println(updateIthBit(10 , 2, 1));

//     }
// }


///CLEAR BY I DIGIT

// public class bitmanipulation{
//     public static int clearbyIthBit(int n , int i){
//         int bitMask=(~0)<<i;
//         return n & bitMask;
//     }
//     public static void main(String args[]){
//         System.out.println(clearbyIthBit(15,2));
//     }
// }


///CLEAR RANGE OF BITS
// public class bitmanipulation{
//     public static int clearbitsinrange(int n , int i, int j){
//         int a=((~0)<<(j+1));
//         int b=(1<<i)-1;
//         int bitMask=a|b;
//         return n & bitMask;
//     }
//     public static void main(String args[]){
//         System.out.println(clearbitsinrange(10 , 2, 4));
//     }
// }


// public class bitmanipulation{
//     public static boolean isPowerOfTwo(int n){
//         return (n&(n-1))==0;
//     }
//     public static void main(String args[]){
//         System.out.println(isPowerOfTwo(15));
//     }
// }

//COUNT SET BITS
// public class bitmanipulation{
//     public static int countsetbits(int n){
//         int count=0;
//         while(n>0){
//             if((n & 1)!=0){
//                 count++;
//             }
//             n=n>>1;
//         }
//         return count;
//     }
//     public static void main(String args[]){
//         System.out.println(countsetbits(10));
//     }
// }

//FAST EXPONENTIATION

// public class bitmanipulation{
//     public static int fastExponentiation(int a , int n){
//         int ans=1;
//         while(n>0){
//             if((n & 1)!=0 ){ //check lsb
//                 ans=ans*a;

//             }
//             a=a*a;
//             n=n>>1;
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//         System.out.println(fastExponentiation(3,5));
//     }
// }